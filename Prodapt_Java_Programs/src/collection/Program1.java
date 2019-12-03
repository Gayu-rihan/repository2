package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Program1 {

	public static void main(String[] args) {
		int a=10;
		Integer a1=a; //Auto boxing
		Integer a11=Integer.valueOf(a); //Auto boxing
		System.out.println(a1);
		System.out.println(a11);
		
		int a2=a1;//Auto un-boxing
		int a21=a1.intValue(); //Auto un-boxing
		System.out.println(a2);
		System.out.println(a21);
		
		ArrayList<Integer> arr1= new ArrayList<Integer> (); //Generic
		ArrayList arr= new ArrayList (); 
		arr.add(10); //Auto boxing
		arr.add("Hello");
		arr.add(null);
		arr.add(true);
		arr.add(10.00000);
		
		System.out.println(arr);
		System.out.println(arr1);
		Iterator it=arr.iterator();
		System.out.println("using Iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("using get method");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		LinkedList li= new LinkedList (); 
		ListIterator it2= li.listIterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		while(it2.hasPrevious()) {
			System.out.println(it2.next());
		}


	}

}
