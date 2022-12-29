package ELF_JAVA;

import java.util.Scanner;

/*
 abcdef

 */
public class remove_the_duplicate_charecter_in_String {
	public static void main(String[] args) {
		//String s="aaaaabbccccccddddeefff";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		 String a=sc.nextLine();
		String b=a.toLowerCase();
		char[]c=b.toCharArray();
		String s1="";
		for(int i=0;i<c.length ;i++)
		{
			if(s1.indexOf(c[i])==-1)
			{
				s1=s1+c[i];
			}
		}
		System.out.println(s1);
	}

}
