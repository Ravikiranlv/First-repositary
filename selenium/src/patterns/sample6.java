
package patterns;

import java.util.Scanner;
/*
 *A
 *A B
 *A B C 
 *A B C D
 *A B C D E
 */

public class sample6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STRING : ");
		String S = sc.nextLine();
		char[] c = S.toCharArray();
		for (int i = 0; i <= c.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(c[j] + " ");
			}
			System.out.println();
		}
	}
}
