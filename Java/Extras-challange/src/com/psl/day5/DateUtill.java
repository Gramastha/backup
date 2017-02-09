package com.psl.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtill {
	public static void main(String args[]){
		Date d= new Date();
		Date d1= new Date(151019940845l);
		System.out.println(d.toString().concat(d1.toString()));
		
		if(d.before(d1)) System.out.println(d+" before");
		if(d1.after(d)) System.out.println(d1+" after");
		
		System.out.println(d1.compareTo(d));
		
		
		SimpleDateFormat ds= new SimpleDateFormat("dd-MM-yyyy", Locale.CANADA);
		try {
			d=ds.parse("02-02-1997");
			System.out.println(d);
			System.out.println(d.toGMTString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
