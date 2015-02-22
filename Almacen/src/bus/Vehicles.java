package bus;

import hibernate.HibernateUtils;
import hibernate.SessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import classes.Vehicle;

import com.google.gson.Gson;

public class Vehicles {
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
	 * Método que devuelve todos los vehículos
	 * @return String
	 */
	@SuppressWarnings("unchecked")
	public String allVehicles(){
		createSession();
		query = session.createQuery("from Vehicle");
		List<Vehicle> list = query.list();
		List<Vehicle> list2 = new ArrayList<Vehicle>();
		for (Vehicle vechicle : list) {
			list2.add(HibernateUtils.initializeAndUnproxy(vechicle));
		}
		session.flush();
		session.close();
		Gson gson = new Gson();
		return gson.toJson(list2);
	}
	
	/**
	 * Método que guarda un vehículo
	 * @param numberPlate String Número de matrícula
	 */
	public void saveVehicle(String numberPlate){
		System.out.println("NÚMERO MATRICULA: "+numberPlate);
		createSessionTransation();
		Vehicle vehicle = new Vehicle();
		vehicle.setNumberPlate(numberPlate);
		session.save(vehicle);
		System.out.println("ID: "+vehicle.getId());
		tx.commit();
	}
}
