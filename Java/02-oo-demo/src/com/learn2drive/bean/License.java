package com.learn2drive.bean;

import java.util.Date;

public class License {
	private long number;
	private Date issueDate, renewalDate;
	private String issuingRTO;
	
	
	
	
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getRenewalDate() {
		return renewalDate;
	}
	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}
	public String getIssuingRTO() {
		return issuingRTO;
	}
	public void setIssuingRTO(String issuingRTO) {
		this.issuingRTO = issuingRTO;
	}
	public License(long number, Date issueDate, Date renewalDate,
			String issuingRTO) {
		super();
		this.number = number;
		this.issueDate = issueDate;
		this.renewalDate = renewalDate;
		this.issuingRTO = issuingRTO;
	}
	public License() {
		super();
	}
	
	

}
