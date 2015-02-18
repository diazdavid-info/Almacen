package bus;

import hibernate.HibernateUtils;
import hibernate.SessionFactoryUtil;

import java.util.ArrayList;
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
	
	@SuppressWarnings("unchecked")
	public String allPersons(){
		createSession();
		query = session.createQuery("from Person");
		List<Person> list = query.list();
		List<Person> list2 = new ArrayList<Person>();
		for (Person person : list) {
			list2.add(HibernateUtils.initializeAndUnproxy(person));
		}
		Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, new PersonSerializer()).create();
		return gson.toJson(list2);
	}
	
}
