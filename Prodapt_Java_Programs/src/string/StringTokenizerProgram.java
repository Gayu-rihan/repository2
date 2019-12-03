package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerProgram {

////		char delimiter=',';
////		String str="He is a very very good boy, isn't he?";
////
////        int index = str.indexOf(delimiter);
////        
////        StringTokenizer st=new StringTokenizer(str);
//////		for(int i=0;i<size;i++){
//////			st=new StringTokenizer("He is a very very good boy, isn't he?",str[i]);	
//////		}
//////		System.out.println(st.nextToken(" "));
//////		System.out.println(st.nextToken(","));
////		
////		while(st.hasMoreTokens()) {
////			System.out.println(st.nextToken());
////			System.out.println(st.nextToken(","));
//		 
//		       Scanner scan = new Scanner(System.in);
//		        String str = scan.nextLine();
//		        scan.close();
//		      // eliminate leading and trailing spaces 
//		        str = str.trim(); 
//		  
//		        // split all non-alphabetic characters 
//		        String delims = "\\W+"; // split any non word 
//		        String[] tokens = str.split(delims); 
//		        System.out.println(tokens.length);
//		        StringTokenizer st = null;
//		        // print the tokens 
//		        for (String item : tokens) { 
//		        	 st=new StringTokenizer(item);
//		        	 while(st.hasMoreTokens()) {
//							System.out.println(st.nextToken());
//				        }
//		             
//	 		}
		
		 public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);            
		              // eliminate leading and trailing spaces 
		               if (!scan.hasNext()){
		            System.out.println(0);
		        }else {
		             String input=scan.nextLine();
		            String[]a = input.trim().split("[ !,?._'@]+");
		            ArrayList<String>strings =new ArrayList<String>(Arrays.asList(a));
		            System.out.println(strings.size());
		      
		          for(String str:strings){
		            System.out.println(str);
		          }    
		        }
		    scan.close();
		    }

		        

	}


