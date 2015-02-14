package classes;


/**
 * Clase ubicación
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:51:00
 */
public class Situation {

	/**
	 * Descripción de la ubicación
	 */
	private String mDescription;
	/**
	 * ID de la ubicación
	 */
	private int mId;

	public Situation(){

	}

	public void finalize() throws Throwable {
		this.mDescription = null;
	}

	/**
	 * Devuelve la descripción de la ubicación
	 * @return String
	 */
	public String getDescription(){
		return mDescription;
	}

	/**
	 * Devuelve el ID de la ubicación
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Configura la descripción de la ubicación
	 * @param decription String
	 */
	public void setDescription(String description){
		mDescription = description;
	}

	/**
	 * Configura el ID de la ubicación
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

}