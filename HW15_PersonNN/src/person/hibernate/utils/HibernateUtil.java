package person.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil 
{
	private static SessionFactory sessionFactory = null;
	static 
	{
		try 
		{
			//creates the session factory from hibernate.cfg.xml
			sessionFactory = new
					AnnotationConfiguration().configure().buildSessionFactory();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory() 
	{
		return sessionFactory;
	}
}