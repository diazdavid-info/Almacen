package services;

/**
 * Interfaz para los servicios put
 * @author David Díaz
 * @version 1.0
 * @created 16-feb-2015 6:49:58
 */
public interface putServicesInter {

	/**
	 * Servicio que almacena una compañia
	 * @param nameCompany String Nombre de la compañia
	 */
	public void putCompany(String nameCompany);
	
	/**
	 * Servicio que almacena un vehículo
	 * @param numberPlate String Número de la matrícula
	 */
	public void putVehicle(String numberPlate);
}
