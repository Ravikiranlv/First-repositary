package ELF_JAVA;

import java.util.Scanner;

public class remove_the_duplicate_word_in_a_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		//String s1=s.toLowerCase();
		char[] s2 = s.toCharArray();
		String a="";
		for(int i=0;i<s2.length;i++)
		{
		if(a.indexOf(s2[i])==-1)
		{
			a=a+s2[i];
		}
		}
		System.out.println(a);
	}
	 
}
//  o/p =Enter the String : 
//  TESTYANTRA
//  tesyanr
