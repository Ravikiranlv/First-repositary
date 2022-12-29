//WAP TO FIND THE LENGTH OF THE STRING WITHOUT USING LEN FUNCTION.

package ELF_JAVA;

public class wap_to_find_the_length_of_the_string_without_using_len_function {
	public static void main(String[] args) {
		String s = "java programming guide";
		int i = 0;
		for (char c : s.toCharArray()) {
			i++;
		}
		System.out.println("Length of the given String ::" + i); // Length of the given String ::22
	}

}
