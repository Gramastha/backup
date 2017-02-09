package com.psl.factThread;

import java.util.ArrayList;
import java.util.List;

public class Number {
	
List<Integer> list;
public Number() {
	list= new ArrayList<Integer>();
}
public synchronized void setValue(int value){
	list.add(value);
}

public synchronized int getValue(int index){
return list.get(index);
}
public int size(){
	return list.size();
}
}
