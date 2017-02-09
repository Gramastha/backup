package com.psl.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.psl.bean.Employee;
import com.psl.bean.EventEnum;
import com.psl.exception.InvalidDayException;

public class Utility implements Reminder_Service_interface{

	@Override
	public List<Employee> fetchAllEmployeeDetails() {
	List<Employee> employees= new ArrayList<Employee>();
	Scanner scr;
	try {
		scr= new Scanner(new File("employeetxt.txt"));
		while(scr.hasNextLine()){
			String words[]= scr.nextLine().split("-",4);
			SimpleDateFormat df= new SimpleDateFormat("yyyy/MM/dd");
			if(words.length<4) continue;
				employees.add(new Employee(Integer.parseInt(words[0]), words[1], df.parse(words[2]), df.parse(words[3])));
		
		}
		scr.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}catch (NumberFormatException | ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return employees;
	}

	@Override
	public StringBuffer fetchEventMessage(String fileName) {
		StringBuffer sb= new StringBuffer();
		try {
			Scanner scr= new Scanner(new File(fileName));
			while(scr.hasNextLine()){
				sb.append(scr.nextLine()+"\n");
			}
			scr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb;
	}

	@Override
	public Map<EventEnum, Set<Employee>> fetchEventDetails(List<Employee> empList, Date date) throws InvalidDayException {
		Map<EventEnum, Set<Employee>> details= new HashMap<EventEnum, Set<Employee>>();
		Set<Employee> bday= new TreeSet<Employee>();
		Set<Employee> ann= new TreeSet<Employee>();
		for(Employee e:empList){
			
			if(e.getAnniversaryDate().getDate()==(date.getDate()) && e.getAnniversaryDate().getMonth()==date.getMonth()){
				
				ann.add(e);
			}
			if(e.getBirthDate().getDate()==(date.getDate()) && e.getBirthDate().getMonth()==date.getMonth()){
				bday.add(e);
				
			}
		}
		
		details.put(EventEnum.ANNIVERSARY, ann);
		details.put(EventEnum.BIRTHDAY, bday);
		
		
		return details;
	}

	@Override
	public void sortEmployeesByName(Set<Employee> empSet) {
		Set<Employee> emp= new TreeSet<Employee>();
		emp.addAll(empSet);
		/*for(Employee e: emp){
			System.out.println(e.getEmployeeName());
		}*/
		empSet.removeAll(empSet);
		empSet.addAll(emp);
		for(Employee e: empSet){
			System.out.println(e.getEmployeeName());
		}
		
	}

	@Override
	public int calculateEventYears(Date eventDate, Date sysDate)
			throws Exception {
		 return sysDate.getYear()-eventDate.getYear();
		
	}

	@Override
	public Map<EventEnum, List<StringBuffer>> employeeWishContent(
			Map<EventEnum, Set<Employee>> empListMap, StringBuffer s) throws Exception {
		
		Map<EventEnum, List<StringBuffer>> display= new HashMap<EventEnum, List<StringBuffer>>();
		List<StringBuffer> bday= new ArrayList<>();
		List<StringBuffer> ann= new ArrayList<StringBuffer>();
		for(Map.Entry<EventEnum,Set<Employee>> mapentry: empListMap.entrySet()){
			//System.out.println(mapentry.getKey());
			if(mapentry.getKey().toString().equals(EventEnum.ANNIVERSARY.toString())){
			//	System.out.println("You are here");
			for(Employee e:mapentry.getValue()){
				String msg=s.toString();
				msg=msg.replace("<EVENT>", mapentry.getKey().toString());
				msg=msg.replace("<NAME>", e.getEmployeeName());
				
				msg=msg.replace("<EVENTDATE>", e.getAnniversaryDate().getDate()+"/"+e.getAnniversaryDate().getMonth());
				msg=msg.replace("<AGE>", calculateEventYears(e.getAnniversaryDate(), new Date())+"");
			ann.add(new StringBuffer(msg));
			}
			
			}
			
			if(mapentry.getKey().toString().equals(EventEnum.BIRTHDAY.toString())){
				//System.out.println("You are here");
				for(Employee e:mapentry.getValue()){
					String msg=s.toString();
					msg=msg.replace("<EVENT>", mapentry.getKey().toString());
					msg=msg.replace("<NAME>", e.getEmployeeName());
					
					msg=msg.replace("<EVENTDATE>", e.getBirthDate().getDate()+"/"+e.getBirthDate().getMonth());
					msg=msg.replace("<AGE>", calculateEventYears(e.getBirthDate(), new Date())+"");
					ann.add(new StringBuffer(msg));
				}
			
			}
		}
		display.put(EventEnum.ANNIVERSARY, ann);
		display.put(EventEnum.BIRTHDAY, bday);
		return display;
		
	}

}
