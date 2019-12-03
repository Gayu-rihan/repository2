package prodapt.javaProgram;
import java.util.*;
import java.io.*;

public class Examples1 {
	    public static void main(String []argh){
	    	Scanner in = new Scanner(System.in);
	    	System.out.println("Enter the limit: ");
	        int t=in.nextInt();
	        int sum=0;
	        for(int i=0;i<t;i++){
	        	System.out.println("Enter a value: ");
	            int a = in.nextInt();
	            System.out.println("Enter b value: ");
	            int b = in.nextInt();
	            System.out.println("Enter c value: ");
	            int n = in.nextInt();
	          int j=1;
	          int mul=1;
	          
	            	for(j=0;j<n;j++) {
	            		a=a+(mul*b);
	            		System.out.print(a+" ");
	            		mul=mul*2;
	            	}
	            	           
	        }
	        in.close();
	    }
}


    

