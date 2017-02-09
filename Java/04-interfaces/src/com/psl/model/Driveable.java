package com.psl.model;

public interface Driveable {
default public void drive(){
	System.out.println("default drive");
}
}
