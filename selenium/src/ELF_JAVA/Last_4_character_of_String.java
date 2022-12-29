//WAP to get last 4 character of a string or simply any number of last characters of a string in java

package ELF_JAVA;

public class Last_4_character_of_String {
	public static void main(String[] args) {
		String s = "123456789", s1;
		if (s.length() > 4) {
			s1 = s.substring(s.length() - 4);
		} else {
			s1 = s;
		}
		System.out.println(s1);
	}

}
