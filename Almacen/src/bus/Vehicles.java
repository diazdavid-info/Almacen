package bus;

import hibernate.HibernateUtils;
import hibernate.SessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import classes.Vehicle;

import com.google.gson.Gson;

public class Vehicles {
	SessionFactory sesion;
	Session session;
	Query query;
	
	/**
	 * Método que inicializa los objetos necesarios para trabajar con Hibernate.
	 * Este método solo inicializa los objetos para pedir objetos.
	 */
	private void createSession(){
		sesion = SessionFactoryUtil.getSessionFactory();
		session = sesion.openSession();
	}
	
	@SuppressWarnings("unchecked")
	public String allVehicles(){
		createSession();
		query = session.createQuery("from Vehicle");
		List<Vehicle> list = query.list();
		List<Vehicle> list2 = new ArrayList<Vehicle>();
		for (Vehicle vechicle : list) {
			list2.add(HibernateUtils.initializeAndUnproxy(vechicle));
		}
		Gson gson = new Gson();
		return gson.toJson(list2);
	}
}
