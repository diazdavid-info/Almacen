package bus;

import hibernate.SessionFactoryUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import classes.Measure;

public class Measures {

	SessionFactory sesion;
	Session session;
	Query query;
	Transaction tx;
	Measure measure;
	
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
	 * Método que almacenas las medidas
	 * @param type String
	 * @param value Float
	 * @return Measure
	 */
	public Measure saveMeasure(String type, Float value){
		createSessionTransation();
		measure = new Measure(type, value);
		session.save(measure);
//		tx.commit();
//		try {
//			measure.finalize();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
		System.out.println(measure.getId());
		//measure = null;
		session.close();
		return measure;
	}
}
