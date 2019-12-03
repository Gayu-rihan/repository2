package string;

import java.util.Scanner;

public class StringProgram1 {
	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String C=A+B;
        int size=C.length();
        char a=A.charAt(0);
        char b= B.charAt(0);
        System.out.println(size);
        if(a>b)
        	System.out.println("No");
        else
        	System.out.println("Yes");
        a=(char) (a-32);
        b=(char) (b-32);
      
        
        System.out.println( a+A.substring(1)+ " "+b+B.substring(1));
        
    }
}
