package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class hibernateUtils {

	private static SessionFactory sf = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory session = metadata.getSessionFactoryBuilder().build();
		
		
		return session;
	}
	public static SessionFactory getSession() {
		return sf;
	}
}
