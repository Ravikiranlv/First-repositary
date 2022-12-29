//WAP TO PRINT EVERY CHARACTER OF A STRING ENTERED BY THE USER IN A NEW LINE USING A LOOP

package ELF_JAVA;

import java.util.Scanner;

public class print_every_character_of_a_string_using_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String.....");
		String str = sc.nextLine();
		System.out.println("Character in " + str + " are : ");

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			System.out.print(a + " , "); // i/p =java programming guide o/p=j , a , v , a , , p , r , o , g , r , a , m
											// , m , i , n , g , , g , u , i , d , e ,
		}
	}

}
