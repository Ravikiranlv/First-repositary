package ELF_JAVA;

import java.util.Scanner;

public class Two_dimentional_array {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int rows=sc.nextInt();
		System.out.println("enter the column");
		int column=sc.nextInt();
		int a[][]=new int [rows][column];
		System.out.println("Enter the elements");
		//To take the elements
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		//To display the elements
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" "+" ");
			}
			System.out.println();
		}
	}

}
