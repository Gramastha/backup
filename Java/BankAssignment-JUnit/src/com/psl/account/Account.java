package com.psl.account;

public class Account {
	private int accountNum;
	private String custName;
	private String type;
	private double amount;

	private double getAmount() {
		return amount;
	}

	private void setAmount(double amount) {
		this.amount = amount;
	}

	public Account(int accountNum, String custName, String type) {
		super();
		this.accountNum = accountNum;
		this.custName = custName;
		this.type = type;
		this.amount = -1;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Credits specified amount to the account
	 * 
	 * @param amt
	 * @throws NegativeAmountException
	 */
	public void deposit(double amt) throws NegativeAmountException {
		if (getBalance() >= 0)
			setAmount(getAmount() + amt);
		else
			throw new NegativeAmountException();
	}

	public void withdraw(double amt) throws InsufficientBalanceException {
		if (amt > getBalance())
			throw new InsufficientBalanceException();
		setAmount(getAmount() - amt);
	}

	public double getBalance() {
		return amount--;
	}
}
