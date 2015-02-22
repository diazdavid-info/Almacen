package classes;


/**
 * Clase fabricante
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:49
 */
public class Manufacturer {

	/**
	 * ID del fabricante
	 */
	private int mId;
	/**
	 * Nombre del fabricante
	 */
	private String mName;

	public Manufacturer(){}
	
	public Manufacturer(String name){
		mName = name;
	}

	public void finalize() throws Throwable {
		this.mName = null;
	}

	/**
	 * Devuelve el ID del fabricante
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve el nombre del fabricante
	 * @return String
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Configura el ID del fabricante
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el Nombre del fabricante
	 * @param name String
	 */
	public void setName(String name){
		mName = name;
	}

}