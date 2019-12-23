package com.restaurant.abc.service;

import java.util.Random;
import com.restaurant.abc.bean.Book;
import com.restaurant.abc.bean.Customer;
import com.restaurant.abc.dao.BookDao;
import com.restaurant.abc.dao.IBookDao;
import com.restaurant.abc.exceptions.InValidMobileNoException;
import com.restaurant.abc.exceptions.InvalidNameException;

public class HotelService implements IHotelService{
	//creating a dao object for accessing methods
	Book book = new Book();
	IBookDao bookDao = new BookDao();
	public int flag =0;
	
	public long bookRoom(Book Book) {
		//generating random numbers for Book id
		Random randomId=new Random();
		Book.setBookID(Math.abs((randomId.nextLong())));
		return bookDao.bookRoom(Book);
		
	}

	public Customer validateCustomer(Customer customer) {
		
		//validating customer name and address
		if(isValidName(customer.getCustName()))
		{
			if(isMobileNoValid(customer.getMobile()))
			{
				//If valid customer details then flag value increases.
				flag++;
			}
			//If Invalid customer details then exception will be thrown.
			else
			{
				try {
					throw new InValidMobileNoException();
				} catch (InValidMobileNoException e) {
					System.out.println(e);
				}
			}
		}
		else
		{
			try {
				throw new InvalidNameException();
			} catch (InvalidNameException e) {
				System.out.println(e);
			}
		}
		//If flag value greater than zero then customer object will be returned to class Room.
		if(flag != 0)
			return customer;
		else
			return null;
	}
	 // To check if the given mobile no is correct or not
	private boolean isMobileNoValid(long mobile) { 
		if(Long.toString(mobile).length() == 10)
			return true;
		else
		return false;
	}
	// To check if the given user name is correct or not
	private boolean isValidName(String custName) { 
		return custName.matches( "[a-zA-Z]*" );
	}

	public long addCustomer(Customer cust) {
		//generating random numbers for customer id
		Random random=new Random();
		cust.setCustId(Math.abs((random.nextLong())));
		return bookDao.addCustomer(cust);
	}





}
