package ELF_JAVA;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class maps {
	public static void main(String[] args) {
		
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(1, "varun");
		h.put(2,"Ravi");
		h.put(3, "Bharath");
		h.put(3, "Rashmi");
		
		//to print the keys
		 Set s = h.keySet();
		for(Object h1:s)
		{
			System.out.println(h1);
		}
		
		//to print the values
		
		Collection s2=h.values();
		for(Object s3:s2)
		{
			System.out.println(s3);
		}
		
		//to print both keys and values
		
		Object h1;
		for(Entry h2:h.entrySet())
		{
			System.out.println(h2.getKey()+" "+h2.getValue());
		}
	}

}
