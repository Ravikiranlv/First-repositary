package ELF_JAVA;

//Write a program to find the number of vowels,consonants,digits,and white space characters in a string.

import java.util.Scanner;

public class Vowels_consonants_digits_whitespaceCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String line = sc.nextLine();
		int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;
		line = line.toLowerCase();
		for (int i = 0; i < line.length(); ++i) {
			char ch = line.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			} else if ((ch >= 'a' && ch <= 'z')) {
				++consonants;
			} else if ((ch >= '0' && ch <= '9')) {
				++digits;
			} else if (ch == ' ') {
				++spaces;
			} else

				++symbols;
		    }
			System.out.println("vowels: " + vowels);
			System.out.println("consonants: " + consonants);
			System.out.println("digits: " + digits);
			System.out.println("spaces: " + spaces);
			System.out.println("symbols: " + symbols);
		
	}
}
