package collection;

import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		Vector<Integer> v1= new Vector<Integer>();
		v1.add(10);
		v1.add(15);
		v1.add(47);
		System.out.println(v1);
		Vector<String> v2= new Vector<String>();
		v2.add("Ram");
		v2.add("Bala");
		v2.add(null); //Null value also allowed
		v2.add("Ram"); //Duplicate allowed
		System.out.println(v2);
		
		System.out.println("Capacity :	"+v1.capacity());
		System.out.println("Contains 15 :	"+v1.contains(15));
		System.out.println("v1 equals v2 :	"+v1.equals(v2));
		System.out.println("get at 2 :	"+v1.get(2));
		System.out.println("element at 1 :	"+v1.elementAt(1));
		System.out.println("first element :	"+v1.firstElement());
		System.out.println("last element :	"+v1.lastElement());
		System.out.println("index at 47 :	"+v1.indexOf(47));
		System.out.println("hash code :	"+v1.hashCode());
		System.out.println("is empty :	"+v1.isEmpty());
		System.out.println("last Index of 15  :	"+v1.lastIndexOf(15));
		System.out.println("size of v1 :	"+v1.size());
		System.out.println("elements :	"+v1.elements());
		System.out.println("Inserting element 65 at 1 :	");
		v1.insertElementAt(65, 1);
		System.out.println("remove value at 1 :	"+v1.remove(1));
		System.out.println("remove element 10 :	"+v1.removeElement(10));
		System.out.println("remove all v1 :	"+v1.removeAll(v1));
		
		v1.clear();
		v1.add(12);
		System.out.println("clear :	"+v1);
		
		Vector<String> v3= (Vector<String>)v1.clone();
		System.out.println("v2: :	" + v2);
		System.out.println("v2: :	" + v3);
		v3.addAll(v2);
		
		System.out.println("v3 add all v2 :	" + v3);
		v3.removeAll(v2);
		System.out.println("v2 is removed from v3 :	" +v3);
		v3.addAll(v2);
		v3.retainAll(v2);
		System.out.println("retain all v2 :	"+v3);
		
	}

}
