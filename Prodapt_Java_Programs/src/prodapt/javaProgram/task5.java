package prodapt.javaProgram;

import java.util.Scanner;

public class task5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	System.out.println("Enter the value1: ");
	int value1=sc.nextInt();
	System.out.println("Enter the value2: ");
	int value2=sc.nextInt();
	System.out.println("Enter the value3: ");
	int value3=sc.nextInt();
	if(value3==(value1+value2)) {
		count++;
		System.out.println("Addition");
	}
	if(value3==(value1-value2)) {
		count++;
		System.out.println("Subtraction");
	}
	if(value3==(value1*value2)) {
		count++;
		System.out.println("Multiplication");
	}
	if(value3==(value1/value2)) {
		count++;
		System.out.println("Division");
	}
	if(value3==(value1%value2)) {
		count++;
		System.out.println("Modules");
	}
	if(count<1)
		System.out.println("Not Possible");
	sc.close();
}

}
