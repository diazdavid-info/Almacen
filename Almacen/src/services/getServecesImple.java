package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import bus.Companies;
import bus.Persons;
import bus.Products;
import bus.Vehicles;

/**
 * Clase para la implementacion de los servicios get
 * @author David Díaz
 * @version 1.0
 * @created 16-feb-2015 6:49:58
 */
@Path("/rest")
public class getServecesImple implements getServicesInter{

	/**
	 * Servicio que devuelve todas las compañias.
	 * @return String
	 */
	@GET
	@Path("/getAllCompanies")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public String getCompanies() {
		Companies companies = new Companies();
		return companies.allCompanies();
	}

	@GET
	@Path("/getAllDrivers")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public String getDrivers() {
		Persons persons = new Persons();
		return persons.allDrivers();
	}
	
	@GET
	@Path("/getAllVehicles")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public String getVehicles() {
		Vehicles vehicles = new Vehicles();
		return vehicles.allVehicles();
	}

	@GET
	@Path("/saveProducts")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public void saveProducts(@QueryParam("products") String jsonProducts) {
		System.out.println(jsonProducts);
		Products products = new Products();
		products.saveProducts(jsonProducts);
		//System.out.println(URLDecoder.decode(products));
	}

}
