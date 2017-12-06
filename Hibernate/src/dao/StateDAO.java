package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import bean.StateBean;

public class StateDAO {

	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;

	public boolean addState(String stateName) {

		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();

			StateBean stateBean = new StateBean();
			stateBean.setStateName(stateName);
			session.save(stateBean);
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}

	public List<StateBean> listState() {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			Query<StateBean> query = session.createQuery("from StateBean");
			List<StateBean> state = query.getResultList();
			session.getTransaction().commit();
			return state;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception");
			return null;
		}
	}

}
