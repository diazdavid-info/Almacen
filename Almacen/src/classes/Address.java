package classes;


/**
 * Clase dirección
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:48
 */
public class Address {

	/**
	 * Bloque de la dirección
	 */
	private String mBlock;
	/**
	 * Puerta de la dirección
	 */
	private String mDoor;
	/**
	 * Piso de la dirección
	 */
	private int mFloor;
	/**
	 * ID de la Dirección
	 */
	private int mId;
	/**
	 * Localidad de la dirección
	 */
	private String mLocality;
	/**
	 * Nombre de la via de la dirección
	 */
	private String mNameVia;
	/**
	 * Número de la dirección
	 */
	private int mNumber;
	/**
	 * Provincia de la dirección
	 */
	private String mProvince;
	/**
	 * Escalera de la dirección
	 */
	private String mStairs;
	/**
	 * Tipo de via de la dirección
	 */
	private String mTypeVia;
	
	
	//public Person m_Person;

	public Address(){}
	
	public Address(String block, String door, int floor, String locality, String nameVia, int number, String province, 
			String stairs, String typeVia){
		mBlock = block;
		mDoor = door;
		mLocality = locality;
		mNameVia = nameVia;
		mNumber = number;
		mProvince = province;
		mStairs = stairs;
		mTypeVia = typeVia;
	}

	public void finalize() throws Throwable {
		this.mBlock = null;
		this.mDoor = null;
		this.mLocality = null;
		this.mNameVia = null;
		this.mProvince = null;
		this.mStairs = null;
		this.mTypeVia = null;
	}

	/**
	 * Devuelve el bloque de la dirección
	 * @return String
	 */
	public String getBlock(){
		return mBlock;
	}

	/**
	 * Devuelve la puerta de la dirección
	 * @return String
	 */
	public String getDoor(){
		return mDoor;
	}

	/**
	 * Devuelve la planta de la dirección
	 * @return int
	 */
	public int getFloor(){
		return mFloor;
	}

	/**
	 * Devuelve el ID de la dirección
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve la localidad de la dirección
	 * @return String
	 */
	public String getLocality(){
		return mLocality;
	}

	/**
	 * Devuelve el nombre de la via
	 * @return String
	 */
	public String getNameVia(){
		return mNameVia;
	}

	/**
	 * Devuelve el número de la dirección
	 * @return int
	 */
	public int getNumber(){
		return mNumber;
	}

	/**
	 * Devuelve la provincia de la dirección
	 * @return String
	 */
	public String getProvince(){
		return mProvince;
	}

	/**
	 * Devuelve la escalera de la dirección
	 * @return String
	 */
	public String getStairs(){
		return mStairs;
	}

	/**
	 * Devuelve el tipo de via de la dirección
	 * @return String
	 */
	public String getTypeVia(){
		return mTypeVia;
	}

	/**
	 * Configura el atributo bloque
	 * @param block String
	 */
	public void setBlock(String block){
		mBlock = block;
	}

	/**
	 * Configura el atributo puerta
	 * @param door String
	 */
	public void setDoor(String door){
		mDoor = door;
	}

	/**
	 * Configura el atributo piso
	 * @param floor int
	 */
	public void setFloor(int floor){
		mFloor = floor;
	}

	/**
	 * Configura el atributo ID
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el atributo localidad
	 * @param locality String
	 */
	public void setLocality(String locality){
		mLocality = locality;
	}

	/**
	 * Configura el atributo que indica el nombre de la via
	 * @param nameVia String
	 */
	public void setNameVia(String nameVia){
		mNameVia = nameVia;
	}

	/**
	 * Configura el atributo número de la via
	 * @param number int
	 */
	public void setNumber(int number){
		mNumber = number;
	}

	/**
	 * Configura el atributo provincia
	 * @param province
	 */
	public void setProvince(String province){
		mProvince = province;
	}

	/**
	 * Configura el atributo escalera
	 * @param stairs String
	 */
	public void setStairs(String stairs){
		mStairs = stairs;
	}

	/**
	 * Configura el atributo tipo de via
	 * @param typeVia String
	 */
	public void setTypeVia(String typeVia){
		mTypeVia = typeVia;
	}

}