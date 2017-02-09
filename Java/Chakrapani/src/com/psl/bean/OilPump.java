package com.psl.bean;

public class OilPump implements Runnable{
 private String Id;
 private int capacity;

public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public OilPump(String id, int capacity) {
	super();
	Id = id;
	this.capacity = capacity;
}
public OilPump() {
	
}
@Override
public String toString() {
	return "OilPump [Id=" + Id + ", capacity=" + capacity + "]";
}
@Override
public void run() {
	System.out.println("oilpump starts");
	PetrolEngine p= new PetrolEngine();
	DieselEngine d= new DieselEngine();
	p.fflag=true;
	d.fflag=true;
	Thread.yield();
		System.out.println("oilpump stops");
	
	
}
 
 
}
