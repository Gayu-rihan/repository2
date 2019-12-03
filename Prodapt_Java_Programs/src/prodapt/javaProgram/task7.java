package prodapt.javaProgram;

import java.util.Scanner;

public class task7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.next();
	int count=0;

	if (!((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') 
	        || (str.charAt(0)>= 'A' && str.charAt(1) <= 'Z') 
	        || str.charAt(0) == '_')) {
		System.out.println("Error 1");
		count++;
	}
	
	  
	    // Traverse the string for the rest of the characters 
	    for (int i = 1; i < str.length(); i++) 
	    { 
	        if (!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
	            || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
	            || (str.charAt(i) >= '0' && str.charAt(i) <= '9') 
	            || str.charAt(i) == '_')) {
	        	System.out.println("Error 2");
	        	count++;
	        	
	        }
	       
	           
	    } 
	    if(count==0)
	    	System.out.println("No Error");
	    sc.close();
}

}
