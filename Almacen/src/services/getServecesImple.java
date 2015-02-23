package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import bus.Companies;
import bus.Downloads;
import bus.Persons;
import bus.ProductsBus;
import bus.Shelves;
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
	@Path("/getAllWorkers")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public String getWorkers(){
		Persons persons = new Persons();
		return persons.allWorkers();
	}
	
	@GET
	@Path("/getAllVehicles")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public String getVehicles() {
		Vehicles vehicles = new Vehicles();
		return vehicles.allVehicles();
	}
	
	/**
	 * Servicio que devuelve todas las ubicaciones
	 * @return String
	 */
	@GET
	@Path("/getAllShelves")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public String getShelves() {
		Shelves shelves = new Shelves();
		return shelves.allShelves();
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
	@GET
	@Path("/saveUnload")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public String saveUnload(@QueryParam("company") int company, @QueryParam("driver") int driver, @QueryParam("vehicle") int vehicle, 
			@QueryParam("date") String date, @QueryParam("time") String time, @QueryParam("worker") int worker){
		Downloads downloads = new Downloads();
		return downloads.saveDownload(company, driver, vehicle, date, time, worker);
	}
	
	/**
	 * Servicio que almacena la asociación entre las descarga y el producto
	 * @param idUnload int
	 * @param idProduct int
	 */
	@GET
	@Path("/saveUnloadProduct")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public void saveProductUnload(@QueryParam("idUnload") int idUnload, @QueryParam("idProduct") int idProduct){
		Downloads downloads = new Downloads();
		downloads.saveDownloadProduct(idUnload, idProduct);
	}

}
