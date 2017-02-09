package com.psl.model;

public interface Steerable {
public default void steer(){
	System.out.println("default steer");
}
}
