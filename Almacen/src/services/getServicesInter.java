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

}
