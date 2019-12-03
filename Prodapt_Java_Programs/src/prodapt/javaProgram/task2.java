package prodapt.javaProgram;

import java.util.Scanner;

public class task2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("*******Enter value from 0-6*****");
	System.out.println("Enter the value 1:" );
	int value1=sc.nextInt();
	System.out.println("Enter the value 2:" );
	int value2=sc.nextInt();
	int result=0;
	if(value1<=0 || value1>6)
		System.out.println("Invalid input");
	else if(value2<=0 || value2>6)
		System.out.println("Invalid input");
	
	else
	{		//if sum is greater than 8 than difference sum by 8 and twice the value
		if((value1+value2)>=8 ) {
			result=2*((value1+value2)-8);
			System.out.println(result);
		}
		//if sum is lesser than 8 than difference sum by 8 
		else
		{
			result=8-(value1+value2);
			System.out.println(result);
		}
	}
	sc.close();
}
}
