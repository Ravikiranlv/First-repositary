//WAP TO GENERATE MULTIPLICATION TABLE USING FOR LOOP

package ELF_JAVA;

import java.util.Scanner;

public class multiplication_table_using_forloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.......");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; ++i) {
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
	}

}


// O/P
//Enter the number.......
//13
//13 * 1 = 13 
//13 * 2 = 26 
//13 * 3 = 39 
//13 * 4 = 52 
//13 * 5 = 65 
//13 * 6 = 78 
//13 * 7 = 91 
//13 * 8 = 104 
//13 * 9 = 117 
//13 * 10 = 130 