package com.psl.day3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PersiCalendar {

	
	static void getdiff(int y){
		int fday,lstday,nfday,nlstday,gap=Integer.MAX_VALUE;
		Calendar a= new GregorianCalendar(y, 01, 01);
		fday= a.get(Calendar.DAY_OF_WEEK);
		
		a.set(Calendar.MONTH, Calendar.DECEMBER);
		
		lstday= a.get(Calendar.DAY_OF_WEEK);
		
		int aa=y;
		for(int i=y+1;i<(y+100);i++){
			Calendar a1= new GregorianCalendar(i, 01, 01);
			nfday= a1.get(Calendar.DAY_OF_WEEK);
			a1.set(Calendar.MONTH, Calendar.DECEMBER);
			nlstday= a1.get(Calendar.DAY_OF_WEEK);
			if(nfday==fday && nlstday==lstday ){
				if(gap>i-aa){
				gap=i-aa;
				
				}
			}
		}
		System.out.println(gap);
	}
	
	public static void main(String[] args) {
		getdiff(2016);

	}

}
