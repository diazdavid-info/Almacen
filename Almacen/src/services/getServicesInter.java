package services;


/**
 * Interfaz para los servicios get
 * @author David Díaz
 * @version 1.0
 * @created 16-feb-2015 6:49:58
 */
public interface getServicesInter {
	
	/**
	 * Servicio que devuelve todas las compañias.
	 * @return String
	 */
	public String getCompanies();
	
	/**
	 * Servicio que devuelve todas las personas que son conductores
	 * @return String
	 */
	public String getDrivers();
	
	/**
	 * Servicio que devuelve todas las personas que son trabajadores
	 * @return String
	 */
	public String getWorkers();
	
	/**
	 * Servicio que devuelve todos los vehiculos
	 * @return String
	 */
	public String getVehicles();
	
	/**
	 * Servicio que devuelve todas las ubicaciones
	 * @return String
	 */
	public String getShelves();
	
	/**
	 * Servicio que almacena un producto
	 * @param asinProduct String
	 * @param eanProduct String
	 * @param descriptionProduct String
	 * @param modelProduct String
	 * @param priceProduct Float
	 * @param weightProduct Float
	 * @param nameManufactureProduct String
	 * @param widthProduct Float
	 * @param highProduct Float
	 * @param longProduct Float
	 */
	public String saveProduct(String asinProduct, String eanProduct, String descriptionProduct, String modelProduct, Float priceProduct,
			Float weightProduct, String nameManufactureProduct, Float widthProduct, Float highProduct, Float longProduct);
	
	/**
	 * Servicio que almacena las descargas
	 * @param company int
	 * @param driver int
	 * @param vehicle int
	 * @param date String
	 * @param time String
	 * @param worker int
	 * @return String
	 */
	public String saveUnload(int company, int driver, int vehicle, String date, String time, int worker);
	
	/**
	 * Servicio que almacena una descarga
	 * @param company int
	 * @param driver int
	 * @param vehicle int
	 * @param date String
	 * @param time String
	 * @param worker int
	 * @return String
	 */
	public String saveLoad(int company, int driver, int vehicle, String date, String time, int worker);
	
	/**
	 * Servicio que almacena la asociación entre las descarga y el producto
	 * @param idUnload int
	 * @param idProduct int
	 */
	public void saveProductUnload(int idUnload, int idProduct);
	
	/**
	 * Servicio que almacena los pedidos
	 * @param date String
	 * @param person int
	 * @param price Float
	 * @return String
	 */
	public String saveOrders(String date, int person, Float price);
	
	/**
	 * Servicio que asocia a la carga los pedidos
	 * @param load int
	 * @param order int
	 */
	public void saveLoadOrders(int load, int order);
	
	/**
	 * Servicio que almacena un cliente
	 * @param name String
	 * @param surname String
	 * @param telephone String
	 * @param address int
	 * @return String
	 */
	public String saveClient(String name, String surname, String telephone, int address);
	
	/**
	 * Servicio que asocia los productos a la carga y da de baja los productos de las ubicaciones
	 * @param asin String
	 * @param order int
	 * @return String
	 */
	public String saveProductOrder(String asin, int order);
}
