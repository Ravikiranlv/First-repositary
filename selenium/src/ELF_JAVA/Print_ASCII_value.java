//WAP TO PRINT ASCII VALUE IN JAVA

package ELF_JAVA;

import java.util.Scanner;

public class Print_ASCII_value {
	public static void main(String[] args) {
		System.out.println("Enter a Character: ");
		Scanner sc = new Scanner(System.in);
		char chr = sc.next().charAt(0);
		int asciiValue = chr;
		System.out.println("ASCII Value of" + " " + chr + " is: " + asciiValue);
	}
}

// O/P =
//Enter a Character: 
//b
//ASCII Value of b is: 98