package ELF_JAVA;

import java.util.Map;
import java.util.TreeMap;

public class occurance_with_out_using_collction_map {
	public static void main(String[] args) {
		String s="karnataka";
		s=s.toUpperCase();
		 char c[]=s.toCharArray();
		 int count=0;
		 Map m=new TreeMap();
		 for(int i=0;i<c.length;i++)
		 {
			 count=0;
			 for(int j=0;j<c.length;j++)
			 {
				 if(c[i]==c[j])
				 {
					 count++;
				 }
			 }
			 m.put(c[i], count);
		 }
		 System.out.println(m);
	}

}
