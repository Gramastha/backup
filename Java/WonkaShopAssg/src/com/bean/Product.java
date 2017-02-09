/**
 * 
 */
package com.bean;

/**
 * @author Administrator
 *
 */
public class Product {
	private int itemCode;
	private String name;
	private float price;
	private int availableCount;
	/**
	 * @param name
	 * @param itemCode
	 * @param price
	 */
	public Product(int itemCode, String name, float price,int availableCount) {
		super();
		this.name = name;
		this.itemCode = itemCode;
		this.price = price;
		this.availableCount=availableCount;
	}
	/**
	 * @return the itemCode
	 */
	public int getItemCode() {
		return itemCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	public int getAvailableCount() {
		return availableCount;
	}
	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}
	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", name=" + name + ", price="
				+ price + ", availableCount=" + availableCount + "]";
	}
		
	
	
}
