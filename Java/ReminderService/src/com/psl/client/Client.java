package com.psl.client;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sun.security.x509.CertificateAlgorithmId;

import com.psl.bean.Employee;
import com.psl.bean.EventEnum;
import com.psl.exception.InvalidDayException;
import com.psl.util.Utility;

public class Client {
public static void main(String[] args) throws Exception {
	Utility utility= new Utility();
	List<Employee> emps= utility.fetchAllEmployeeDetails();
	for(Employee e:emps){
		System.out.println(e);
	}
	System.out.println(utility.fetchEventMessage("eventmsg.txt"));
	
	Map<EventEnum, Set<Employee>> employee;
	try {
		employee = utility.fetchEventDetails(emps, Date.valueOf("2016-09-04"));
		for(Map.Entry<EventEnum,Set<Employee>> mapentry: employee.entrySet()){
			System.out.println("----------------------------------------------");
			System.out.println(mapentry.getKey().toString());
			for(Employee e:mapentry.getValue()){
				System.out.println(e.getEmployeeName());
			}
		}
		Map<EventEnum, List<StringBuffer>> map= utility.employeeWishContent(employee, utility.fetchEventMessage("eventmsg.txt"));
		for(Map.Entry<EventEnum, List<StringBuffer>> m:map.entrySet()){
			System.out.println("--------------------------------------------------------\n"+m.getKey().toString());
			for(StringBuffer sb: m.getValue()){
				System.out.println(sb);
			}
		}
	} catch (InvalidDayException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	
	

	
/*Calendar c1= Calendar.getInstance();
Calendar c2= Calendar.getInstance(); 
c1.setTime(Date.valueOf("2018-04-24"));
c2.setTime(Date.valueOf("2014-04-25"));
int age= c1.get(Calendar.YEAR)-c2.get(Calendar.YEAR);
System.out.println("c1--:"+c1.get(Calendar.DAY_OF_YEAR));
System.out.println("c2--:"+c2.get(Calendar.DAY_OF_YEAR));
if(c1.get(Calendar.DAY_OF_YEAR)<c2.get(Calendar.DAY_OF_YEAR)){
	age--;
}
System.out.println(age);*/

}
}
