package com.restaurant.abc.bean;

public class Book {
	private long custId;
	private double Amount;
	private String custName;
	private int duration;
	//creating a parameterized constructor for storing values in map 
	public Book(double Amount, int duration, String custName, long custId) {
		this.custName = custName;
		this.duration = duration;
		this.Amount = Amount;
		this.custId = custId;
	}
	//Creating Zero argument constructor for Book
	public Book() {
		
	}
	//getters and setters methods for Hotel Booking details
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	private long BookID;
	public long getBookID() {
		return BookID;
	}
	public void setBookID(long bookID) {
		BookID = bookID;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	


}
