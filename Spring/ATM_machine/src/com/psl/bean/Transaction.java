package com.psl.bean;

public class Transaction {
	private int debit;
	private int credit,tid;
	private Account acc_id;
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public int getDebit() {
		return debit;
	}
	public void setDebit(int debit) {
		this.debit = debit;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public Account getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(Account acc_id) {
		this.acc_id = acc_id;
	}
	public Transaction(int debit, int credit, int tid, Account acc_id) {
		super();
		this.debit = debit;
		this.credit = credit;
		this.tid = tid;
		this.acc_id = acc_id;
	}
	
	

}
