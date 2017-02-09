package com.psl.beans;


import java.util.Calendar;
import java.util.Date;


public class LeaveBalance {
	private Date startdate,enddate;
	private String type;
	private int no_of_days;
	
	public LeaveBalance(Date startdate, Date enddate, String type,
			int no_of_days) {
		super();
		this.startdate = startdate;
		this.enddate = enddate;
		this.type = type;
		this.no_of_days = no_of_days;
	}
	
	public static int calculateNumberofdays(Date start,Date end){
		Calendar st = Calendar.getInstance();
		Calendar stop= Calendar.getInstance();
		st.setTime(start);
		stop.setTime(end);
				
		return stop.get(Calendar.DATE)-st.get(Calendar.DATE)+1;
		
	}
	public static String showdate(Date d){
		Calendar st = Calendar.getInstance();
		st.setTime(d);
		return (st.get(Calendar.DATE)+1)+"/"+(st.get(Calendar.MONTH)+1)+"/"+(st.get(Calendar.YEAR)+1900);
		
	}

	@Override
	public String toString() {
		return type+"\t\t"+showdate(startdate)+"\t\t"+showdate(enddate)+"\t\t"+no_of_days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enddate == null) ? 0 : enddate.hashCode());
		result = prime * result + no_of_days;
		result = prime * result
				+ ((startdate == null) ? 0 : startdate.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LeaveBalance other = (LeaveBalance) obj;
		if (enddate == null) {
			if (other.enddate != null)
				return false;
		} else if (!enddate.equals(other.enddate))
			return false;
		if (no_of_days != other.no_of_days)
			return false;
		if (startdate == null) {
			if (other.startdate != null)
				return false;
		} else if (!startdate.equals(other.startdate))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
