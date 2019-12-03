package prodapt.javaProgram;
import java.io.*;
import java.util.*;

public class SamplePrograms {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] str=s.split(" ");
        int n=str.length;
        System.out.println(n);
        for(int i=0;i<str.length;i++) {
        	System.out.println(str[i]);
        }
        scan.close();
    }
}
