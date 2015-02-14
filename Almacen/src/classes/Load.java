package classes;

import java.util.ArrayList;


/**
 * Clase carga
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:41
 */
public class Load {

	/**
	 * Compañia que realiza la carga
	 */
	private Company mCompany;
	/**
	 * Fecha de la carga
	 */
	private String mDate;
	/**
	 * Conductor de la carga
	 */
	private Person mDriver;
	/**
	 * ID de la carga
	 */
	private int mId;
	/**
	 * Listado de carga
	 */
	private ArrayList<Order> mOrders;
	/**
	 * Hora de la carga
	 */
	private String mTime;
	/**
	 * Vehículo de la carga
	 */
	private Vehicle mVehicle;

	public Load(){

	}

	public void finalize() throws Throwable {
		this.mCompany = null;
		this.mDate = null;
		this.mDriver = null;
		this.mOrders = null;
		this.mTime = null;
		this.mVehicle = null;
	}

	/**
	 * Devuelve la compañia que realiza la carga
	 * @return Company
	 */
	public Company getCompany(){
		return mCompany;
	}

	/**
	 * Devuelve la fecha de la carga
	 * @return String
	 */
	public String getDate(){
		return mDate;
	}

	/**
	 * Devuelve el conductor de la carga
	 * @return Person
	 */
	public Person getDriver(){
		return mDriver;
	}

	/**
	 * Devuelve el ID de la carga
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve el listado de pedidos
	 * @return ArrayList
	 */
	public ArrayList<Order> getOrders(){
		return mOrders;
	}

	/**
	 * Devuelve la hora de la carga
	 * @return String
	 */
	public String getTime(){
		return mTime;
	}

	/**
	 * Devuelve el vehículo de la carga
	 * @return Vehicle
	 */
	public Vehicle getVehicle(){
		return mVehicle;
	}

	/**
	 * Configura la compañia que realiza la carga
	 * @param company Company
	 */
	public void setCompany(Company company){
		mCompany = company;
	}

	/**
	 * Configura la fecha de la carga
	 * @param date String
	 */
	public void setDate(String date){
		mDate = date;
	}

	/**
	 * Configura el conductor de la carga
	 * @param driver Person
	 */
	public void setDriver(Person driver){
		mDriver = driver;
	}

	/**
	 * Configura el ID de la carga
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el listado de pedidos
	 * @param orders ArrayList
	 */
	public void setOrders(ArrayList<Order> orders){
		mOrders = orders;
	}

	/**
	 * Configura la hora de la carga
	 * @param time String
	 */
	public void setTime(String time){
		mTime = time;
	}

	/**
	 * Configura el vehículo de la carga
	 * @param vehicle Vehicle
	 */
	public void setVehicle(Vehicle vehicle){
		mVehicle = vehicle;
	}

}