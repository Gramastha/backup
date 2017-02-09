package com.psl.asss2;



public class VDate {
	public void Validate(int date, int month, int year){
		/*Date d= null;
		DateFormat df= new SimpleDateFormat("DD-MM-YYYY");
		df.setLenient(false);
		try {
			d= df.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		if(Leap.isLeap(year) && month==2){
			
				if(date>0 && date<30)
					System.out.println("date is valid");
				else
					System.out.println("date is invalid");
			
		}
		else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			if(date>0 && date<=31)
				System.out.println("date is valid");
			else
				System.out.println("date is invalid");
		}
		else if(month==2){
			if(date>0 && date<29)
				System.out.println("date is valid");
			else
				System.out.println("date is invalid");
		}
		else{
			if(date>0 && date<31)
				System.out.println("date is valid");
			else
				System.out.println("date is invalid");
		}
	}

}
