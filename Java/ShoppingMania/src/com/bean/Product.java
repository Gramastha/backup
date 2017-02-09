package com.bean;

import java.util.Comparator;
import java.util.List;

public class Product implements Comparator<Product>{

	String title;	
	List<String> brands;
	
	@Override
	public String toString() {
		return "Product [title=" + title + ", brands=" + brands + "]";
	}
	public Product() { /* does nothing */ }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getBrands() {
		return brands;
	}
	public void setBrands(List<String> brands) {
		this.brands = brands;
	}
	public Product(String title) {
		
		this.title = title;
		this.brands = null;
	}
	public int compare(Product arg0, Product arg1) {
		
		return arg1.getTitle().compareTo(arg0.getTitle());
	}
	
	
}
