package NewPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test_Sets {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//HashSet<String> myset = new HashSet<String>();
		HashSet<String> myset = new LinkedHashSet<String>();
		
		myset.add("Ram");
		myset.add("Mohan");
		myset.add("Rohan");
		myset.add("Ram");
		
		myset.size();
		
		//myset.remove("Mohan");
		for (Iterator iterator = myset.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			
			
			System.out.println(name);
		}
		
			
		
		
		

	}
}

