import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		User user = new User();
		user.setUserId(1);
		user.setUserName("First User");

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		user.setVehicle(vehicle);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		
		session.save(user);
		session.getTransaction().commit();
	}

}
