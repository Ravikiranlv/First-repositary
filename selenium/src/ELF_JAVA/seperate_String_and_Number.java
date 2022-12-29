package ELF_JAVA;

/*
Enter the String : 
ARvikiranlv256ANd258
256258
ARVIKIRANLVAND

 */
import java.util.Scanner;

public class seperate_String_and_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a = sc.nextLine();
		String b = a.toUpperCase();
		char c[] = b.toCharArray();
		String num = "";
		String ch = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= '0' && c[i] <= '9') {
				num = num + c[i];
			} else {
				ch = ch + c[i];
			}
		}
		System.out.println(num);
		System.out.println(ch);
	}
}
