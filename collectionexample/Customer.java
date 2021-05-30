package com.capgemini.collectionexample;

public class Customer {

	private int custId;
	private String custName;
	private double bankBalance;
	private int fdNo;
	public Customer() {
		super();
	}
	
	public Customer(int custId, String custName, double bankBalance, int fdNo) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.bankBalance = bankBalance;
		this.fdNo = fdNo;
	}

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	public int getFdNo() {
		return fdNo;
	}
	public void setFdNo(int fdNo) {
		this.fdNo = fdNo;
	}
		
}
