package ELF_JAVA;

public class occurence_of_char_A_in_a_String_KARNATAKA {
	public static void main(String[] args) {
		String s = "KARnataka";
		s = s.toLowerCase();
		int count = 0;
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}
}
