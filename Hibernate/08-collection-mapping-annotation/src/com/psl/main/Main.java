package com.psl.main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.psl.bean.Address;
import com.psl.bean.Contact;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contact c1 = new Contact("firstName1", "lastName1", "email1", Date.valueOf("2001-01-01"));
		Contact c2 = new Contact("firstName2", "lastName2", "email2", Date.valueOf("2002-02-02"));
		
		c1.getMobileNumbers().add("54545454");
		c1.getMobileNumbers().add("22552255");
		c1.getMobileNumbers().add("45454545");
		
		c1.getAddress().add(new Address("city11", "country11"));
		c1.getAddress().add(new Address("city12", "country12"));
		
		c2.getMobileNumbers().add("154545454");
		c2.getMobileNumbers().add("122552255");
		c2.getMobileNumbers().add("145454545");
		
		c2.getAddress().add(new Address("city21", "country21"));
		c2.getAddress().add(new Address("city22", "country22"));
		
		Configuration configuration = new Configuration().configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
			session.save(c1);
			session.save(c2);
		tx.commit();
		
		c1.getMobileNumbers().clear();
		
		tx = session.beginTransaction();
			session.save(c1);
		tx.commit();
		session.close();
		sf.close();
	}

}
