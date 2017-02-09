package com.psl.client;

import java.beans.FeatureDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.psl.bean.COLOR;
import com.psl.bean.Car;
import com.psl.bean.CylinderNumber;
import com.psl.bean.DieselEngine;
import com.psl.bean.Engine;
import com.psl.bean.MotorCycle;
import com.psl.bean.OilPump;
import com.psl.bean.PetrolEngine;
import com.psl.bean.Scooter;
import com.psl.bean.Strokes;
import com.psl.bean.Truck;
import com.psl.bean.Vehical;

public class Sarathi {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scr= new Scanner(new File("vehicle_list.csv"));
		List<Vehical> vehiList= new ArrayList<Vehical>();
		String words[]= new String[12];
		scr.nextLine();
		while(scr.hasNextLine()){
			words= scr.nextLine().split(",");
			if(words[1].equalsIgnoreCase("Truck")){
				//truck
			Truck t= new Truck();
			t.setNickName(words[0]);
			t.setChassisNumber(words[2]);
			t.setManYear(Integer.parseInt(words[3]));
			t.setColor(COLOR.valueOf(words[4].toLowerCase()));
			Engine e= new DieselEngine();
			e.setStrokes(Strokes.four);
			e.setCylinderNumber(CylinderNumber.twelve);
			e.setEngineNo(words[8]);
			t.setEngine(e);
			t.setOpump(new OilPump(words[9], Integer.parseInt(words[10])));
			
			
			vehiList.add(t);
			}
			else if(words[1].equalsIgnoreCase("Car")){
				//Car
				Car t= new Car();
				t.setNickName(words[0]);
				t.setChassisNumber(words[2]);
				t.setManYear(Integer.parseInt(words[3]));
				t.setColor(COLOR.valueOf(words[4].toLowerCase()));
				Engine e;
				if(words[5].equalsIgnoreCase("Petrol")){
					e= new PetrolEngine();
					e.setStrokes(Strokes.four);
					e.setCylinderNumber(CylinderNumber.valueOf(words[7]));
				}
				else{
					e=new DieselEngine();
					e.setStrokes(Strokes.four);
				e.setCylinderNumber(CylinderNumber.twelve);
				
				}
				e.setEngineNo(words[8]);
				t.setEngine(e);
				t.setOpump(new OilPump(words[9], Integer.parseInt(words[10])));
				
				vehiList.add(t);
				
			}
			else if(words[1].equalsIgnoreCase("Scooter")){
				//Scooter
				Scooter t= new Scooter();
				t.setNickName(words[0]);
				t.setChassisNumber(words[2]);
				t.setManYear(Integer.parseInt(words[3]));
				t.setColor(COLOR.valueOf(words[4].toLowerCase()));
				
				Engine e;
					e= new PetrolEngine();
					e.setEngineType("Petrol");
					e.setStrokes(Strokes.valueOf(words[6]));
					e.setCylinderNumber(CylinderNumber.one);
				
				e.setEngineNo(words[8]);
				t.setEngine(e);
				vehiList.add(t);
			}
			else if(words[1].equalsIgnoreCase("MotorCycle")){
				//MotorCycle
				MotorCycle t= new MotorCycle();
				t.setNickName(words[0]);
				t.setChassisNumber(words[2]);
				t.setManYear(Integer.parseInt(words[3]));
				t.setColor(COLOR.valueOf(words[4].toLowerCase()));
				
				Engine e;
					e= new PetrolEngine();
					e.setEngineType("Petrol");
					e.setStrokes(Strokes.four);
					e.setCylinderNumber(CylinderNumber.one);
				
				e.setEngineNo(words[8]);
				t.setEngine(e);
				vehiList.add(t);
			}
			else{
				System.out.println("Invalid Entry");
			}
		}
		for(Vehical v:vehiList){
			if(v.validate()){
		System.out.println(v);
		
		}
			else vehiList.remove(v);
		}
		OilPump o= new OilPump();
		Engine e= new Engine();
		o.run();
		e.start();
		
		
	}

}
