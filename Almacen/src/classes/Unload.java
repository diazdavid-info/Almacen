package classes;

import java.util.ArrayList;
import java.util.List;


/**
 * Clase descarga
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:58
 */
public class Unload {

	/**
	 * Empresa que realiza la descarga
	 */
	private Company mCompany;
	/**
	 * Fecha de la descarga
	 */
	private String mDate;
	/**
	 * Conductor que realiza la descarga
	 */
	private Person mDriver;
	/**
	 * ID de la descarga
	 */
	private int mId;
	/**
	 * ArrayList con los productos de la descarga
	 */
	private List<Product> mProducts;
	/**
	 * Hora de la descarga
	 */
	private String mTime;
	/**
	 * Vehiculo que realiza la descarga
	 */
	private Vehicle mVehicle;

	public Unload(){

	}

	public void finalize() throws Throwable {
		this.mCompany = null;
		this.mDate = null;
		this.mDriver = null;
		this.mProducts = null;
		this.mTime = null;
		this.mVehicle = null;
	}

	/**
	 * Devuelve la empresa que realiza la descarga
	 * @return Company
	 */
	public Company getCompany(){
		return mCompany;
	}

	/**
	 * Devuelve la fecha de la descarga
	 * @return String
	 */
	public String getDate(){
		return mDate;
	}

	/**
	 * Devuelve el conductor que realiza la descarga
	 * @return Person
	 */
	public Person getDriver(){
		return mDriver;
	}

	/**
	 * Devuelve el ID de la descarga
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve un ArrayList con los productos de la descarga
	 * @return ArrayList
	 */
	public List<Product> getProducts(){
		return mProducts;
	}

	/**
	 * Devuelve la hora de la descarga
	 * @return String
	 */
	public String getTime(){
		return mTime;
	}

	/**
	 * Devuelve el vehiculo que realiza la descarga
	 * @return Vehicle
	 */
	public Vehicle getVehicle(){
		return mVehicle;
	}

	/**
	 * Configura la empresa que realiza la descarga
	 * @param company Company
	 */
	public void setCompany(Company company){
		mCompany = company;
	}

	/**
	 * Configura la fecha de la descarga
	 * @param date String
	 */
	public void setDate(String date){
		mDate = date;
	}

	/**
	 * Configura el conductor que realiza la descarga
	 * @param driver Person
	 */
	public void setDriver(Person driver){
		mDriver = driver;
	}

	/**
	 * Configura el ID de la descarga
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el ArrayList con los pedidos de la descarga
	 * @param orders ArrayList
	 */
	public void setProduts(ArrayList<Product> products){
		mProducts = products;
	}

	/**
	 * Configura la hora de la descarga
	 * @param time String
	 */
	public void setTime(String time){
		mTime = time;
	}

	/**
	 * Configura el vehiculo que realiza la descarga
	 * @param vehicle Vehicle
	 */
	public void setVehicle(Vehicle vehicle){
		mVehicle = vehicle;
	}

}