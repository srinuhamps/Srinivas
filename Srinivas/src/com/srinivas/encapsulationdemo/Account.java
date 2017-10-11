package com.srinivas.encapsulationdemo;

public class Account {

	private int accountNumber;
	private String holderName;
	private int initialBalance;
	private boolean status;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public int getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
