package bus;

import hibernate.SessionFactoryUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import classes.Company;
import classes.Load;
import classes.LogJobs;
import classes.Order;
import classes.Person;
import classes.Vehicle;

public class Loads {

	SessionFactory sesion;
	Session session;
	Query query;
	Transaction tx;
	
	/**
	 * Método que inicializa los objetos necesarios para trabajar con Hibernate.
	 * Este método solo inicializa los objetos para pedir objetos.
	 */
	private void createSession(){
		sesion = SessionFactoryUtil.getSessionFactory();
		session = sesion.openSession();
	}
	
	/**
	 * Método que inicializa los objetos necesarios para trabajar con Hibernate.
	 * Este método inicializa los objetos para realizar una transación
	 */
	private void createSessionTransation(){
		createSession();
		tx = session.beginTransaction();
	}
	
	/**
	 * Método que almacena una descarga
	 * @param idCompany int
	 * @param idDriver int
	 * @param idVehicle int
	 * @param date String
	 * @param time String
	 * @param idWorker int
	 * @return String
	 */
	public String saveLoad(int idCompany, int idDriver, int idVehicle, String date, String time, int idWorker){
		createSessionTransation();
		Company company = (Company) session.load(Company.class, idCompany);
		Person driver = (Person) session.load(Person.class, idDriver);
		Vehicle vehicle = (Vehicle) session.load(Vehicle.class, idVehicle);
		Person worker = (Person) session.load(Person.class, idWorker);
		LogJobs log = new LogJobs(worker, "Carga");
		session.save(log);
		Load load = new Load(company, date, driver, time, vehicle);
		session.save(load);
		tx.commit();
		session.close();
		session = null;
		return String.valueOf(load.getId());
	}
	
	/**
	 * Método que asocia a la carga los pedidos
	 * @param load int
	 * @param order int
	 */
	public void saveLoadOrders(int idLoad, int idOrder){
		createSessionTransation();
		Order order = (Order) session.load(Order.class, idOrder);
		Load load = (Load) session.load(Load.class, idLoad);
		load.addOrder(order);
		session.saveOrUpdate(load);
		tx.commit();
		session.close();
		session = null;
		System.out.println("SAVE LOAD ORDERS");
	}
}
