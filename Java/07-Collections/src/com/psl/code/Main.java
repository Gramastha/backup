package com.psl.code;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		
		
}
}

	/*
	 * Set 
	 * 
	 * 
	 * 
	 * SortedSet<Person> person= new TreeSet(new Person());
	for(int i=0;i<6;i++){
		if(i<3)
		person.add(new Person("ABCD"+i, "XYZW"+(i*3), Date.valueOf("2001-01-23")));

	person.add(new Person("ABCD"+i, "XYZW"+(i-2), Date.valueOf("2001-01-23")));
	}
	
	for(Person p: person){
		System.out.println(p);
	}
	System.out.println("111111111111111111111111111111111111111111111111");
	Iterator<Person> itr= person.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}*/



/*
 * 
 * 
 * Product Map
 * 
 * 
 * 
		Map<AadharMAp, Person> ap= new HashMap<AadharMAp, Person>();
		ap.put(new AadharMAp("123456", "789456"), new Person("AAAA", "XXX", Date.valueOf("1990-2-20")));
		
		ap.put(new AadharMAp("1234", "7854"), new Person("bbb", "www", Date.valueOf("2100-2-20")));
		ap.put(new AadharMAp("789", "2154"), new Person("rfrwed", "reerwer", Date.valueOf("1996-2-20")));
		
		Person p= ap.get(new AadharMAp("1234", "7854"));
		System.out.println(p.getDob());
		
		
		NumberContainer<Long> lng;
		lng= new NumberContainer<Long>();
		
		NumberContainer<Integer> in;
		in= new NumberContainer<Integer>();*/
