package prodapt.javaProgram;

import java.util.Scanner;

public class exercise1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("*******Enter value from 0-6*****");
	System.out.println("Enter the value 1:" );
	int value1=sc.nextInt();
	System.out.println("Enter the value 2:" );
	int value2=sc.nextInt();
	if(value1<=0 || value1>6)
		System.out.println("Invalid input");
	else if(value2<=0 || value2>6)
		System.out.println("Invalid input");
	else
	{		
		if(value1 == value2 )
			System.out.println(2*(value1+value2));
		else
			System.out.println(value1+value2);
	}
	sc.close();

}
}
