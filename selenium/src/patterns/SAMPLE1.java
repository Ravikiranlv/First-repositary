//WAP TO  PRINT PATTERN
package patterns;

public class SAMPLE1 {
	public static void main(String[] args) {
		for (int i = 7; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + "");
			}
			System.out.println();
		}
	}

}

// O/P =
//7654321
//654321
//54321
//4321
//321
//21
//1