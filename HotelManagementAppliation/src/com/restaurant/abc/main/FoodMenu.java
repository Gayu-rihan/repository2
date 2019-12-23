package com.restaurant.abc.main;

import java.util.Scanner;

public class FoodMenu {
	//Creating instance for Scanner class for getting values from user
	static Scanner sc = new Scanner(System.in);
	public void menu() {
		System.out.println("==========\r\n" +"Menu: \r\n" +"==========\r\n" + "1. Sandwich Rs.50\r\n" +"2. Pasta Rs.60\r\n" +"3. Noodles Rs.70\r\n" +"4. Coke Rs.30\r\n" +"");
		System.out.println("Enter your choice:\r\n " );
		int menu=sc.nextInt(); //getting menu from user
		//validating menu choice.
		if(menu>0 && menu<=4) {
			System.out.println("***************Enjoy your meals***************");
		}
		else
			System.out.println("Enter valid menu option");
		
	}
}
