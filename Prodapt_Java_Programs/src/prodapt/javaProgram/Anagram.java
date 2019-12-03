package prodapt.javaProgram;

import java.util.Scanner;

public class Anagram {
	
	 static boolean isAnagram(String a, String b) {
	        // Complete the function
	       boolean flag = false;
	       a=a.toLowerCase();
	       b=b.toLowerCase(); 
	       char[] c = a.toCharArray();
	       char[] d = b.toCharArray();
	       char csort[]=new char[c.length];
	       char dsort[]=new char[d.length];
	        //sorting char[] c
	       int count=0;
	        for(int i=0;i<c.length;i++)
	        {
	            count=0;
	            for(int j=0;j<c.length;j++)
	            {
	                if(c[i]>c[j])
	                {
	                  count++;
	                }
	            }
	            csort[count]=c[i];
	        }
	        //Sorting char[] d
	         for(int i=0;i<d.length;i++)
	        {
	            count=0;
	            for(int j=0;j<d.length;j++)
	            {
	                if(d[i]>d[j])
	                {
	                  count++;
	                }
	            }
	            dsort[count]=d[i];
	        }
	       String str1 = new String (csort);
	       String str2 = new String (dsort);
	       if (str1.equals(str2)) {
	          flag = true;
	       }
	      return flag;
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	
}
