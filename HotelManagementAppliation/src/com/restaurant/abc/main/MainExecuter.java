package com.restaurant.abc.main;

//importing all the required classes
import java.util.Scanner;
import com.restaurant.abc.exceptions.RoomAlreadyBookedException;

public class MainExecuter {
		//Create instance for required classes 
		Scanner sc = new Scanner(System.in);
		FoodMenu food = new FoodMenu();
		Room room = new Room();
		//Declaring and initializing variables.
		static int choice =0;
		static String ch="n";
		
		//start method(). Execution of application starts here
		void start() throws RoomAlreadyBookedException {
			//The process should be executed at-least once so do-while loop is used.
			do {
				System.out.println("Enter your choice :\r\n" +"1.Display room details\r\n" +"2.Display room availability \r\n" +"3. Book\r\n" +"4.Order food\r\n" +"5.Checkout\r\n" +"6.Exit\r\n" +	"");
				choice = sc.nextInt(); //getting choice from user.
				//Based on choice, case will execute.
				switch(choice) {
				case 1:	//Display room details
						room.roomType(choice);
					   	System.out.println("Continue : (y/n)"); 
					   	ch=sc.next();
					   	break;
				case 2:	//Display room availability 
						room.roomType(choice); 
				  		System.out.println("Continue : (y/n)");
				  		ch=sc.next();   
				  		break;
				case 3:	//Book
						room.roomType(choice); 
						System.out.println("Continue : (y/n)");
						ch=sc.next(); 
						break;
				case 4:	//Order food
						food.menu(); 
						System.out.println("Continue : (y/n)");
						ch=sc.next(); 
						break;
				case 5:	//Check out
						System.out.println("Check out successfull");
						System.out.println("Continue : (y/n)");
						ch=sc.next(); 
						break;
				case 6: //Exit
						System.out.println("**********Thanks for Staying in our Hotel**********");
						System.out.println("Continue : (y/n)");
						ch=sc.next(); 
						break;
				}
				
			}while(ch.equals("y"));	
		}
		
		public static void main(String[] args) {
			//Creating instance for MainExecuter class
			MainExecuter exe = new MainExecuter();
			try {
				//Calling start method which contains execution code
				exe.start();
			} catch (RoomAlreadyBookedException e) {  
					System.out.println(e);	
		  }
	  }
}
