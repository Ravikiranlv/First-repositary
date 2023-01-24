//WAP TO REVERSE THE LETTERS PRESENT IN THE GIVEN STRING

package ELF_JAVA;

import java.util.Scanner;

public class REVERSE_THE_GIVEN_STRING {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value :");
		String str = sc.nextLine();

		String[] strArray = str.split(" ");
		// int t = strArray.length;
		// for (String temp : strArray) {
		// System.out.println(temp);
		// }

		for (int i = 0; i < strArray.length; i++) {
			char[] s1 = strArray[i].toCharArray();
			for (int j = s1.length - 1; j >= 0; j--) {
				System.out.print(s1[j]);
			}
			System.out.print(" ");
		}
	}
}

// O/P 
//Welcome
//to
//java
//World
//emocleW ot avaj dlroW 
