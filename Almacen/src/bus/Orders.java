package bus;

import java.util.List;

import hibernate.SessionFactoryUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import classes.Order;
import classes.Person;
import classes.Product;

public class Orders {

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
	 * Método que almacena un pedido
	 * @param date String
	 * @param idPerson int
	 * @param price Float
	 * @return String
	 */
	public String saveOrder(String date, int idPerson, Float price){
		createSessionTransation();
		Person person = (Person) session.load(Person.class, idPerson);
		Order order = new Order(date, person, price);
		session.save(order);
		tx.commit();
		return String.valueOf(order.getId());
	}
	
	/**
	 * Método que asocia los productos a un pedido
	 * @param asin String
	 * @param idOrder int
	 * @return String
	 */
	@SuppressWarnings("unchecked")
	public String saveProductOrder(String asin, int idOrder){
		Boolean result = false;
		createSessionTransation();
		query = session.createQuery("from Person as p where p.mAsin = '"+asin+"'");
		List<Product> list = query.list();
		if(list.size() > 0){
			Product product = list.get(0);
			Order order = (Order) session.load(Order.class, idOrder);
			order.addProduct(product);
			session.saveOrUpdate(order);
			tx.commit();
			result = true;
			Shelves shelves = new Shelves();
			shelves.deleteProduct(product.getId());
		}
		session.close();
		session = null;
		return "{result:"+result+",order:"+idOrder+"}";
	}
}
