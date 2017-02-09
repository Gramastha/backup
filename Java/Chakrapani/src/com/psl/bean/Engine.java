package com.psl.bean;

public class Engine extends Thread{

private String engineNo,EngineType;
public boolean flg=false;
public String getEngineNo() {
	return engineNo;
}
public void setEngineNo(String engineNo) {
	this.engineNo = engineNo;
}
public String getEngineType() {
	return EngineType;
}
public void setEngineType(String engineType) {
	EngineType = engineType;
}
public CylinderNumber getCylinderNumber() {
	return cylinderNumber;
}
public void setCylinderNumber(CylinderNumber cylinderNumber) {
	this.cylinderNumber = cylinderNumber;
}
public Strokes getStrokes() {
	return strokes;
}
public void setStrokes(Strokes strokes) {
	this.strokes = strokes;
}
private CylinderNumber cylinderNumber;
private Strokes strokes;
@Override
public String toString() {
	return "Engine [engineNo=" + engineNo + ", EngineType=" + EngineType
			+ ", cylinderNumber=" + cylinderNumber + ", strokes=" + strokes
			+ "]";
}


@Override
	public void run() {
	if(flg){
		System.out.print("Engine of "+Thread.currentThread().getName()+" starts");
	}
	
	}

}
