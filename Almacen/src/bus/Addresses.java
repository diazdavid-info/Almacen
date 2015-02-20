package bus;

import hibernate.SessionFactoryUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.google.gson.Gson;

import classes.Address;

public class Addresses {

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
	
	public String saveAddress(String block, String door, int floor, String locality, String nameVia, int number, String province, 
			String stairs, String typeVia){
		System.out.println("GUARDAR DIRECCIÓN");
		createSessionTransation();
		Address address = new Address(block, door, floor, locality, nameVia, number, province, stairs, typeVia);
		session.save(address);
		tx.commit();
		Gson gson = new Gson();
		return gson.toJson(address);
	}
}
