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
	 * Servicio que devuelve todos los vehiculos
	 * @return String
	 */
	public String getVehicles();
	
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

}
