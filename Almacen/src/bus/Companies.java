package bus;

import hibernate.HibernateUtils;
import hibernate.SessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import classes.Company;

import com.google.gson.Gson;

public class Companies {
	
	SessionFactory sesion;
	Session session;
	Query query;
	Transaction tx;
	
	/**
	 * Método que inicializa los objetos necesarios para trabajar con Hibernate.
	 * Este método solo inicializa los objetos para pedir objetos.
	 */
	private void createSession(){
		sesion = SessionFactoryUtil.getSessionFactory();
		session = sesion.openSession();
	}
	
	/**
	 * Método que inicializa los objetos necesarios para trabajar con Hibernate.
	 * Este método inicializa los objetos para realizar una transación
	 */
	private void createSessionTransation(){
		createSession();
		tx = session.beginTransaction();
	}
	
	/**
	 * Método que solicita todas las compañias
	 * @return String
	 */
	@SuppressWarnings("unchecked")
	public String allCompanies(){
		createSession();
		query = session.createQuery("from Company");
		List<Company> list = query.list();
		List<Company> list2 = new ArrayList<Company>();
		for (Company company : list) {
			list2.add(HibernateUtils.initializeAndUnproxy(company));
		}
		Gson gson = new Gson();
		return gson.toJson(list2);
	}
	
	/**
	 * Método que añade una compañía
	 * @param nameCompany String
	 */
	public void saveCompany(String nameCompany){
		System.out.println("NOMBRE: "+nameCompany);
		createSessionTransation();
		System.out.println("Inserto una fila");
		Company company = new Company();
		company.setName(nameCompany);
		session.save(company);
		tx.commit();
	}

}
