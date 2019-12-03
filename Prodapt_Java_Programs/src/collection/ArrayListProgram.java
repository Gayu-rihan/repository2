package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer> (); //Generic 
		
		arr.add(10); //Auto boxing
		arr.add(12);
		//arr.add(null);
		arr.add(8);
		arr.add(98);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		

	}

}
