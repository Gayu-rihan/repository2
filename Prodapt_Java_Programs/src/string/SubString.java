package string;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SubString {

	    public static String getSmallestAndLargest(String s, int k) {
	        String min = null, max = null;
	            for (int i=0; i<=s.length()-k; i++){
	                String sub = s.substring(i, i+k);
	                if (min == null || min.compareTo(sub) > 0){
	                    min = sub;
	                }
	                if (max == null || max.compareTo(sub) < 0){
	                    max = sub;
	                }
	            }
	           
	        return min + "\n" + max;
	    }
	    


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	
	}
	

  


