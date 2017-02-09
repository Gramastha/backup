package com.psl.main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.psl.bean.Address;
import com.psl.bean.Contact;
import com.psl.bean.Employee;
import com.psl.bean.Friend;
import com.psl.bean.Relative;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contact contact= new  Employee("ABCD", "XYZW", "a@a.a", Date.valueOf("2010-10-10"), new Address("MUMBAI", "INDIA"),"empcode1", "designation");
		Contact contact1= new  Relative("EFGH", "PQRS", "e@f.g", Date.valueOf("2001-10-10"),new Address("NAgpur", "INDIA"), "relation");
		Contact contact2= new  Friend("EFGH", "PQRS", "e@f.g", Date.valueOf("2001-10-10"),new Address("pune", "INDIA"),"petname");
		
		Configuration config= new Configuration().configure();
		SessionFactory sessionFactory= config.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction trans= session.beginTransaction();
		session.saveOrUpdate(contact);
		session.persist(contact1);
		session.save(contact2);
		
		session.clear();
		Contact c= (Contact) session.get(Contact.class, new Integer(2));
		System.out.println(c);
		
		
		trans.commit();
		session.close();
		sessionFactory.close();
		
	}

}
