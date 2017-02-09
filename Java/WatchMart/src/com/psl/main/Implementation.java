package com.psl.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.psl.bean.Brand;
import com.psl.bean.Gender;
import com.psl.bean.Shape;
import com.psl.bean.Style;
import com.psl.bean.Type_Watch;
import com.psl.bean.Wrist_Watches;

public class Implementation {
	private static List<Wrist_Watches> list= new ArrayList<Wrist_Watches>();
	public List<Wrist_Watches> read(String fileName) throws FileNotFoundException{
		
		List<Wrist_Watches> watches= new ArrayList<Wrist_Watches>();
		
		Scanner scr= new Scanner(new File(fileName));
		scr.nextLine();
		while(scr.hasNextLine()){
			
			try{
			String str[]= scr.nextLine().split(",");
			//System.out.println(str);
			if(str.length>8) continue;
			watches.add(new Wrist_Watches(Integer.parseInt(str[0].trim()), Double.parseDouble(str[2].trim()), Type_Watch.valueOf(str[6]),
						Shape.valueOf(str[5]), Brand.valueOf(str[4]), Integer.parseInt(str[7]), Style.valueOf(str[3]), Gender.valueOf(str[1])));
		}
		
		catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		
		}
		
		list.addAll(watches);
		return watches;
	}

	
	public List<Wrist_Watches> watches_men_Sports(List<Wrist_Watches> list){
		List<Wrist_Watches> watch= new ArrayList<Wrist_Watches>();
		for(Wrist_Watches w:list){
			if(w.getGender().equals(Gender.Men) && w.getStyle().equals(Style.Sport)){
				watch.add(w);
			}
		}
		
		
		return watch;
		
	}
	
	public List<Wrist_Watches> watches_women(List<Wrist_Watches> list){
		List<Wrist_Watches> watch= new ArrayList<Wrist_Watches>();
		for(Wrist_Watches w:list){
			if(w.getGender().equals(Gender.Women) && w.getBrand().equals(Brand.Fossil) && w.getType().equals(Type_Watch.Analog)){
				watch.add(w);
			}
		}
		
		
		return watch;
		
	}

	public  void  purchase(Gender g,Shape shape,Type_Watch type,Style style, Brand brand, String name){
		
	Thread t= new Thread(name){
		@Override
		public void run() {
			for(Wrist_Watches w:list){
				if(w.getGender().equals(g) && w.getShape().equals(shape) && w.getType().equals(type) && w.getStyle().equals(style) && w.getBrand().equals(brand)){
					if(w.getQuantity()>0){
						w.setQuantity(w.getQuantity()-1);
						System.out.println(Thread.currentThread().getName()+" Watch is available!\n thanks for shopping ");
						
					}
					else{
						System.out.println(Thread.currentThread().getName()+" "+w.getStyle()+" Watch of "+w.getBrand()+" brand is out of stock");
					}
				}
			}
		}
	};
		t.start();
		
	}

	public List<Wrist_Watches> arrangeDec(List<Wrist_Watches> wlist) {
		Collections.sort(wlist, new Comparator<Wrist_Watches>() {

			@Override
			public int compare(Wrist_Watches arg0, Wrist_Watches arg1) {
				
				if(arg1.getCost()<arg0.getCost()) return -1;
				else if(arg1.getCost()>arg0.getCost()) return 1;
				else return 0;
			}
			
		});
		return wlist;
		
	}
}
