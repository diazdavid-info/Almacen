package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import bus.Companies;
import bus.Persons;
import bus.ProductsBus;
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
		System.out.println("ALL company");
		Companies companies = new Companies();
		return companies.allCompanies();
	}

	@GET
	@Path("/getAllDrivers")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public String getDrivers() {
		System.out.println("ALL driver");
		Persons persons = new Persons();
		return persons.allDrivers();
	}
	
	@GET
	@Path("/getAllVehicles")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public String getVehicles() {
		System.out.println("ALL vehiculos");
		Vehicles vehicles = new Vehicles();
		return vehicles.allVehicles();
	}

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
	@GET
	@Path("/saveProduct")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public String saveProduct(@QueryParam("asinProduct") String asinProduct, @QueryParam("eanProduct") String eanProduct,
			@QueryParam("descriptionProduct") String descriptionProduct, @QueryParam("modelProduct") String modelProduct, @QueryParam("priceProduct") Float priceProduct,
			@QueryParam("weightProduct") Float weightProduct, @QueryParam("nameManufactureProduct") String nameManufactureProduct,
			@QueryParam("widthProduct") Float widthProduct, @QueryParam("highProduct") Float highProduct, @QueryParam("longProduct") Float longProduct) {
		
		ProductsBus product = new ProductsBus();
		return product.saveProduct(asinProduct, eanProduct, descriptionProduct, 
				modelProduct, priceProduct, weightProduct, nameManufactureProduct, 
				widthProduct, highProduct, longProduct);
	}

}
