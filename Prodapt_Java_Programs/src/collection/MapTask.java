package collection;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTask {

	public static void main(String[] args) {
		TreeMap<Integer, String> lhm= new TreeMap<Integer, String>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the key value: " );
		int x = sc.nextInt();
		lhm.put(11, "Gaya");
		lhm.put(34, "Pooja");
		lhm.put(23, "Padhu");
		lhm.put(1,  "Ram");
		lhm.put(74, "Sam");
		lhm.put(33, "Kumar");

	    Set<Map.Entry<Integer,String>> kv=lhm.entrySet();
	    
		for(Map.Entry<Integer,String> k: kv) {
			if(k.getKey()>x) {
				System.out.println(k.getKey()+" : " + k.getValue());
			}
			}
		}

}
