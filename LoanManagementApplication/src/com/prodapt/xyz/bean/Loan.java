package com.prodapt.xyz.bean;

public class Loan {
	private long loanID;
	private double loanAmount;
	private long custId;
	private int duration;

	// parameterized constructor for storing loan details in map
	public Loan(double loanAmount, int duration, long custId) {
		this.custId = custId;
		this.duration = duration;
		this.loanAmount = loanAmount;
	}

	public Loan() {

	}

	// getters and setters methods for loan details
	public long getLoanID() {
		return loanID;
	}

	public void setLoanID(long loanID) {
		this.loanID = loanID;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
