package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetProgram {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		LinkedHashSet lhs=new LinkedHashSet();
		TreeSet ts=new TreeSet();
		System.out.println("********HashSet********");
		
		hs.add("Ram");
		hs.add("Gaya");
		hs.add("Bala");
		hs.add("Kumar");
		hs.add(26);
		hs.add(33);
		hs.add(100);
		hs.add(74);
		System.out.println("hash set:     "+hs); //random order
		System.out.println(" hs.size():   "+hs.size());
		System.out.println(" :   "+hs.equals(lhs));
		System.out.println(" :   "+hs.isEmpty());
		
		
		
		System.out.println("********LinkedHashSet********");
		
		lhs.add("Gaya");
		lhs.add("Bala");
		lhs.add("Kumar");
		lhs.add(26);
		lhs.add(33);
		System.out.println("Linkedhash set:     "+lhs); //insertion order
		System.out.println(" :   "+lhs.size());
		System.out.println(" :   "+lhs.isEmpty());
		
		System.out.println("********TreeSet********");
		
		ts.add(26);
		ts.add(33);
		ts.add(100);
		ts.add(74);
		
		System.out.println("TreeSet:	"+ts); //sorted order
		System.out.println(" :   "+ts.isEmpty());
		System.out.println(" :   "+ts.last());
		System.out.println(" :   "+ts.lower(ts));
		System.out.println(" :   "+ts.pollFirst());
		System.out.println(" :   "+ts.pollLast());
	
		
		
		
		

	}

}
