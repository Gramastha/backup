package com.psl.bean;

public class Vehical {
	private String chassisNumber;
	private int manYear;
	private COLOR color;
	private Engine engine;
	private String NickName;
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public int getManYear() {
		return manYear;
	}
	public void setManYear(int manYear) {
		this.manYear = manYear;
	}
	public COLOR getColor() {
		return color;
	}
	public void setColor(COLOR color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getNickName() {
		return NickName;
	}
	public void setNickName(String nickName) {
		NickName = nickName;
	}
	@Override
	public String toString() {
		return "Vehical [chassisNumber=" + chassisNumber + ", manYear="
				+ manYear + ", color=" + color + ", engine=" + engine
				+ ", NickName=" + NickName + "]";
	}
	public boolean validate() {
		boolean flag= true;
		if(chassisNumber.length()>6 && engine.getEngineNo().length()>6){
			{
				System.out.println("Invalid chassis number or engine number");
				flag= false;
			}
			if(manYear<1960 || manYear>2009){
				System.out.println("Invalid chassis number or engine number");
				flag= false;
			}
			if(!color.contains(color.toString())){
				flag=false;
				System.out.println("Invalid color");
			}
		}
		return flag;
	}
	
	
	
	
	
	
	
	
}
