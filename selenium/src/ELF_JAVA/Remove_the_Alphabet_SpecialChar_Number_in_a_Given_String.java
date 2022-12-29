package ELF_JAVA;

import java.util.Scanner;

public class Remove_the_Alphabet_SpecialChar_Number_in_a_Given_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		 String s1=sc.nextLine();
		String s2=s1.toLowerCase();
		String Alphabet="";
		String Number="";
		String Specialchar="";
		char[] s3=s2.toCharArray();
		for(int i=0;i<s2.length();i++)
		{
			if(s3[i]>='a' && s3[i]<='z' )
			{
				Alphabet=Alphabet+s3[i];
			}
			else if(s3[i]>='0' && s3[i]<='9')
			{
				Number=Number+s3[i];
			}
			else
			{
				Specialchar=Specialchar+s3[i];	
			}
		}
		System.out.println(Alphabet);
		System.out.println(Number);
		System.out.println(Specialchar);
		
	}

}


  // O/p =  Enter the String :
  //  TESTyantra @250#125 ELF37 Batch

  //  testyantraelfbatch
  //  25012537
 //   @#  
