package com.psl.main;



import com.psl.geometry.Circle;
import com.psl.geometry.Cube;
import com.psl.geometry.Threedim;
import com.psl.geometry.Twodim;
import com.psl.phone.PhoneNumber;

public class Main {

	public static void main(String[] args) {
		PhoneNumber ph= new PhoneNumber(123,222,4101);
		PhoneNumber q= new PhoneNumber(123,222,4101);
		
		if(ph.equals(q)){
			System.out.println("same numbers "+q);
		}
		else	System.out.println("numbers ( "+ph+ " ,"+q+" ) are not equal");
	}
	
	/*public static void shapeManager(Twodim t){
		t.cal_area();
		t.cal_perimeter();
		System.out.println("\n\n"+t.getShape());
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
		
	}
	
	public static void shapeManager(Threedim t) {
		t.cal_surfacearea();
		t.cal_volume();
		
		System.out.println("\n\n"+t.getShape());
		System.out.println(t.getSurfaceArea());
		System.out.println(t.getVolume());
		
		
	}*/

}
