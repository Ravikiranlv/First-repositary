//WAP TO CREATE A LIST OF 1 TO 10 NUMBERS. CREATE SECOND LIST FROM FIRST LIST SELECTING NUMBERS WHICH ARE PERFECT SQUARE AND DISPLAY IT.

package ELF_JAVA;

import java.util.Scanner;

public class PERFECT_SQUARE {
	public static void main(String[] args) {
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting number - ");
		int num = sc.nextInt();
		System.out.println("Enter the Last nimber - ");
		int num1 = sc.nextInt();
		System.out.println("List of 1 to 100 numbers - ");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------------------------------------------------");

		System.out.println("Perfect Square - ");
		while (num <= num1) {
			for (int j = 1; j < num; j++) {
				if (j * j == num) {
					c++;
					System.out.println(num);
				}
			}
			num++;
		}
	}

}

//O/P =Enter the Starting number - 
//1
//Enter the Last nimber - 
//10
//List of 1 to 100 numbers - 
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//-----------------------------------------------------------------------------
//Perfect Square - 
//4
//9