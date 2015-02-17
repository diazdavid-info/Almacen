package hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.proxy.HibernateProxy;

public class HibernateUtils {
	
	/**
	 * Método genérico que transforma la clase proxy de hibernate a la clase real.
	 * @param entity 
	 * @return Class
	 */
	@SuppressWarnings("unchecked")
	public static <T> T initializeAndUnproxy(T entity) {
	    if (entity == null) {
	        throw new 
	           NullPointerException("Entity passed for initialization is null");
	    }

	    Hibernate.initialize(entity);
	    if (entity instanceof HibernateProxy) {
	        entity = (T) ((HibernateProxy) entity).getHibernateLazyInitializer().getImplementation();
	    }
	    return entity;
	}
	
//	public static <T> List<?> initializeAndUnproxyList(List<?> list, ArrayList<?> arg){
//		List<?> l = arg;
//		for (Object object : list) {
//			l.add((?)initializeAndUnproxy(object));
//		}
//		return list;
//		
//	}
}
