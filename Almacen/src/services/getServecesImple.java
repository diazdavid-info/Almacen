package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bus.Companies;
import bus.Persons;

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
	@Path("/getAllPersons")
	@Produces(MediaType.TEXT_PLAIN)
	@Override
	public String getPersons() {
		Persons persons = new Persons();
		return persons.allPersons();
	}

}
