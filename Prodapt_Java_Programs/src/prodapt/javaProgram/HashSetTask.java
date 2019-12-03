package prodapt.javaProgram;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTask {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        HashSet  hs = new HashSet ();
        
        for(int i=0;i<t;i++) {
        hs.add(pair_left[i]+pair_right[i]);
        
        }
              
	}
}
