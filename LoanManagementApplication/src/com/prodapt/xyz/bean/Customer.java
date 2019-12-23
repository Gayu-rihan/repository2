package com.prodapt.xyz.bean;

public class Customer {
	private long custId;
	private String custName;
	private String address;
	private long mobile;
	private String email;

	// parameterized constructor for storing Customer details in map
	public Customer(String custName, String address, String email, long mobile) {
		this.custName = custName;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}

	public Customer() {

	}

	// getters and setters for customer details
	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
