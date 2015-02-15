package services;

import java.util.ArrayList;

import hibernate.SessionFactoryUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import classes.Address;
import classes.Company;
import classes.Manufacturer;
import classes.Measure;
import classes.Person;
import classes.Product;
import classes.Shelf;
import classes.Situation;
import classes.TypePerson;
import classes.Unload;
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

	@Override
	public void descarga() {
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Inserto una fila");
		
		Person person = new Person();
		person = (Person) session.load(Person.class, 3);
		
		System.out.println("OK");
		
		Vehicle vehicle = new Vehicle();
		vehicle = (Vehicle) session.load(Vehicle.class, 2);
		
		Company company = saveCompany();
		
		System.out.println("OK");
		
		Manufacturer manufacture = new Manufacturer();
		manufacture.setName("fabricante");
		session.save(manufacture);
		
		System.out.println("OK");
		
		Product product = new Product();
		product.setManufacturer(manufacture);
		product.setCodeAsin("1234567");
		
		session.save(product);
		
		System.out.println("OK");
		
		Measure measure = new Measure();
		measure.setType("Ancho");
		measure.setValue(new Float(2.3));
		session.save(measure);
		ArrayList<Measure> a = new ArrayList<Measure>();
		a.add(measure);
		
		System.out.println("OK");
		
		product.setMeasure(a);
		
		
		
		Situation situation = new Situation();
		situation.setDescription("Posicion 1");
		session.save(situation);
		
		System.out.println("OK");
		
		Shelf shelf = new Shelf();
		shelf.setProduct(product);
		shelf.setSituation(situation);
		session.save(shelf);
		
		System.out.println("OK");
		
//		Product product2 = new Product();
//		product2.setManufacturer(manufacture);
//		product2.setCodeAsin("1234589");
//		product2.setMeasure(a);
//		session.save(product2);
//		
//		Situation situation2 = new Situation();
//		situation2.setDescription("Posicion 2");
//		session.save(situation2);
//		
//		Shelf shelf2 = new Shelf();
//		shelf2.setProduct(product2);
//		shelf2.setSituation(situation2);
//		session.save(shelf2);
		
		ArrayList<Product> array = new ArrayList<Product>();
		array.add(product);
		//array.add(product2);
		
		Unload unload = new Unload();
		unload.setCompany(company);
		unload.setDriver(person);
		unload.setProduts(array);
		unload.setVehicle(vehicle);
		unload.setTime("21:46");
		session.save(unload);
		
		System.out.println("OK");
		
		tx.commit();
		session.close();
		session = null;
		sesion = null;
		System.out.println("FINALIZADO");
	}

	private Company saveCompany() {
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		Company company = new Company();
		company.setName("Compañia");
		session.save(company);
		tx.commit();
		session.close();
		session = null;
		sesion = null;
		return company;
	}

	@Override
	public void addProduct() {
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setName("Manu");
		session.save(manufacturer);
		
		Situation situation = new Situation();
		situation.setDescription("Posicion 5");
		session.save(situation);
		
		Product product = new Product();
		product.setManufacturer(manufacturer);
		product.setCodeAsin("askjda90");
		product.setDescription("Garbanzos");
		session.save(product);
		
		Shelf shelf = new Shelf();
		shelf.setProduct(product);
		shelf.setSituation(situation);
		session.save(shelf);
		
		tx.commit();
		sesion.close();
		System.out.println("TERMINADO");
		
	}

}
