package ELF_JAVA;

import java.util.Scanner;

public class print_every_character_of_a_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String.....");
		String str=sc.nextLine();
		System.out.println("Characters in "+str+" are:");
		
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			System.out.print(a+",");
		}
	}
}
