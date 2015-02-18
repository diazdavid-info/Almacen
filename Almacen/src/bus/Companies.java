package bus;

import java.util.ArrayList;
import java.util.List;

import hibernate.HibernateUtils;
import hibernate.SessionFactoryUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.google.gson.Gson;

import classes.Company;

public class Companies {
	
	SessionFactory sesion;
	Session session;
	Query query;
	
	/**
	 * Método que inicializa los objetos necesarios para trabajar con Hibernate.
	 * Este método solo inicializa los objetos para pedir objetos.
	 */
	private void createSession(){
		sesion = SessionFactoryUtil.getSessionFactory();
		session = sesion.openSession();
	}
	
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
	
	public void saveCompany(String nameCompany){
		System.out.println("NOMBRE: "+nameCompany);
	}

}
