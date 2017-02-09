package com.psl.sync;

import java.util.ArrayList;
import java.util.List;


public class Storage {
private int i;
private int counter=0;
public void setValue(int value){
	i=value;
	counter++;
}

public int getValue(){
return i;
}
public int size(){
	return counter+1;
}
}

/*
 * 
 * 
private List<Integer> store;
public Storage() {
	store=new ArrayList<Integer>();
}

public void setValue(int value){
	store.add(value);
}

public int getValue(int index){
return store.get(index);
}
public int size(){
	return store.size();
}
public boolean contains(int value){
	
	if(store.contains(value))return true;
	
	return false;
}
 */