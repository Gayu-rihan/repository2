package collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		TreeMap<Integer, String> lhm= new TreeMap<Integer, String>();
		lhm.put(1, "Gaya");
		lhm.put(4, "Pooja");
		lhm.put(3, "Padhu");
		System.out.println(lhm);
		
		//duplicates values allowed
		lhm.put(5,"Pooja");
		//duplicates keys won't allowed
	    lhm.put(2,"bala");
	    System.out.println(lhm);
		//getting values based on key
	    System.out.println(lhm.get(3));
	    
	    //retrieving all keys
	    Set<Integer> keys=lhm.keySet();
	    System.out.println(keys);
	    //retrieving all keys ,value pairs
	    Set<Map.Entry<Integer,String>> kv=lhm.entrySet();
		for(Map.Entry<Integer,String> k: kv) {
			System.out.println(k.getKey()+" : " + k.getValue());
		}
	}

}
