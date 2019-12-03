package collection;

import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<>();
		hs.add("Ram");
		hs.add("Gaya");
		hs.add("Bala");
		hs.add("Kumar");
		//Insertion order won't maintain
		System.out.println(hs);
		hs.add("Ram");
		//duplicates are not allowed
		System.out.println(hs);
		hs.add(null);
		System.out.println(hs);
		//only one null value is allowed
		hs.add(null);
		System.out.println(hs);
		
		
		System.out.println("hs.toString():	"+hs.toString());
		System.out.println("hs.hashCode():	"+hs.hashCode());		
		System.out.println("hs.size():	"+hs.size());
		System.out.println("hs.contains(null):	"+hs.contains(null));
		System.out.println("hs.equals(null):	"+hs.equals(null));
		System.out.println("hs.isEmpty():	"+hs.isEmpty());
		System.out.println("hs.remove(null):	"+hs.remove(null));
		System.out.println("hs.stream():	"+hs.stream());
		System.out.println("hs.parallelStream():	"+hs.parallelStream());
		hs.clear();
		System.out.println("hs:	"+hs);
		hs.add("Ram");
		hs.add("Gaya");
		hs.add("Bala");
		hs.add("Kumar");
		
		HashSet<Integer> hi= new HashSet<>();
		hi.add(26);
		hi.add(33);
		hi.add(100);
		hi.add(74);
		System.out.println("hs:	"+hs);
		System.out.println("hi:	"+hi);
		hs=(HashSet<String>) hi.clone();
		System.out.println("hs:	"+hs);
//		
		Object[] str=hs.toArray();
		//String[] str1=(String[])hs.toArray();
		
		System.out.println(str.toString());
		System.out.println();
		
		
		
	}

}
