package prodapt.javaProgram;

import java.util.Scanner;

public class task8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[][] value=new int[4][4];
	int size=value.length;
	int count=0;
	System.out.println("Enter the values: ");
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			value[i][j]=sc.nextInt();
		}
	}
	int pointer=value[0][0];
	for(int k=0;k<4;k++) {
		pointer=value[0][k];
		
		for(int i=1;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(pointer==value[i][j]) {
					count++;
				}
			}
		}
		if(count>=3)
			System.out.println(pointer);
		else 
			count=0;
			
		
	}
	if(count==0) {
		System.out.println(-1);
	}
	
	sc.close();
}
}
