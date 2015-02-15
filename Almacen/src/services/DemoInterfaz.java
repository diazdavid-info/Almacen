package services;

import classes.Person;

public interface DemoInterfaz {
	
	public String getSaluda(String nombre);
	
	public void addVehicle(String numberPlate);
	
	public void addPerson(String namePerson, String type, String locality);
	
	public Person getPerson(int id);
	
	public void descarga();
	
	public void addProduct();

}
