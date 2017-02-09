package com.psl.util;

public class TestClass {
	
	@Text
	public void testFactorial(){
		MathUtil mt= new MathUtil();
		long expectedResult=120;
		long actualResult;
		actualResult=mt.factorial(5);
		assert expectedResult==actualResult;
	}

}
