package com.psl.client;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.psl.util.TestClass;
import com.psl.util.Text;

public class ClientAnno {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		TestClass t= new TestClass();
		Class<?> testClass= TestClass.class;
		
		Method methods[]= testClass.getDeclaredMethods();
		for(Method m:methods){
			
			if(m.isAnnotationPresent( Text.class))
				System.out.println(m.invoke(t, null));
		}
	}

}
