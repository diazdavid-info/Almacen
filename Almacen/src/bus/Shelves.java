package bus;

import hibernate.SessionFactoryUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import tools.registerAdapter.ShelfSerializer;
import classes.Product;
import classes.Shelf;
import classes.Situation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Shelves {

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
	
	@SuppressWarnings("unchecked")
	public String allShelves(){
		createSession();
		query = session.createQuery("from Shelf");
		List<Shelf> list = query.list();
		Gson gson = new GsonBuilder().registerTypeAdapter(Shelf.class, new ShelfSerializer()).create();
		String result = gson.toJson(list);
		session.close();
		session = null;
		return result;
	}
	
	public void saveProduct(Product product){
		createSessionTransation();
		Shelf shelf = new Shelf();
		shelf.setSituation((Situation) session.load(Situation.class, 1));
		shelf.setProduct(product);
		session.save(shelf);
		tx.commit();
		session.close();
	}
}
