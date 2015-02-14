package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryUtil {
	/**
	 * Atributo con la instancia de la session de Hibernate
	 */
	private static final SessionFactory sessionFactory;
	/**
	 * Atributo con la instancia de los servicios de Hibernate
	 */
	private static final ServiceRegistry serviceRegistry;
	
	/**
	 * Prepara la sessión de Hibernate
	 */
	static{
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Throwable e) {
			System.err.println("EL inicio de sessión de Hibernate ha sido fallido. "+e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	/**
	 * Método estático que devuelve la sessión de Hibernate
	 * @return SessionFactory
	 */
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
