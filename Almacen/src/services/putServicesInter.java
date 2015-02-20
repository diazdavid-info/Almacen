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
	
	/**
	 * Servicio que almacena un conductor
	 * @param nameDriver String
	 * @param surnameDriver String
	 * @param telephone String
	 * @param idAddress int
	 */
	public void putDriver(String nameDriver, String surnameDriver, String telephone, int idAddress);
	
	/**
	 * Servicio que almacena la dirección y devuelve la entidad
	 * @param block String
	 * @param door String
	 * @param floor int
	 * @param locality String
	 * @param nameVia String
	 * @param number int
	 * @param province String
	 * @param stairs String
	 * @param typeVia String
	 * @return String
	 */
	public String putAddress(String block, String door, int floor, String locality, String nameVia, int number, 
			String province, String stairs, String typeVia);
}
