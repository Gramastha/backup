package com.psl.main;

import com.psl.bean.Medicine;
import com.psl.bean.Ointment;
import com.psl.bean.Syrup;
import com.psl.bean.Tablet;

public class TextMedicine {
	public static void main(String[] args) {
		
		Medicine med[]= new Medicine[10];
		for(int i=0;i<10;i++){
		switch((int)(Math.floor((i*(Math.random())%3)))){
		
		case 0: med[i]= new Tablet("ABC"+i, "Nagpur"+i, "Calpol"+i);
			break;
		case 1: med[i]= new Syrup("XYZ"+i, "PUNE"+i, "Cough Syrup"+i);
		break;
		case 2: med[i]= new Ointment("PQR"+i, "MUMBAI"+i, "KAilas Jeevan"+i);
		break;
		
		}
		}
		
		for(Medicine m:med){
			m.displayLabel();
		}
		
	}

}
