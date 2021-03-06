package com.psl.main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.psl.bean.Contact;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contact contact= new  Contact("ABCD", "XYZW", "a@a.a", Date.valueOf("2010-10-10"));
		Contact contact1= new  Contact("EFGH", "PQRS", "e@f.g", Date.valueOf("2001-10-10"));
		
		Configuration config= new Configuration().configure();
		SessionFactory sessionFactory= config.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction trans= session.beginTransaction();
		session.save(contact);
		session.save(contact1);
		trans.commit();
		session.close();
		sessionFactory.close();
		
	}

}
