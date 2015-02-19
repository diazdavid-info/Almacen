package bus;

import hibernate.SessionFactoryUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import tools.registerAdapter.PersonSerializer;
import classes.Person;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persons {
	
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
	
	/**
	 * Metodo que devuelve todas las personas
	 * @return String
	 */
	@SuppressWarnings("unchecked")
	public String allPersons(){
		createSession();
		query = session.createQuery("from Person");
		List<Person> list = query.list();
		Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, new PersonSerializer()).create();
		return gson.toJson(list);
	}
	
	/**
	 * Método que devuelve todas las personas que sean conductores
	 * @return String
	 */
	@SuppressWarnings("unchecked")
	public String allDrivers(){
		createSession();
		query = session.createQuery("from Person as p where p.mTypePerson in (from TypePerson t where t.mType = 'Conductor')");
		List<Person> list = query.list();
		Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, new PersonSerializer()).create();
		return gson.toJson(list);
	}
	
}
