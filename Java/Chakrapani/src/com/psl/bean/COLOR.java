package com.psl.bean;

import java.awt.Color;

public enum COLOR {
		red,green,blue,yellow,grey,black;
		
		public boolean contains(String s){
			boolean f=false;
			for (int i = 0; i < COLOR.values().length; i++) {
				if(COLOR.values()[i].toString().equalsIgnoreCase(s)){
					f=true;
				}
			}
			return f;
		}
}
