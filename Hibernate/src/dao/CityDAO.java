package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import bean.CityBean;
import bean.StateBean;

public class CityDAO {

	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;

	public boolean addCity(String cityName, int stateId) {

		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();

			CityBean cityBean = new CityBean();
			cityBean.setCityName(cityName);

			StateBean bean = new StateBean();
			bean.setStateId(stateId);
			cityBean.setState(bean);

			session.save(cityBean);
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}

	public String listCity(int stateId) {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			String retval = "";
			Query<CityBean> query = session.createQuery("from CityBean where stateId=" + stateId);
			List<CityBean> city = query.getResultList();
			session.getTransaction().commit();
			for (int i = 0; i < city.size(); i++) {
				retval += city.get(i).getCityId() + "," + city.get(i).getCityName() + "|";
			}
			retval = retval.substring(0, retval.length() - 1);
			return retval;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception");
			return null;
		}
	}

	public CityBean getBYPK(int cityId) {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			System.out.println("HI");
			Query<CityBean> query = session.createQuery("from CityBean where cityId=" + cityId);
			CityBean bean = query.getSingleResult();
			return bean;
		} catch (HibernateException e) {
			System.out.println();
			return null;
		}

	}

	public String updateCity(int cityId, String cityName) {

		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			CityBean bean = session.get(CityBean.class, cityId);
			bean.setCityName(cityName);
			session.update(bean);
			session.getTransaction().commit();

			return "1";
		} catch (HibernateException e) {
			return "0";
		}

	}

	public String deleteCity(int cityId) {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			CityBean bean = session.get(CityBean.class, cityId);
			session.delete(bean);
			session.getTransaction().commit();

			return "1";
		} catch (HibernateException e) {
			return "0";
		}

	}
}
