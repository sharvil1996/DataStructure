package DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Bean.Country;

public class CountryDAO {

	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;

	public boolean addcountry(String countryName) {
		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			System.out.println("Hi");
			Country country = new Country();
			country.setCountryId("1");
			country.setCountryName("INDIA");
			session.save(country);
			session.getTransaction().commit();
			System.out.println("\n\n Details Added \n");
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}

	public List<Country> listCountry() {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();

			Query<Country> query = session.createQuery("from Country");
			List<Country> country = query.getResultList();
			session.getTransaction().commit();
			return country;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception");
		}
		return null;
	}

}
