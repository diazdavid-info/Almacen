package services;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import bus.Companies;

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
	public void putCompany(@QueryParam("nameCompany") String nameCompany){
		Companies companies = new Companies();
		companies.saveCompany(nameCompany);
	}

}
