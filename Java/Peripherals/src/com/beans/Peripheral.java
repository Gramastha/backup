package com.beans;

import java.util.Comparator;

public class Peripheral implements Comparable<Peripheral>,Comparator<Peripheral>{
	private String itemCode;
	private String name;
	private String description;
	private int price, quantity;
	
	public Peripheral() { /* does nothing */ }

	public String getItemCode() { return itemCode; }
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getDescription() { return description; }
	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }

	public int getQuantity() { return quantity; }
	public void setQuantity(int quantity) { this.quantity = quantity; }

	@Override
	public int compareTo(Peripheral arg0) {
		if(price<(arg0.getPrice())) return -1;
		if(price==(arg0.getPrice())){
			return itemCode.compareTo(arg0.getItemCode());
		}
		
		return 1;
	}

	@Override
	public int compare(Peripheral arg0, Peripheral arg1) {
		
		if(arg0.getQuantity()<(arg1.getQuantity())) return -1;
		if(arg0.getQuantity()==(arg1.getQuantity())){
			return arg0.compareTo(arg1);
				}
		
		return 1;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peripheral other = (Peripheral) obj;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[itemCode=" + itemCode + ", name=" + name
				+ ", description=" + description + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
