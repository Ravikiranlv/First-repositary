//WAP TO PRINT ENTER TWO ANGELES OF A TRIANGLE AND IFND THE THIRD ANGLE
package patterns;

import java.util.Scanner;

public class sample5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First angle of triangle:");
		int a = sc.nextInt();
		System.out.println("Enter the second angle of triangle:");
		int b = sc.nextInt();
		
		int c = 180-(a+b);
		System.out.println("Third angle of the triangle="+c);
	}
}


// O/P =
//Enter the First angle of triangle:
//30
//Enter the second angle of triangle:
//60
//Third angle of the triangle=90