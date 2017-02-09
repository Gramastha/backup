package com.psl.collection;

import java.util.HashMap;
import java.util.Map;

public class Product {
	
	String  pId,pName;
	static Map<String,String> map= new HashMap<String, String>();

	public Product(String pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
		map.put(pId, pName);
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Map<String,String> getMap(){
		return map;
	}
	public boolean searchProduct(String prod){
		
		return map.containsValue(prod);
		 
	}
	public void remove(Product p){
		if(map.remove(p.getpId(), p.getpName()))
			System.out.println("Product removed successfully");
		else
			System.out.println("key no longer mapped with given value--try again");
	}
	
}
