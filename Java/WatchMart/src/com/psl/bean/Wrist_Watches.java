package com.psl.bean;

public class Wrist_Watches extends Watch {
private Style style;
private Gender gender;
private final boolean alarm = true;


public Wrist_Watches(int id, double cost, Type_Watch type, Shape shape,
		Brand brand, int quantity, Style style, Gender gender) {
	super(id, cost, type, shape, brand, quantity);
	this.style = style;
	this.gender = gender;
}


public Style getStyle() {
	return style;
}


public void setStyle(Style style) {
	this.style = style;
}


public Gender getGender() {
	return gender;
}


public void setGender(Gender gender) {
	this.gender = gender;
}


public boolean isAlarm() {
	return alarm;
}


@Override
public String toString() {
	
	return super.toString()+"[style=" + style + ", gender=" + gender + ", alarm="
			+ alarm + "]";
}



}
