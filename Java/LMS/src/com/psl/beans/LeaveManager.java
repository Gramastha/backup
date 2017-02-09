package com.psl.beans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeaveManager {
	static Leave leave;
	static int pos;

	public List<Employee> readDetails(String fname) throws ParserConfigurationException, SAXException, IOException{
		List<Employee> emList = new ArrayList<Employee>();
		File finput= new File(fname);
		DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
		DocumentBuilder db= dbf.newDocumentBuilder();
		Document doc= db.parse(finput);
		doc.getDocumentElement().normalize();
		
		NodeList nodes= doc.getElementsByTagName("Employee");
		for(int i=0;i<nodes.getLength();i++){
		Node node= nodes.item(i);
		Element element= (Element) node;
		
		emList.add(new Employee(Integer.parseInt(element.getElementsByTagName("empid").item(0).getTextContent()), element.getElementsByTagName("name").item(0).getTextContent(), element.getElementsByTagName("password").item(0).getTextContent(),element.getElementsByTagName("desg").item(0).getTextContent()));
		}
		
		return emList;
	}
	
	public boolean login(int userId, String password,List<Employee> lemp){
		boolean flag=false;
		for(Employee e:lemp){
			if(e.getEmpId()==userId && e.getEmppassword().equals(password)){
				flag= true;
				break;
			}
		}
		
		return flag;
	}
	
	public void showLeaveBalance(int empid) throws FileNotFoundException{
		
		Scanner sc= new Scanner(new File("LeaveBalance.csv"));
		sc.nextLine();
		int counter=1;
		leave =new Leave();
		while(sc.hasNextLine()){
			String[] word= sc.nextLine().split(",");
			int id= Integer.parseInt(word[0]);
			leave.setOl(Integer.parseInt(word[1]));
			leave.setPl(Integer.parseInt(word[2]));
			leave.setLwp(Integer.parseInt(word[3]));
			if(id==empid){
				pos=counter;
				System.out.println("Your leave balance is: "+leave);
				return;
			}
			counter++;
		}
			}
	
	
	public List<LeaveBalance> showLeaveTransactions(int empId) throws FileNotFoundException, NumberFormatException, ParseException{
		List<LeaveBalance> leaveBalList= new ArrayList<LeaveBalance>();

		
		Scanner sc= new Scanner(new File("Leavedetails.csv"));
		sc.nextLine();
		SimpleDateFormat df= new SimpleDateFormat("MM/dd/yyyy");
		while(sc.hasNextLine()){
			String[] word= sc.nextLine().split(",");
			int id= Integer.parseInt(word[0]);
			if(id==empId){
				
				leaveBalList.add(new LeaveBalance(df.parse(word[1]), df.parse(word[2]), word[3], Integer.parseInt(word[4])));
				
			}
		}
			
		
		return leaveBalList;
	}
	
	
	public void update(Date startdate, Date enddate, String type,int no_of_days, int empid) throws NumberFormatException, ParseException, IOException{
List<LeaveBalance> leaveBalList= new ArrayList<LeaveBalance>();

Scanner sc= new Scanner(new File("Leavedetails.csv"));
		sc.nextLine();
		SimpleDateFormat df= new SimpleDateFormat("MM/dd/yyyy");
		while(sc.hasNextLine()){
			String[] word= sc.nextLine().split(",");
			int id= Integer.parseInt(word[0]);
			leaveBalList.add(new LeaveBalance(df.parse(word[1]), df.parse(word[2]), word[3], Integer.parseInt(word[4])));
			}
		String str="";
		List<Leave> leaves= new ArrayList<Leave>();
		sc= new Scanner(new File("LeaveBalance.csv"));
		str=sc.nextLine();
		while(sc.hasNextLine()){
			
			String[] word= sc.nextLine().split(",");
			str=str+"\n"+word[0]+","+word[1]+","+word[2]+","+word[3];
			Leave l= new Leave();
			l.setOl(Integer.parseInt(word[1]));
			l.setPl(Integer.parseInt(word[2]));
			l.setLwp(Integer.parseInt(word[3]));
			leaves.add(l);
		}
				
		
		
		if(type.equalsIgnoreCase("ol") || type.equalsIgnoreCase("pl") || type.equalsIgnoreCase("lwp")){
			LeaveBalance lb= new LeaveBalance(startdate, enddate, type, no_of_days);
			if(leaveBalList.contains(lb)){
				System.out.println("Duplicate Leave: This leave has been already approved for you.");
				return;
			}
			else{
				leaveBalList.add(lb);
				if(type.equalsIgnoreCase("ol") && no_of_days>leave.getOl()){
					leave.setOl(leave.getOl()-no_of_days);
				}
				

				if(type.equalsIgnoreCase("pl") && no_of_days>leave.getPl()){
					leave.setPl(leave.getPl()-no_of_days);
				}
				

				if(type.equalsIgnoreCase("lwp") && no_of_days>leave.getLwp()){
					leave.setLwp(leave.getLwp()-no_of_days);
				}
				System.out.println(pos);
				leaves.remove(pos);
				leaves.set(pos, leave);//add(pos, leave);
				
			}
		}
		else{
			System.out.println("Invalid string type");
			return;
		}
		
		
		FileOutputStream fo= new FileOutputStream("LeaveBalanceOUT.csv");
		fo.write("empid,OL,PL,LWP".getBytes());
		fo.write(str.getBytes());
		fo.close();
		BufferedWriter bw=new BufferedWriter(new FileWriter(new File("LeavedetailsOUT.csv")));
		sc= new Scanner(new File("Leavedetails.csv"));
		while(sc.hasNextLine()){
			bw.append(sc.nextLine());
		}
		bw.append(empid+","+LeaveBalance.showdate(enddate)+","+LeaveBalance.showdate(enddate)+type+no_of_days);
		
	}
	
}
