package Chapter03;

import java.util.Scanner;

public class Ch03_21 {

	public static void main(String[] args) {

		// (Science: day of the week)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year, " + "Enter  a month, " + "Enter the day of the month, ");
		
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		
		int dayOfTheWeek = (day + 26 * ((month + 1)/ 10) + year + (year/4) + (year/ 100)/ 4 + (5 * (year/100))) % 7 ;
		
		System.out.println("Day of the week is: " + dayOfTheWeek);
	}
 // Günleri swtich ile mi tanımlayacağım....
}
