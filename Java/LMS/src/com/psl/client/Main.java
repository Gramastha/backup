package com.psl.client;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.psl.beans.Employee;
import com.psl.beans.LeaveBalance;
import com.psl.beans.LeaveManager;

public class Main {
	static int empId;
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ParseException {
		
		LeaveManager lm= new LeaveManager();
		
			List<Employee> emp= lm.readDetails("EmployeeDetails.xml");
			Scanner scr= new Scanner(System.in);
			
			boolean flag=false;
			while(true){
			System.out.println("Enter employee id:");
			int id= Integer.parseInt(scr.nextLine());
			System.out.println("Enter password:");
			String pass=scr.nextLine();
			if(lm.login(id, pass, emp)){
				System.out.println("Login successfull....");
				flag=true;
				empId=id;
				break;
			}
			else{
				System.out.println("Login Unsuccessful.....");
				continue;
			}
			}
			while(flag){
				System.out.println("\n********************\n1. Show Leave Balance\n2. Show Leave Transactions\n3. Apply for Leave \n4. Logout \n********************\n\nEnter Choice\n");
				int i=Integer.parseInt(scr.nextLine());
				switch (i) {
				case 1:
					lm.showLeaveBalance(empId);
					break;
					
				case 2:
					try {
						List<LeaveBalance> lbal= lm.showLeaveTransactions(empId);
						System.out.println("Leave Type\t Start Date\t\t End Date\t\t Number of days");
						for(LeaveBalance lb:lbal){
							System.out.println(lb);
						}
						
					} catch (NumberFormatException | ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
					
				case 3:
					lm.showLeaveBalance(empId);
					System.out.println("Enter Leave Type: ");
					String leavetype=scr.nextLine();
					System.out.println("Enter Start Date(mm/dd/yyyy):");
					SimpleDateFormat df= new SimpleDateFormat("MM/dd/yyyy");
					Date d1= df.parse(scr.nextLine().trim());
					System.out.println("Enter End Date(mm/dd/yyyy):");
					Date end= df.parse(scr.nextLine().trim());
					System.out.println("Enter Number of days:");
					int days= Integer.parseInt(scr.nextLine().trim());
					if(end.before(d1)) {System.out.println("Incorrect date entered"); continue;}
					if(days!=LeaveBalance.calculateNumberofdays(d1, end) || days>2) {System.out.println("The count of number of days is not valid"); continue;}
					lm.update(d1, end, leavetype, days, empId);
					break;
				case 4:
					break;
				}
				if(i==4) break;
			}
		
	}

}
