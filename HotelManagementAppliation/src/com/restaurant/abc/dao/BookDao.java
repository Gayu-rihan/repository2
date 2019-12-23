package com.restaurant.abc.dao;

//Import all the required packages
import java.util.HashMap;
import java.util.Map;
import com.restaurant.abc.bean.Book;
import com.restaurant.abc.bean.Customer;

//Class that stores and returns bookID and CustomerID
public class BookDao implements IBookDao{
	
	private Map<Long,Customer> customerEntry;
	private Map<Long,Book> bookEntry;
	
	//add booking details into map
	public long bookRoom(Book book) {
		bookEntry  =new HashMap<Long, Book>();
		bookEntry.put(book.getBookID(),new Book(book.getAmount(),book.getDuration(),book.getCustName(),book.getCustId()));
	
			return book.getBookID();
	}
	//add customer details into map
	public long addCustomer(Customer cust) {
		customerEntry = new HashMap<Long, Customer>();
		customerEntry.put(cust.getCustId(), new Customer(cust.getCustName(),cust.getEmail(),cust.getMobile()));
		
			return cust.getCustId();
		
	}

}


