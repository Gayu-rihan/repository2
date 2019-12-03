package task;

import java.util.Scanner;

public class HotelManagement {
	static Scanner sc = new Scanner(System.in);
	static int choice =0;
	static String ch="n";
	static int c;
	public static void roomType(int choice) throws RoomAlreadyBookedException {
		System.out.println("Choose room type :\r\n" + 
				"1. Luxury Double Room \r\n" + 
				"2.Deluxe Double Room \r\n" + 
				"3. Luxury Single Room \r\n" + 
				"4.Deluxe Single Room\r\n" + 
				"");
		int type=sc.nextInt();
		
		switch(choice) {
		case 1:
				switch(type) {
				case 1:System.out.println("Number of double beds : 2\r\n" + 
											"AC : Yes\r\n" + 
											"Free breakfast : Yes\r\n" + 
											"Charge per day:4000 \r\n" + "");
						break;
				case 2:System.out.println("Number of double beds : 1\r\n" + 
											"AC : Yes\r\n" + 
											"Free breakfast : Yes\r\n" + 
											"Charge per day:3500 \r\n" + "");
						break;
				case 3:System.out.println("Number of double beds : 1\r\n" + 
											"AC : Yes\r\n" + 
											"Free breakfast : No\r\n" + 
											"Charge per day:3000 \r\n" + "");
						break;
				case 4:System.out.println("Number of double beds : 1\r\n" + 
											"AC : No\r\n" + 
											"Free breakfast : No\r\n" + 
											"Charge per day:2000 \r\n" + "");
						break;
			
				}
				break;
		case 2: System.out.println("Number of rooms available : 20");
				break;
		case 3: System.out.println("Choose room number from : \r\n" + "1,2,3,4,5,6,7,8,9,10\r\n" ); 
				System.out.println("Enter room number: \n" );	
				int room=sc.nextInt();
				while(room<0 || room>10) {
					System.out.println("Please enter the valid room number");
					room=sc.nextInt();
				}
				
				while(room==5 || room==8) {
						
						throw new RoomAlreadyBookedException("Room is already Booked please select some other rooms");	
				}
				
				System.out.println("Enter customer name: \n" );
				sc.next();
				System.out.println("Enter contact number: \n" );
				sc.nextLong();
				break;
			
		}
		
	}
	
	public static void menu() {
		System.out.println("==========\r\n" + "Menu: \r\n" + "==========\r\n" + 
							"1. Sandwich Rs.50\r\n" + 
							"2. Pasta Rs.60\r\n" + 
							"3. Noodles Rs.70\r\n" + 
							"4. Coke Rs.30\r\n" + "");
		System.out.println("Enter your choice:\r\n " );
		int menu=sc.nextInt();
		System.out.println("***************Enjoy your meals***************");
	}
	
	
	public static void main(String[] args) throws RoomAlreadyBookedException {
		
		do {
			System.out.println("Enter your choice :\r\n" + 
					"1.Display room details\r\n" + 
					"2.Display room availability \r\n" + 
					"3. Book\r\n" + 
					"4.Order food\r\n" + 
					"5.Checkout\r\n" + 
					"6.Exit\r\n" + "");
					choice = sc.nextInt();
			switch(choice) {
			case 1: roomType(choice);
				   	System.out.println("Continue : (y/n)");
				   	ch=sc.next();
				   	break;
			case 2: roomType(choice);
			  		System.out.println("Continue : (y/n)");
			  		ch=sc.next();   
			  		break;
			case 3: roomType(choice);
					System.out.println("Continue : (y/n)");
					ch=sc.next(); 
					break;
			case 4: menu();
					System.out.println("Continue : (y/n)");
					ch=sc.next(); 
					break;
			case 5: System.out.println("Thanks for Staying in our Hotel");
					System.out.println("Continue : (y/n)");
					ch=sc.next(); 
					break;
			case 6: System.out.println("*********************");
					System.out.println("Continue : (y/n)");
					ch=sc.next(); 
					break;
			
			}
			
		}while(ch.equals("y"));	
		
		
		
	}
	
	
}
