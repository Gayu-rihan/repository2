package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapProgram {
	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Gaya");
		hm.put(4, "Pooja");
		hm.put(3, "Padhu");
		System.out.println(hm);
		
		//duplicates values allowed
		hm.put(5,"Pooja");
		//duplicates keys won't allowed
	    hm.put(2,"bala");
	    System.out.println(hm);
		//getting values based on key
	    System.out.println(hm.get(3));
	    
	    //retrieving all keys
	    Set<Integer> keys=hm.keySet();
	    System.out.println(keys);
	    //retrieving all keys ,value pairs
	    Set<Map.Entry<Integer,String>> kv=hm.entrySet();
		for(Map.Entry<Integer,String> k: kv) {
			System.out.println(k.getKey()+" : " + k.getValue());
		}
	}
}
