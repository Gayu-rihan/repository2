package com.restaurant.abc.main;

//importing all the necessary classes
import java.util.Scanner;
import com.restaurant.abc.bean.Book;
import com.restaurant.abc.bean.Customer;
import com.restaurant.abc.exceptions.RoomAlreadyBookedException;
import com.restaurant.abc.service.HotelService;

public class Room {
	static Scanner sc = new Scanner(System.in);
	static int choice;
	public void roomType(int choice) throws RoomAlreadyBookedException {
		//Creating instance for required class.
		Customer cust = new Customer();
		Book book = new Book();
		HotelService hotelService = new HotelService();
		
		System.out.println("Choose room type :\r\n" + "1. Luxury Double Room \r\n" +"2.Deluxe Double Room \r\n" + "3. Luxury Single Room \r\n" + "4.Deluxe Single Room\r\n" + "");
		//Initializing variables.
		int roomType=sc.nextInt(); //Dynamically getting choices from user.
		double amount = 0; 
		switch(choice) {
		case 1:
				//Based on room type details will be displayed.
				switch(roomType) {
					case 1:	System.out.println("Number of double beds : 2\r\n" +"AC : Yes\r\n" +"Free breakfast : Yes\r\n" +"Charge per day:4000 \r\n" +"");
							amount = 4000;
							break;
					case 2:	System.out.println("Number of double beds : 1\r\n" +"AC : Yes\r\n" +"Free breakfast : Yes\r\n" +"Charge per day:3500 \r\n" +"");
							amount = 3500;		
							break;
					case 3:	System.out.println("Number of double beds : 1\r\n" +"AC : Yes\r\n" +"Free breakfast : No\r\n" +"Charge per day:3000 \r\n" +"");
							amount = 3000;
							break;
					case 4:	System.out.println("Number of double beds : 1\r\n" +"AC : No\r\n" +"Free breakfast : No\r\n" +"Charge per day:2000 \r\n" +"");
							amount = 2000;
							break;
				}
				break;
		case 2:	//Displays room availability
				System.out.println("Number of rooms available : 20");
				break;
		case 3:	//For booking room
				System.out.println("Choose room number from : \r\n" + "1,2,3,4,5,6,7,8,9,10\r\n" );
				System.out.println("Enter room number: \n" );
				int roomNo=sc.nextInt();
				//Validating room number
				while(roomNo<0 || roomNo>10) {
					System.out.println("Please enter the valid room number	:	");
					roomNo=sc.nextInt();
					//If room is already booked then throws exception
					if(roomNo==5 || roomNo==8) {
						throw new RoomAlreadyBookedException("Room already Booked, please select some other rooms");	
					}
				}	
				//Getting Customer details
				System.out.println("Enter customer name: \n" );
				cust.setCustName(sc.next());
				System.out.println("Enter contact number: \n" );
				cust.setMobile(sc.nextLong());
				System.out.println("Enter customer email: \n" );
				cust.setEmail(sc.next());
				//validate customer details.
				hotelService.validateCustomer(cust);
				if(hotelService.flag==0) {
					break; //if invalid then break the execution.
				}
				//Assigning Customer Id returned by Class HotelService.
				long custId = hotelService.addCustomer(cust);
				System.out.println("Customer Information saved successfully. Your Customer Id is:"+  custId );
				System.out.println("Kindly enter the duration(in days)    : ");
				int duration = sc.nextInt();
				book.setDuration(duration);
				amount = duration*amount;
				System.out.println("Amount need to pay    :"+amount);
				book.setAmount(amount);
				book.setCustId(custId);
				//Assigning Book Id returned by HotelService.
				long bookId = hotelService.bookRoom(book);
				System.out.println("Your booking request is generated.Your Hotel Book ID is:"+bookId);
				break;
			
		}
		
	}
}
