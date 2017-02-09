package com.psl.bean;

public class Ticket {

	private int bearthNo,CoachNo;
	private long pnr;
	private String name;
	
	
	
	
	public Ticket(String name) {
		super();
		this.name = name;
	}
	public Ticket() {
		super();
	}
	public Ticket(int bearthNo, int coachNo, long pnr, String name) {
		super();
		this.bearthNo = bearthNo;
		CoachNo = coachNo;
		this.pnr = pnr;
		this.name = name;
	}
	public int getBearthNo() {
		return bearthNo;
	}
	public void setBearthNo(int bearthNo) {
		this.bearthNo = bearthNo;
	}
	public int getCoachNo() {
		return CoachNo;
	}
	public void setCoachNo(int coachNo) {
		CoachNo = coachNo;
	}
	public long getPnr() {
		return pnr;
	}
	public void setPnr(long pnr) {
		this.pnr = pnr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format(
				"Ticket [bearthNo=%s, CoachNo=%s, pnr=%s, name=%s]", bearthNo,
				CoachNo, pnr, name);
	}
	
	
}
