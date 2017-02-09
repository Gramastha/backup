package com.psl.bean;

public class DieselEngine extends Engine{
	public boolean fflag= false;
	
	public DieselEngine() {
		setEngineType("Diesel");
	}

	@Override
	public void run() {

		if(fflag){
		super.run();
		
			flg=true;
			
			
		
		}

	}
	
	

}
