package prodapt.javaProgram;

import java.util.Scanner;

public class task6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the depoit: ");
		double deposit=sc.nextInt();
		System.out.println("Enter the interest: ");
		int rateOfInterest=sc.nextInt();
		System.out.println("Enter the thershold: ");
		int threshold=sc.nextInt();
		int year=0;
		double interest=0;
		
		while(deposit<threshold){
			interest=(deposit*rateOfInterest)/100;
			deposit=deposit+interest;
			year++;
		}
		System.out.println(year);
		sc.close();
		
	} 

}
