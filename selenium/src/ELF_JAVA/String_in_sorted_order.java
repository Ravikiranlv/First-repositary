//WAP TO SORTED ORDER BY STRING

package ELF_JAVA;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class String_in_sorted_order {
	public static void main(String[] args) {
		int count;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the number of String: ");
		count = sc1.nextInt();

		String strArray[] = new String[count];
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Enter the String one by one: ");
		for (int i = 0; i < count; i++) {
			strArray[i] = sc2.nextLine();
		}
		sc1.close();
		sc2.close();

		strArray = Stream.of(strArray).sorted().toArray(String[]::new);
		System.out.print("String in Sorted order: " + Arrays.toString(strArray));
	}
}



//O/P
//Enter the number of String: 
//10
//Enter the String one by one: 

//0
//45
//10
//25
//50
//66
//777
//0
//5
//String in Sorted order: [, 0, 0, 10, 25, 45, 5, 50, 66, 777]
