package classes;


/**
 * Clase medidas
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:51
 */
public class Measure {

	/**
	 * ID del tipo de medida
	 */
	private int mId;
	/**
	 * Tipo de medida
	 */
	private String mType;
	/**
	 * Valor de la medida
	 */
	private Float mValue;

	public Measure(){}
	
	public Measure(String type, Float value){
		mType = type;
		mValue = value;
	}

	public void finalize() throws Throwable {
		this.mType = null;
	}

	/**
	 * Devuelve el ID del tipo de medida
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve el tipo de medida
	 * @return String
	 */
	public String getType(){
		return mType;
	}
	
	/**
	 * Devuelve el valor de la medida
	 * @return Float
	 */
	public Float getValue(){
		return mValue;
	}

	/**
	 * Configura el ID del tipo de medida
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el tipo de medida
	 * @param type String
	 */
	public void setType(String type){
		mType = type;
	}
	
	/**
	 * Configura el valor de la medida
	 * @param value Float
	 */
	public void setValue(Float value){
		mValue = value;
	}

}