package services;

import hibernate.SessionFactoryUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import classes.Address;
import classes.Person;
import classes.TypePerson;
import classes.Vehicle;

public class DemoImplemet implements DemoInterfaz{

	@Override
	public String getSaluda(String nombre) {
		return "Hola "+nombre;
	}

	@Override
	public void addVehicle(String numberPlate) {
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Inserto una fila");
		
		Vehicle vehiculo = new Vehicle();
		vehiculo.setNumberPlate(numberPlate);
		session.save(vehiculo);
		tx.commit();
		session.close();
	}

	@Override
	public void addPerson(String namePerson, String type, String locality) {
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Inserto una fila");
		
		TypePerson typePerson = new TypePerson();
		typePerson.setType(type);
		
		session.save(typePerson);
		
		Address address = new Address();
		address.setLocality(locality);
		
		session.save(address);
		
		Person person = new Person();
		person.setAddress(address);
		person.setTypePerson(typePerson);
		person.setName(namePerson);
		
		session.save(person);
		tx.commit();
		session.close();
		
	}

	@Override
	public Person getPerson(int id) {
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		
		Person person = new Person();
		
		person = (Person) session.load(Person.class, id);
		
		
		
		return person;
	}

}
