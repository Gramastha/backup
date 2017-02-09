package com.psl.collections;

import java.util.ArrayList;
import java.util.List;


public class CityStateMap {
	static int i=0;
	List<String> cities= new  ArrayList<String>();
	List<String> states= new ArrayList<String>();
	public void add(String city, String state){
		if(cities.contains(city)){
			int j=cities.indexOf(city);
			states.remove(j);
			states.add(j, state);
		}
		else{
		cities.add(i, city);
		states.add(i, state);
		i++;
		}
		
	}
	
	public String getState(String city){
		String s= "City not found in the entries";
		if(cities.contains(city)){
			s= states.get(cities.indexOf(city));
		return "State of "+city+" "+s;
		}
		return s;
		
	}
	public void printEntries(){
		for(int j=0;j<i;j++){
			System.out.println(cities.get(j)+" - "+states.get(j));
		}
	}

}
