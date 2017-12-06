package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import bean.CityBean;
import bean.UserBean;

public class CityDAO {

	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;

	public boolean addCity(String cityName) {

		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();

			CityBean cityBean = new CityBean();
			cityBean.setCityName(cityName);

			session.save(cityBean);
			session.getTransaction().commit();
			System.out.println("\n\n Details Added \n");
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}
	public List<CityBean> listCity() {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();

			Query<CityBean> query = session.createQuery("from CityBean");
			List<CityBean> city = query.getResultList();
			session.getTransaction().commit();
			return city;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception");
		}
		return null;
	}

}
