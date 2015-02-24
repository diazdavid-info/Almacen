package bus;

import hibernate.SessionFactoryUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import classes.Company;
import classes.Person;
import classes.Product;
import classes.Unload;
import classes.Vehicle;

public class Downloads {

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
	public String saveDownload(int idCompany, int idDriver, int idVehicle, String date, String time, int idWorker){
		createSessionTransation();
		Company company = (Company) session.load(Company.class, idCompany);
		Person driver = (Person) session.load(Person.class, idDriver);
		Vehicle vehicle = (Vehicle) session.load(Vehicle.class, idVehicle);
		Person person = (Person) session.load(Person.class, idWorker);
		Unload unload = new Unload(company, date, driver, time, vehicle);
		session.save(unload);
		tx.commit();
		session.close();
		return String.valueOf(unload.getId());
	}
	
	/**
	 * Método que asocia un producto a una descarga
	 * @param idUnload int
	 * @param idProduct int
	 */
	public void saveDownloadProduct(int idUnload, int idProduct){
		createSessionTransation();
		Product product = (Product) session.load(Product.class, idProduct);
		System.out.println(product.getId());
		Unload unload = (Unload) session.load(Unload.class, idUnload);
		System.out.println(unload.getId());
		unload.addProduct(product);
		session.saveOrUpdate(unload);
		//session.close();
		tx.commit();
	}
}
