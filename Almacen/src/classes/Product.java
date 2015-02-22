package classes;


/**
 * Clase producto
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:54
 */
public class Product {

	/**
	 * Código ASIN del producto
	 */
	private String mCodeAsin;
	/**
	 * Código EAN del producto
	 */
	private String mCodeEan;
	/**
	 * Descripción del producto
	 */
	private String mDescription;
	/**
	 * ID del producto
	 */
	private int mId;
	/**
	 * Fabricante del producto
	 */
	private Manufacturer mManufacturer;
	/**
	 * Ancho del producto
	 */
	private Measure mWidth;
	/**
	 * Alto del producto
	 */
	private Measure mHigh;
	/**
	 * Largo del producto
	 */
	private Measure mLong;
	/**
	 * Modelo del producto
	 */
	private String mModel;
	/**
	 * Precio del producto
	 */
	private Float mPrice;
	/**
	 * Peso del producto
	 */
	private Float mWeight;

	public Product(){
		
	}
	
	public Product(String codeAsis, String codeEan, String description, String model, Float price, Float weight, Measure width, Measure high, Measure lon){
		//mMeasure = new ArrayList<Measure>();
		mCodeAsin = codeAsis;
		mCodeEan = codeEan;
		mDescription = description;
		mModel = model;
		mPrice = price;
		mWeight = weight;
		mWidth = width;
		mHigh = high;
		mLong = lon;
	}

	public void finalize() throws Throwable {
		this.mCodeAsin = null;
		this.mCodeEan = null;
		this.mDescription = null;
		this.mManufacturer = null;
		this.mModel = null;
		this.mPrice = null;
		this.mWeight = null;
	}

	/**
	 * Devuelve el código ASIN del producto
	 * @return String
	 */
	public String getCodeAsin(){
		return mCodeAsin;
	}

	/**
	 * Devuelve el código EAN del producto
	 * @return String
	 */
	public String getCodeEan(){
		return mCodeEan;
	}

	/**
	 * Devuelve la descripción del producto
	 * @return String
	 */
	public String getDescription(){
		return mDescription;
	}

	/**
	 * Devuelve el ID del producto
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve el fabricante del producto
	 * @return Manufacturer
	 */
	public Manufacturer getManufacturer(){
		return mManufacturer;
	}

	/**
	 * Devuelve el modelo del producto
	 * @return String
	 */
	public String getModel(){
		return mModel;
	}

	/**
	 * Devuelve el precio del producto
	 * @return Float
	 */
	public Float getPrice(){
		return mPrice;
	}

	/**
	 * Devuelve el peso del producto
	 * @return Float
	 */
	public Float getWeight(){
		return mWeight;
	}
	
	/**
	 * Devuelve el ancho del producto
	 * @return Measure
	 */
	public Measure getWidth(){
		return mWidth;
	}
	
	/**
	 * Devuelve el alto del producto
	 * @return Measure
	 */
	public Measure getHigh(){
		return mHigh;
	}
	
	/**
	 * Devuelve el largo del producto
	 * @return Measure
	 */
	public Measure getLong(){
		return mLong;
	}

	/**
	 * Configura el código ASIN del producto
	 * @param code String
	 */
	public void setCodeAsin(String code){
		mCodeAsin = code;
	}

	/**
	 * Configura el código EAN del producto
	 * @param code String
	 */
	public void setCodeEan(String code){
		mCodeEan = code;
	}

	/**
	 * Configura la descripción del producto
	 * @param description String
	 */
	public void setDescription(String description){
		mDescription = description;
	}

	/**
	 * Configura el ID del producto
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el fabricante del producto
	 * @param manufacturer Manufacturer
	 */
	public void setManufacturer(Manufacturer manufacturer){
		mManufacturer = manufacturer;
	}

	/**
	 * Configura el modelo del producto
	 * @param model String
	 */
	public void setModel(String model){
		mModel = model;
	}

	/**
	 * Configura el precio del producto
	 * @param price Float
	 */
	public void setPrice(Float price){
		mPrice = price;
	}

	/**
	 * Configura el peso del producto
	 * @param weight Float
	 */
	public void setWeight(Float weight){
		mWeight = weight;
	}
	
	/**
	 * Configura el ancho del producto
	 * @param width Measure
	 */
	public void setWidth(Measure width){
		mWidth = width;
	}
	
	/**
	 * Configura el alto del producto
	 * @param high Measure
	 */
	public void setHigh(Measure high){
		mHigh = high;
	}
	
	/**
	 * Configura el largo del producto
	 * @param lon Measure
	 */
	public void setLong(Measure lon){
		mLong = lon;
	}
}