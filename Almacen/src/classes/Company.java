package classes;

/**
 * Clase empresa
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:57
 */
public class Company {

	/**
	 * ID de la empresa
	 */
	private int mId;
	/**
	 * Nombre de la empresa
	 */
	private String mName;
	
	public Company(){

	}

	public void finalize() throws Throwable {
		this.mName = null;
	}

	/**
	 * Devuelve el ID de la empresa
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve el nombre de la empresa
	 * @return String
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Configura el ID de la empresa
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el nombre de la empresa
	 * @param name String
	 */
	public void setName(String name){
		mName = name;
	}

}