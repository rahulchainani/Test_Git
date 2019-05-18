package NewPackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test_LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
List<String> namelist = new LinkedList<String>();
		
		
		
		namelist.add("Anjali");
		namelist.add("Rahul");
		namelist.add("Garima");
		namelist.add("Anjali");
		
		
		System.out.println(namelist.size());
		System.out.println(namelist.get(1));
		namelist.remove(1);
		System.out.println(namelist.size());
		namelist.get(1);
		
		for (Iterator<String> iterator = namelist.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);	
		
		}
	}
}	
