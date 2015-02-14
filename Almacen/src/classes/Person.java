package classes;

/**
 * Clase Persona
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:52
 */
public class Person {

	/**
	 * Dirección de la persona
	 */
	private Address mAddress;
	/**
	 * ID de la persona
	 */
	private int mId;
	/**
	 * Nombre de la persona
	 */
	private String mName;
	/**
	 * Apellido de la persona
	 */
	private String mSurname;
	/**
	 * Número de teléfono de la persona
	 */
	private String mTelefoneNumber;
	/**
	 * Tipo de persona
	 */
	private TypePerson mTypePerson;
	
	public Person(){

	}

	public void finalize() throws Throwable {
		this.mAddress = null;
		this.mName = null;
		this.mSurname = null;
		this.mTelefoneNumber = null;
		this.mTypePerson = null;
	}

	/**
	 * Devuelve la dirección de la persona
	 * @return Address
	 */
	public Address getAddress(){
		return mAddress;
	}

	/**
	 * Devuelve el ID de la persona
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve el nombre de la persona
	 * @return String
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Devuelve el apellido de la persona
	 * @return String
	 */
	public String getSurname(){
		return mSurname;
	}

	/**
	 * Devuelve el Número de teléfono de la persona
	 * @return String
	 */
	public String getTelefoneNumber(){
		return mTelefoneNumber;
	}

	/**
	 * Devuelve el tipo de persona
	 * @return TypePerson
	 */
	public TypePerson getTypePerson(){
		return mTypePerson;
	}

	/**
	 * Configura la dirección de la persona
	 * @param address Address
	 */
	public void setAddress(Address address){
		mAddress = address;
	}

	/**
	 * Configura el ID de la persona
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el nombre de la persona
	 * @param name String
	 */
	public void setName(String name){
		mName = name;
	}

	/**
	 * Configura el apellido de la persona
	 * @param surname String
	 */
	public void setSurname(String surname){
		mSurname = surname;
	}

	/**
	 * Configura el número de teléfono de la persona
	 * @param number String
	 */
	public void setTelefoneNumber(String number){
		mTelefoneNumber = number;
	}

	/**
	 * COnfigura el tipo de persona
	 * @param type TypePerson
	 */
	public void setTypePerson(TypePerson type){
		mTypePerson = type;
	}

}