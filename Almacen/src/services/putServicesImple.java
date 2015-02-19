package services;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import bus.Companies;
import bus.Vehicles;

/**
 * Clase para la implementacion de los servicios put
 * @author David Díaz
 * @version 1.0
 * @created 16-feb-2015 6:49:58
 */
@Path("/rest")
public class putServicesImple implements putServicesInter{
	
	/**
	 * Servicio que almacena una compañia
	 * @param nameCompany String Nombre de la compañia
	 */
	@PUT
	@Path("/saveCompany")
	@Override
	public void putCompany(@QueryParam("nameCompany") String nameCompany){
		System.out.println("PETICION COMAPAÑIA");
		Companies companies = new Companies();
		companies.saveCompany(nameCompany);
	}
	
	/**
	 * Servicio que almacena un vehículo
	 * @param numberPlate String Número de la matrícula
	 */
	@PUT
	@Path("/saveVehicle")
	@Override
	public void putVehicle(@QueryParam("numberPlate") String numberPlate) {
		System.out.println("PETICIÓN VIHÍCULO");
		Vehicles vehicles = new Vehicles();
		vehicles.saveVehicle(numberPlate);
	}

}
