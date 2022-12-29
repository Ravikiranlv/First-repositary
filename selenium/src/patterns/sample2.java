//WAP TO PRINT PATTERN
package patterns;

public class sample2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("");
			}
			for (int k = i; k <= 8; k++) {
				System.out.print(k + "");
			}
			System.out.println();
		}
		for (int i = 8 - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("");
			}
			for (int k = i; k <= 8; k++) {
				System.out.print(k + "");
			}
			System.out.println();
		}
	}

}

// O/P =
//12345678
//2345678
//345678
//45678
//5678
//678
//78
//8
//78
//678
//5678
//45678
//345678
//2345678
//12345678