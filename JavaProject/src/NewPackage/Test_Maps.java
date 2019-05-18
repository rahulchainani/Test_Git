package NewPackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test_Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map<Integer, String> m = new HashMap<Integer, String>();
		
		Map<Integer, String> m = new TreeMap<Integer, String>();
		
		
		
		m.put(123, "Rahul");
		m.put(234,"Amit");
		m.put(345,"Nirav");
		m.put(456,"Nisha");
		
		System.out.println(m.get(234));
		
		System.out.println(m);
		
		m.remove(345);
		
		System.out.println(m);
		
		Set <Integer> keys = m.keySet();
		
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			Integer name = (Integer) iterator.next();
			System.out.print(name);
			System.out.println(m.get(name));
			
		}
		
		
		
		
		
		
		
	}

}
