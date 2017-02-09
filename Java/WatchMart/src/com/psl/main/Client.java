package com.psl.main;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.psl.bean.Brand;
import com.psl.bean.Customer;
import com.psl.bean.Gender;
import com.psl.bean.Shape;
import com.psl.bean.Style;
import com.psl.bean.Type_Watch;
import com.psl.bean.Wrist_Watches;

public class Client {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new LinkedHashMap<String, Integer>();
		map.put("A", 1);
		map.put("d", 2);
		map.put("c", 3);
		map.put("f", 4);
		map.put("t", 5);
		map.put("q", 7);
		System.out.println(map);
		/*Set<String> set=map.keySet();
		String[] key=new String[set.size()];
		int[] value=new int[set.size()];
		int i=0;
		for(String str:set)
		{
			key[i]=str;
			value[i]=map.get(str);
			i++;
		}
*/		/*for()
			for()
			{
				
				
			}*/
	}

}

/**
 * 
		Implementation impl= new Implementation();
		try {
			List<Wrist_Watches> wtr= impl.read("watch.txt");
			
			
			//wtr= impl.watches_men_Sports(wtr);
			//wtr= impl.watches_women(wtr);
			//for(Wrist_Watches w: wtr)
			//	System.out.println(w);
			
			
			impl.purchase(Gender.Men, Shape.Oval, Type_Watch.Analog, Style.Dress, Brand.Fossil,"Abhishek");
			impl.purchase(Gender.Men, Shape.Oval, Type_Watch.Analog, Style.Dress, Brand.Fossil,"shubham");
			
			/*Customer c1= new Customer("Abhishek");
			Customer c2= new Customer("Shubham");
			
			
			c1.start();
		
			c2.start();
			*/
			/*wtr= impl.arrangeDec(wtr);
			for(Wrist_Watches w: wtr)
				System.out.println(w);
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
 */