package ELF_JAVA;

import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicate_string_ {
	public static void main(String[] args) {
		String s="TESTYANTRA";
		s=s.toLowerCase();
	    Set<Character> set=new LinkedHashSet<Character>();
	    
	    for(int i=0;i<s.length();i++)
	    {
	    	set.add(s.charAt(i));//t e s  y n r a
	    }
	    StringBuffer sb=new StringBuffer(); 
	    for(Character c:set)
	    {
	    	sb.append(c);  //tesynra
	    }
	    System.out.println("String text after removing the duplicate charecter is : "+ sb);  //o/p:  String text after removing the duplicate charecter is : Test Ynra
	}
		//o/p;  String text after removing the duplicate charecter is : Test Ynra
}
