package bus;

import hibernate.SessionFactoryUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import tools.registerAdapter.PersonSerializer;
import classes.Address;
import classes.Person;
import classes.TypePerson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persons {
	
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
		String result = gson.toJson(list);
		session.close();
		session = null;
		return result;
	}
	
	/**
	 * Método que devuelve todas las personas que son trabajadores
	 * @return String
	 */
	@SuppressWarnings("unchecked")
	public String allWorkers(){
		createSession();
		query = session.createQuery("from Person as p where p.mTypePerson in (from TypePerson t where t.mType = 'Trabajador')");
		List<Person> list = query.list();
		Gson gson = new GsonBuilder().registerTypeAdapter(Person.class, new PersonSerializer()).create();
		String result = gson.toJson(list);
		session.close();
		session = null;
		return result;
	}
	
	/**
	 * Método que añade un conductor
	 * @param nameDriver String
	 * @param surnameDriver String
	 * @param telephone String
	 * @param idAddress int
	 */
	public void saveDriver(String nameDriver, String surnameDriver, String telephone, int idAddress){
		createSessionTransation();
		Address address = (Address) session.load(Address.class, idAddress);
		TypePerson typePerson = new TypePerson("Conductor", "Conductor");
		session.save(typePerson);
		Person person = new Person();
		person.setName(nameDriver);
		person.setSurname(surnameDriver);
		person.setTelefoneNumber(telephone);
		person.setAddress(address);
		person.setTypePerson(typePerson);
		session.save(person);
		tx.commit();
		session.close();
		session = null;
	}
	
	/**
	 * Método que añade un trabajador
	 * @param nameDriver String
	 * @param surnameDriver String
	 * @param telephone String
	 * @param idAddress int
	 */
	public void saveWorker(String nameWorker, String surnameWorker, String telephone, int idAddress){
		createSessionTransation();
		Address address = (Address) session.load(Address.class, idAddress);
		TypePerson typePerson = new TypePerson("Trabajador", "Trabajador");
		session.save(typePerson);
		Person person = new Person();
		person.setName(nameWorker);
		person.setSurname(surnameWorker);
		person.setTelefoneNumber(telephone);
		person.setAddress(address);
		person.setTypePerson(typePerson);
		session.save(person);
		tx.commit();
		session.close();
		session = null;
	}
	
	public String saveClient(String nameClient, String surnameClient, String telephone, int idAddress){
		createSessionTransation();
		Address address = (Address) session.load(Address.class, idAddress);
		TypePerson typePerson = new TypePerson("Cliente", "Cliente");
		session.save(typePerson);
		Person person = new Person();
		person.setName(nameClient);
		person.setSurname(surnameClient);
		person.setTelefoneNumber(telephone);
		person.setAddress(address);
		person.setTypePerson(typePerson);
		session.save(person);
		tx.commit();
		session.close();
		session = null;
		return String.valueOf(person.getId());
	}
	
}
