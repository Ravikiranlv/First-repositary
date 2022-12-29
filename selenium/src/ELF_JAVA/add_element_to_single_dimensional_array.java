//WAP TO ADD ELEMENTS TO SINGLE DIMENSIONAL ARRAY AND PRINT ELEMENTS FROM 1D ARRAY

package ELF_JAVA;

import java.util.Scanner;

public class add_element_to_single_dimensional_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array length : ");
		int len = sc.nextInt();
		int a[]=new int[len];
		System.out.println("Enter"+" " +len+ " "+"Element to Store an Array :");
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in Array are:");
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}


// O/P =
//Enter Array length : 
//4
//Enter 4 Element to Store an Array :
//40
//10
//5
//80
//Elements in Array are:
//40 10 5 80 
