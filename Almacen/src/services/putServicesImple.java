package services;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import hibernate.SessionFactoryUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bus.Companies;
import classes.Company;

/**
 * Clase para la implementacion de los servicios put
 * @author David Díaz
 * @version 1.0
 * @created 16-feb-2015 6:49:58
 */
@Path("/rest")
public class putServicesImple implements putServicesInter{
	
	private SessionFactory sesion;
	private Session session;
	private Transaction tx;
	
	/**
	 * Método que instancia todos los objetos necesarios para una transación.
	 */
	private void initSession(){
		sesion = SessionFactoryUtil.getSessionFactory();
		session = sesion.openSession();
		tx = session.beginTransaction();
	}
	
	/**
	 * Método que cierra la sessión con Hibernate
	 */
	private void closeSession(){
		session.close();
		session = null;
		sesion = null;
		tx = null;
	}
	
	/**
	 * Servicio que almacena una compañia
	 * @param nameCompany String Nombre de la compañia
	 */
	@PUT
	@Path("/saveCompany")
	public void putCompany(@QueryParam("nameCompany") String nameCompany){
//		initSession();
//		Company company = new Company();
//		company.setName(nameCompany);
//		session.save(company);
//		tx.commit();
//		closeSession();
		Companies companies = new Companies();
		companies.saveCompany(nameCompany);
	}

}
