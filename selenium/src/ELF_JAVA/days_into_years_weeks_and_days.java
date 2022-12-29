//WAP TO CONVERT DAYS INTO YEARS,WEEKS AND DAYSM-{375 DAYS}    O/P =1YEAR,1WEAKS,1DAYS

package ELF_JAVA;

import java.util.Scanner;

public class days_into_years_weeks_and_days {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day's = ");
		int days = sc.nextInt();
		int year = days / 365;
		System.out.println("Year = " + year);
		int week = (days % 365) / 7;
		System.out.println("Week = " + week);
		int day_s = (days % 365) % 7;
		System.out.println("days = " + day_s);
	}
}
