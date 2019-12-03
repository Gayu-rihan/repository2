package prodapt.javaProgram;
import java.text.*;
import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*******Enter the total runs scored*****");
		double score=sc.nextInt();
		System.out.println("Enter number of fours(4's):" );
		double noOfFours=sc.nextInt();
		System.out.println("Enter number of sixes(6's):" );
		double noOfSixes=sc.nextInt();
		DecimalFormat df = new DecimalFormat("#.##");
		
		double boundaryScore=4*noOfFours + 6*noOfSixes;
		double runs=score-boundaryScore;
		System.out.println(score);
		double runPercentage=(runs/score)*100;
		
		System.out.println("Percentage scored by running: " + df.format(runPercentage));
	
		
		sc.close();

	}
}
