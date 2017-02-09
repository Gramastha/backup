package com.psl.main;

import java.sql.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import com.psl.collections.CityStateMap;
import com.psl.collections.Student;
import com.psl.collections.UniqueChar;

public class Main {

	public static void main(String[] args) {
		
		UniqueChar u= new UniqueChar();
		u.numberOfUniqueChars("Abhishek Gramastha");
		u.numberOfUniqueChars("Shubham");
		
		u.numberOfUniqueChars("Abhishek Gramastha");
	}

}

/*
 * 
 * Student
 * 
 * 
		Student s1=new Student("Abhishek",12, Date.valueOf("2010-12-12"));
		Student s2= new Student("Varun",5, Date.valueOf("2011-11-30"));
		SortedSet<Student> s= new TreeSet<Student>(new Student());
		s.add(s1);
		s.add(new Student("Shubham",4, Date.valueOf("2012-02-02")));
		s.add(s2);
		s.add(new Student("Ashish",6, Date.valueOf("2000-01-31")));
		s.add(new Student("Vipul",26, Date.valueOf("1990-12-26")));
		
		Iterator<Student> i=s.iterator();
		while(i.hasNext()){
			Student obj=i.next();
			System.out.println(obj);
		}
		
	
	*/



/*
 * 
 * City-State pair
 * 
 * 
 * CityStateMap cs= new CityStateMap();
		cs.add("Nagpur","Maharashtra");
		cs.add("Bhopal", "Madhya Pradesh");
		cs.add("Bengleru", "Karnataka");
		cs.add("Shrinagar", "J & K");
		cs.add("Bhopal", "J & K");
		
		System.out.println(cs.getState("Nagpur"));
		
		cs.printEntries();*/
