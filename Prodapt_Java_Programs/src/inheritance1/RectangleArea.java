package inheritance1;

import java.util.Scanner;

public class RectangleArea extends Rectangle{
	Scanner sc=new Scanner(System.in);
	void read_input() {
		System.out.println("Enter the width :");
		fields_width=sc.nextInt();
		System.out.println("Enter the height :");
		height=sc.nextInt();
	}
	
	void display() {
		System.out.println(fields_width*height);
	}
	
	public static void main(String[] args) {
		RectangleArea rect=new RectangleArea();
		rect.read_input();
		rect.display();
	}
	

}
