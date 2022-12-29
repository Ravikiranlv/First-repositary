//WAP TO COUNT UPPERCASE,LOWERCASE,SPECIAL CHARACTER AND NUMERIC VALUES IN A GIVEN STRING

package ELF_JAVA;

import org.testng.reporters.jq.Main;

public class count_UPPERCASE_LOWERCASE_SPECIALCharacter_and_numericValues {
	public static void main(String[] args) {
		String s = "@JAVA_Programming_guide12345";
		int upper = 0;
		int lower = 0;
		int number = 0;
		int special = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= '0' && ch <= '9')
				number++;
			else
				special++;
		}

		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
		System.out.println("number : " + number);
		System.out.println("special character : " + special);
	}

}
