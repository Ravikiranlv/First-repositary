package ELF_JAVA;

public class remove_duplicate_in_an_String {
	public static void main(String[] args) {
		String s="aaaaabbbccccddddeee1245145@#&#&";
		 char c[]=s.toCharArray();
		 String s1="";
		 for(int i=0;i<c.length;i++)
		 {
			 if(s1.indexOf(c[i])==-1)
			 {
				 s1=s1+c[i];
			 }
		 }
		 System.out.println(s1);
	}

}
