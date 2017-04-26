package springlab.util;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import springlab.entity.*;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author fahad
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
        	File configFile = new File("/home/woot/workspace/springlab/src/main/resources/hibernate.cfg.xml");
            // Create the SessionFactory from standard (hibernate.cfg.xml) config file.
            sessionFactory = new Configuration().addAnnotatedClass(Teacher.class)
            									.addAnnotatedClass(Clo.class)
            									.addAnnotatedClass(Content.class)
            									.addAnnotatedClass(Course.class)
            									.addAnnotatedClass(Grade.class)
            									.addAnnotatedClass(Student.class)
            						.configure(configFile).buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
