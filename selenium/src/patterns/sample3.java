//WAP TO PRINT PATTERN

package patterns;

public class sample3 {
	public static void main(String[] args) {
		for (int i = 0; i <= 6 - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 6 - 1 - i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}

// O/P=

//* * * * * * 
//* * * * * 
//* * * * 
 //* * * 
  //* * 
   //* 