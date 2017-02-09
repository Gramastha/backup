package com.psl.account;

public class NegativeAmountException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeAmountException() {
		super("Deposit amount is negative ");
	}
}
