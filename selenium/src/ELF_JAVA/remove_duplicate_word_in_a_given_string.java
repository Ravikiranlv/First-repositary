package ELF_JAVA;

import java.util.Scanner;

public class remove_duplicate_word_in_a_given_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Value :");
		  String s3 = sc.nextLine();
		String s = s3.toLowerCase();
		String s1[]=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			if(!s2.contains(s1[i]))
			{
				s2=s2+s1[i]+" ";
			}
		}
		//s2=s2.trim();9o
		
		System.out.println(s2);
	}

}

// o/p  = Enter the String Value :
//        hi hello hi Welcome o Java
//        hi hello welcome java 
