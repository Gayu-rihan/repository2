package prodapt.javaProgram;

import java.util.Scanner;

public class task4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	System.out.println("Enter the size of array: ");
	int size=sc.nextInt();
	int[] value=new int[size];
	System.out.println("Enter the array value: ");
	for(int i=0;i<size;i++) {
		value[i]=sc.nextInt();
	}
	int lar=value[0];
	for(int i=0;i<value.length;i++) {
		if(value[i]>lar)
			lar=value[i];
	}

	
	for(int j=0;j<value.length;j++)
	{
		for(int k=1;k<value.length;k++) {
			if(value[j]*value[k]==lar) {
				System.out.println(lar);
					count++;
					break;
			}
		}	
		
	}	
	if(count==0)
		System.out.println(-1);
	sc.close();
}
}

 