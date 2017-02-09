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
		Contact contact= new  Contact("ABCD", "XYZW", "a@a.a", Date.valueOf("2010-10-10"));
		Contact contact1= new  Contact("EFGH", "PQRS", "e@f.g", Date.valueOf("2001-10-10"));
		
		contact.getMobilenums().add("132465451");
		contact.getMobilenums().add("354355");
		contact.getMobilenums().add("5515215");
		contact.getAddresses().add(new Address("MUMBAI", "INDIA"));
		contact.getAddresses().add(new Address("DELHI", "INDIA"));
		contact.getAddresses().add(new Address("TEXAS", "USA"));
		
		contact1.getMobilenums().add("158632");
		contact1.getMobilenums().add("754165");
		contact1.getMobilenums().add("995641");
		contact1.getAddresses().add(new Address("NAGPUR", "INDIA"));
		contact1.getAddresses().add(new Address("TIMPHU", "BHUTAN"));
		contact1.getAddresses().add(new Address("WICHETA", "USA"));
		
		Configuration config= new Configuration().configure();
		SessionFactory sessionFactory= config.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction trans= session.beginTransaction();
		session.saveOrUpdate(contact);
		session.save(contact1);
		trans.commit();
		
		
		session.close();
		sessionFactory.close();
		
	}

}
