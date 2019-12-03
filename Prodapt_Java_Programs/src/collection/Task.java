package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		int sum=0;
		int a = 0;
		for(int i=0;i<=100;i++) {
				al.add(i);
		}
		Iterator<Integer> it=al.iterator();
		
//		while(it.hasNext()) {
//			a=(int) it.next();
//			sum+=a;
//		}
//		System.out.println("sum of 1 to 100:	"+sum);
		
		while(it.hasNext()) {
			a=(int) it.next(); //values
			if(a%2==0)
				sum+=a;
		}
		System.out.println("sum of even numbers:	"+sum);
}
}
