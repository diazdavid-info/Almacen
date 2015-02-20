package bus;

import java.util.List;

import hibernate.SessionFactoryUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import classes.Product;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Products {

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
	
	public void saveProducts(String json){
		String p = "{\"product\":[{\"asin\":\"123456\",\"ean\":\"123456\",\"description\":\"Zapatos Channel\",\"model\":\"Pretty\",\"price\":\"120.00\",\"weight\":\"200\",\"manufacturer\":{\"name\":\"Channel\"},\"measures\":{\"measure\":[{\"type\":\"Ancho\",\"value\":\"20\"},{\"type\":\"Alto\",\"value\":\"10\"},{\"type\":\"Profundidad\",\"value\":\"30\"}]}},{\"asin\":\"234567\",\"ean\":\"234567\",\"description\":\"Pelota Liga\",\"model\":\"Futbo7\",\"price\":\"25.25\",\"weight\":\"300\",\"manufacturer\":{\"name\":\"LFP\"},\"measures\":{\"measure\":[{\"type\":\"Ancho\",\"value\":\"10\"},{\"type\":\"Alto\",\"value\":\"10\"},{\"type\":\"Profundidad\",\"value\":\"10\"}]}},{\"asin\":\"345678\",\"ean\":\"345678\",\"description\":\"Portatil HP\",\"model\":\"Z-edes786\",\"price\":\"1000.00\",\"weight\":\"1200\",\"manufacturer\":{\"name\":\"HP\"},\"measures\":{\"measure\":[{\"type\":\"Ancho\",\"value\":\"35\"},{\"type\":\"Alto\",\"value\":\"10\"},{\"type\":\"Profundidad\",\"value\":\"30\"}]}}]}";
		Gson gson = new Gson();
		//Product p = gson.fromJson(json, Product.class);
		List<Product> products = gson.fromJson(json, new TypeToken<List<Product>>(){}.getType());
		//System.out.println(p.getCodeAsin());
	}
}
