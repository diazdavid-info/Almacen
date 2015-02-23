package bus;

import hibernate.SessionFactoryUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import classes.Manufacturer;
import classes.Measure;
import classes.Product;

import com.google.gson.Gson;

public class ProductsBus {

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
	
	public String saveProduct(String asinProduct, String eanProduct, String descriptionProduct, String modelProduct, Float priceProduct,
			Float weightProduct, String nameManufactureProduct, Float widthProduct, Float highProduct, Float longProduct){
		
		createSessionTransation();
		
		Manufacturer manufacturer = new Manufacturer(nameManufactureProduct);
		session.save(manufacturer);
		
		
		Measure measure1, measure2 ,measure3;
		measure1 = new Measure("Ancho", widthProduct);
		session.save(measure1);
		measure2 = new Measure("Alto", highProduct);
		session.save(measure2);
		measure3 = new Measure("Largo", longProduct);
		session.save(measure3);
		
		Product product = new Product(asinProduct, eanProduct, descriptionProduct, modelProduct, priceProduct, weightProduct, measure1, measure2, measure3);
		product.setManufacturer(manufacturer);
		session.save(product);
		tx.commit();
		session.flush();
		session.close();
		
		Shelves shelves = new Shelves();
		shelves.saveProduct(product);
		System.out.println("SAVE PRODUCT");
		Gson gson = new Gson();
		return gson.toJson(product);
		
	}
}
