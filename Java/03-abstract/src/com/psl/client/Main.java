package com.psl.client;

import com.psl.entity.Circle;
import com.psl.entity.Rectangle;
import com.psl.entity.Shape;

public class Main {

	public static void main(String[] args) {
		
		Shape s= new Circle(4.3);
		Shape s1= new Rectangle(20, 30);
		
		shapeManager(s);
		shapeManager(s1);

	}
	public static void shapeManager(Shape shape){
		shape.calculateArea();
		shape.calculatePerimeter();
		
		System.out.println(shape.getArea());
		System.out.println(shape.getPerimeter());
	}

}
