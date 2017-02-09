package com.psl.day5;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CallenderUtill {

	public static void main(String[] args) {
		
		Calendar c= Calendar.getInstance();
		GregorianCalendar gc= (GregorianCalendar) Calendar.getInstance();
		Date d= c.getTime();
		System.out.println(d);
		System.out.println("Timestamp: "+new Timestamp(d.getTime()));
		c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH)+10);
		System.out.println(c.getTime());
		System.out.println("Month: "+c.get(Calendar.MONTH)+"Year: "+c.get(Calendar.YEAR)+"weekofYear"+c.get(Calendar.WEEK_OF_YEAR));
	
		c.set(Calendar.YEAR, c.get(Calendar.YEAR)+1);
		System.out.println(c.getTime());
	
	}

}
