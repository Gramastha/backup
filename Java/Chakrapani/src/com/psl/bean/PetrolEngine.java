package com.psl.bean;

import java.util.ArrayList;
import java.util.List;

public class PetrolEngine extends Engine{
private List<String> Sparkplug;
public boolean fflag= false;
public void setSparkplug(List<String> sparkplug) {
	Sparkplug = sparkplug;
}

public List<String> getSparkplug() {
	return Sparkplug;
}

public List<String> setSparks(CylinderNumber cylinderNumber) {
	
	List<String> sparkList = new ArrayList<String>();
	int jj = 0;
if(cylinderNumber.toString().equals("one")){
		jj=1;
	}
if(cylinderNumber.toString().equals("two")){
	jj=2;
}
if(cylinderNumber.toString().equals("four")){
	jj=4;
}
if(cylinderNumber.toString().equals("twelve")){
	jj=12;
}
	for(int i=1;i<=jj;i++)
		sparkList.add("SP"+i);
	return sparkList;
	
}

@Override
public void run() {
	if(fflag){
	super.run();
	for(int i=0;i<Sparkplug.size();i++){
		System.out.println(Sparkplug.get(i)+" started");
		flg=true;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
}

}
