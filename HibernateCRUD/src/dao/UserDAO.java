
package dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import bean.CityBean;
import bean.UserBean;

public class UserDAO {

	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;

	public boolean addUserDetails(String userName, String email, String phone, CityBean city) {

		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction x = session.beginTransaction();

			UserBean user = new UserBean();
			user.setUserName(userName);
			user.setCity(city);
			user.setUserEmailId(email);
			user.setUserPhoneNumber(phone);

			session.save(user);
			session.getTransaction().commit();
			System.out.println("\n\n Details Added \n");
			return true;
		} catch (HibernateException e) {
			System.out.println("Execption");
			return false;
		}

	}


	/*public List<UserBean> listUser() {
		try {

			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();

			Query query = session.createQuery(
					"select u.userName,u.userId,c.cityName from UserBean as u,CityBean as c where u.cityId=c.cityId");
			List user = query.getResultList();
			// session.getTransaction().commit();
			System.out.println(user.size());
			return user;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception");
		}
		return null;
	}
*/
	
	public boolean deleteUser(String userId) {
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction x = session.beginTransaction();

			Query<UserBean> query = session.createQuery("delete from UserBean where userId=" + userId);
			int result = query.executeUpdate();
			session.getTransaction().commit();
			if (result > 0) {
				System.out.println("Expensive products was removed");
				return true;
			}
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception");
		}
		return false;
	}

	public UserBean getByPK(String userId) {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();

			Query<UserBean> query = session.createQuery("from UserBean where userId=" + userId);
			UserBean user = query.getSingleResult();
			System.out.println(user.getUserName());
			return user;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception");
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public boolean updateUser(int userId, String userName, String email, String phone, String city) {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();

			Query<UserBean> query = session.createQuery(
					"update UserBean set userName=?,userEmailId=?,userCity=?,userPhoneNumber=? where userId=" + userId);
			query.setString(0, userName);
			query.setString(1, email);
			query.setString(2, city);
			query.setString(3, phone);

			int result = query.executeUpdate();
			session.getTransaction().commit();
			if (result > 0) {
				System.out.println("Expensive products was removed");
				return true;
			}
			return true;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception");
		}

		return false;
	}

	public List<UserBean> getUserList() {
		
		try{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Criteria users = session.createCriteria(UserBean.class);
		Criteria cities = users.createCriteria("city");
		List<UserBean> result = users.list();
		return result;
		}
		catch(HibernateException e){
			System.out.println("Ex");
		}
		return null;
	}

}
