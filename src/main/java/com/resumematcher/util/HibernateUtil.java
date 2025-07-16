package com.resumematcher.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	 System.out.println("⏳ Building SessionFactory...");
            return new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed: " + ex);
            System.err.println("❌ Hibernate initialization failed: " + ex);
            ex.printStackTrace(); // <-- This line shows real reason
            throw new ExceptionInInitializerError(ex);
           
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
