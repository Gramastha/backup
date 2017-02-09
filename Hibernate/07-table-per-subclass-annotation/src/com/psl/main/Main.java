package com.psl.main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.envers.entities.RelationDescription;

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
		Contact c1 = new Employee("firstName1", "lastName1", "email1", Date.valueOf("2001-01-01"),
				new Address("city2", "country2"), "employeeCode", "desigation");
		
		Contact c2 = new Relative("firstName2", "lastName2", "email2", Date.valueOf("2001-01-01"),
				new Address("city2", "country2"), "relation");
		
		Contact c3 = new Friend("firstName2", "lastName2", "email2", Date.valueOf("2001-01-01"),
				new Address("city2", "country2"), "petName");
		Configuration configuration = new Configuration().configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
			session.save(c1);
			session.save(c2);
			session.save(c3);
		tx.commit();
		session.clear();
//		Contact c = (Contact) session.get(Employee.class, new Integer(1));
//		
//		System.out.println(c.getFirstName());
		
		session.close();
		sf.close();
	}

}
