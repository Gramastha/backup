package com.psl.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.psl.util.Utility;

public class UtilityTest {
	Utility utility;
	
	@Before
	public void init(){
		utility= new Utility();
	}
	
	@After
	public void unInit(){
		System.out.println("After method");
	}
	
	@BeforeClass
	public static void setupClass() {
		System.out.println("BEFORE setup class");
	}
	
	
	@AfterClass
	public static  void setAfterClass(){
		System.out.println("After Class");
	}
	
	@Test
	public void testPower(){
		
		
		int base=3, index=4;
		double expectedResult=81;
		double actualResult;
		
		actualResult=utility.power(base, index);
		
		Assert.assertEquals(expectedResult, actualResult,0.0);
	}
	
	@Test
	public void testValidemail() throws Exception{
		
		
		String email="abgramastha@abc.com";
		boolean expectedResult=true;
		boolean actualResult;
		String e="ab.gra@per.co.in";
		
		
			actualResult= utility.validateEmail(email);
		
		
		
		//Assert.assertEquals(expectedResult, actualResult);
		
		boolean ex=true,act;
		
			act=utility.validateEmail(e);
			Assert.assertEquals(ex, act);
		
		
	}
	
	@Test
	public void testInValidemail() throws Exception{
		
		
		
		
		String e="ab.gra@per.co..in";
		
		boolean act;
	
			act=utility.validateEmail(e);
			Assert.assertFalse(act);
		
		
	}
	
	@Test(expected= Exception.class)
	public void name() throws Exception {
		utility.validateEmail(" ");
		
	}
}
