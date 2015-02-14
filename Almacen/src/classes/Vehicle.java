package classes;

/**
 * Clase vehiculo
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:44
 */
public class Vehicle {

	/**
	 * ID del vehículo
	 */
	private int mId;
	/**
	 * Número de la matrícula del vehículo
	 */
	private String mNumberPlate;

	public Vehicle(){

	}

	public void finalize() throws Throwable {
		this.mNumberPlate = null;
	}

	/**
	 * Devuelve el ID del vehículo
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve el número de la matrícula del vehículo
	 * @return String
	 */
	public String getNumberPlate(){
		return mNumberPlate;
	}

	/**
	 * Configura el ID del vehículo
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el número de la matrícula del vehículo
	 * @param numberPlate String
	 */
	public void setNumberPlate(String numberPlate){
		mNumberPlate = numberPlate;
	}

}