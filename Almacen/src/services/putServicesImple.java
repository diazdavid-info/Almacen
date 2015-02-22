package services;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import bus.Addresses;
import bus.Companies;
import bus.Persons;
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
	
	/**
	 * Servicio que almacena un conductor
	 * @param nameDriver String
	 * @param surnameDriver String
	 * @param telephone String
	 * @param idAddress int
	 */
	@PUT
	@Path("/saveDriver")
	@Override
	public void putDriver(@QueryParam("nameDriver") String nameDriver, @QueryParam("surnameDriver") String surnameDriver, 
			@QueryParam("telephone") String telephone, @QueryParam("idAddress") int idAddress) {
		Persons persons = new Persons();
		persons.saveDriver(nameDriver, surnameDriver, telephone, idAddress);		
	}
	
	/**
	 * Servicio que almacena un trabajador
	 * @param nameWorker String
	 * @param surnameWorker String
	 * @param telephone String
	 * @param idAddress int
	 */
	@PUT
	@Path("/saveWorker")
	@Override
	public void putWorker(@QueryParam("nameDriver") String nameWorker, @QueryParam("surnameDriver") String surnameWorker, 
			@QueryParam("telephone") String telephone, @QueryParam("idAddress") int idAddress) {
		Persons persons = new Persons();
		persons.saveWorker(nameWorker, surnameWorker, telephone, idAddress);		
	}

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
	@GET
	@Path("/saveAddress")
	@Override
	public String putAddress(@QueryParam("block") String block, @QueryParam("door") String door, @QueryParam("floor") int floor,
			@QueryParam("locality") String locality, @QueryParam("nameVia") String nameVia, @QueryParam("number") int number, 
			@QueryParam("province") String province, @QueryParam("stairs") String stairs, @QueryParam("typeVia") String typeVia) {
		Addresses addresses = new Addresses();
		return addresses.saveAddress(block, door, floor, locality, nameVia, number, province, stairs, typeVia);
	}

}
