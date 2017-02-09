package com.psl.client;

import com.psl.model.Aeroplane;
import com.psl.model.Driveable;
import com.psl.model.Steerable;
import com.psl.model.Truck;

public class Main {

	public static void main(String[] args) {
		driver(new Truck());
		driver(new Aeroplane());
		steer(new Aeroplane());

	}
public static void driver(Driveable dr){
	dr.drive();
}
public static void steer(Steerable st){
	st.steer();
	}
}
