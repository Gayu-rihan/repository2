package collection;

import java.util.TreeSet;

public class TreeSetProgram {
	public static void main(String[] args) {
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("Sam");                                                  
		ts1.add("Ram");
		ts1.add("Tom");
		TreeSet<String> ts2=new TreeSet<String>(ts1);
		System.out.println(ts1);
		System.out.println(ts2);
		
		TreeSet<Integer> ts3=new TreeSet<Integer>(new MyComparator());
		ts3.add(4);
		ts3.add(76);
		ts3.add(3);
		ts3.add(14);
		
		System.out.println(ts3);
	}
}
