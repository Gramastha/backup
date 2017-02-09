package com.psl.zhamela;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Zhamela {

	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Map<String, List<String>>> mainmap= new HashMap<String, Map<String,List<String>>>();
		
		
		Scanner scr= new Scanner(new File("country.txt"));

		while(scr.hasNextLine()){
			//System.out.println("ashhsg"+"---");
			String country[]= scr.nextLine().split(":");
			List<String> city= new ArrayList<String>();
			String state[]= country[1].split("-");
			String cities[]= state[1].split(",");
			
			for(String s: cities)
				city.add(s);
			
			if(mainmap.containsKey(country[0])){
				if(mainmap.get(country[0]).containsKey(state[0])){
					mainmap.get(country[0]).get(state[0]).addAll(city);
				}
				else{
					mainmap.get(country[0]).put(state[0], city);
				}
			}
			else{
				Map<String, List<String>> hashmap= new HashMap<String, List<String>>();
				hashmap.put(state[0], city);
				mainmap.put(country[0],hashmap);
			}
			
			
		}
		
		
		
		for(Map.Entry<String, Map<String, List<String>>> map: mainmap.entrySet()){
			System.out.println("Country: "+map.getKey());
			for(Map.Entry<String, List<String>> state: map.getValue().entrySet()){
				System.out.println("\tState: "+state.getKey());
				for(String str: state.getValue())
					System.out.println("\t\t"+str);
				
			}
		}
		
	}

	
	
}

