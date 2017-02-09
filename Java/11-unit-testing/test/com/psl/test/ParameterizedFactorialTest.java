package com.psl.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.psl.util.Utility;

@RunWith(value=Parameterized.class)
public class ParameterizedFactorialTest {
	private long number,expectedResult;

	public ParameterizedFactorialTest(long number, long expectedResult) {
		
		this.number = number;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection<Long[]> data(){
		
		Long[][] values={
				{4l,24l},{6l,720l},{8l,40320l}
		};
		
		return Arrays.asList(values);
		
	}
	
	@Test
	public void testFactorial(){
		long actualResult;
		actualResult= new Utility().factorial(number);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
}
