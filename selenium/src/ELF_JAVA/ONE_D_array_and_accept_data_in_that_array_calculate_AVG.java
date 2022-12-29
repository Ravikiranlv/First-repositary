//WAP TO CREATE 1D ARRAY AND ACCEPT DATA IN THAT ARRAY. CALCULATE THE AVERAGE VALUE OF ARRAY ELEMENTS

package ELF_JAVA;

import java.util.Scanner;

public class ONE_D_array_and_accept_data_in_that_array_calculate_AVG {
	public static void main(String[] args) {
		System.out.println("How many numbers you want to enter?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double[] arr = new double[n];
		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Element No." + (i + 1) + ":");
			arr[i] = sc.nextDouble();
		}
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		double average = total / arr.length;
		System.out.printf("The average is: %3f", average);
	}

}

//O/P =
//How many numbers you want to enter?
//5
//Enter Element No.1:
//60
//Enter Element No.2:
//40
//Enter Element No.3:
//20
//Enter Element No.4:
//50
//Enter Element No.5:
//10
//The average is: 36.000000
