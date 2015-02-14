package classes;


/**
 * Clase tipo persona
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:55
 */
public class TypePerson {

	/**
	 * Descripción del tipo
	 */
	private String mDescription;
	/**
	 * ID del tipo de persona
	 */
	private int mId;
	/**
	 * Tipo de persona
	 */
	private String mType;

	public TypePerson(){

	}

	public void finalize() throws Throwable {
		this.mDescription = null;
		this.mType = null;
	}

	/**
	 * Devuelve la descripción del tipo
	 * @return String
	 */
	public String getDescription(){
		return mDescription;
	}

	/**
	 * Devuelve el ID del tipo de persona
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve el tipo de persona
	 * @return String
	 */
	public String getType(){
		return mType;
	}

	/**
	 * Configura la descripción del tipo
	 * @param description int
	 */
	public void setDescription(String description){
		mDescription = description;
	}

	/**
	 * Configura el ID del tipo de persona
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el tipo de persona
	 * 
	 * @param type String
	 */
	public void setType(String type){
		mType = type;
	}

}