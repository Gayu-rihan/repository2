package com.restaurant.abc.bean;

public class Customer {
	private String custName;
	private long custId;
	private long mobile;
	private String email;
	//creating a parameterized constructor for storing values in map  
	public Customer(String custName, String email, long mobile) {
		this.custName = custName;
		this.email = email;
		this.mobile = mobile;
	}
	//Creating zero argument constructor for Customer
	public Customer() {
		
	}

	//getters and setters for customer details
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
