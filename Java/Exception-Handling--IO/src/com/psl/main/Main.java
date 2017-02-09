package com.psl.main;

import java.util.Date;

import com.psl.exception.Contact;
import com.psl.exception.ContactStack;
import com.psl.exception.IncorrectDetailsException;
import com.psl.exception.InvalidEmailException;

public class Main {

	public static void main(String[] args) {
		Contact c;
		ContactStack cs= new ContactStack(3);
		Date d;
		
		for(int i=0;i<3;i++){
			d= new Date();
			d.setDate(i+1);
			d.setMonth((i+1)*2);
			d.setYear((i+1)*3);
			
			c= new Contact("abc"+i, "xyz"+i, "abc"+i+"@a.com", i+10, i+20,	d);
			
			try {
				if(c.validate())
					cs.push(c);
			} catch (IncorrectDetailsException | InvalidEmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			System.out.println(cs.pop());
			System.out.println(cs.pop());
			System.out.println(cs.pop());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
