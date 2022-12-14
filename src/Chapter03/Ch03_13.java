package Chapter03;

import java.util.Scanner;

public class Ch03_13 {

	public static void main(String[] args) {

		// Vergi hesaplama

		Scanner input = new Scanner(System.in);

		System.out.print("(0-single filer, 1-married jointly or "
				+ "qualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing status: ");

		int status = input.nextInt();

		System.out.println("Enter the taxable income: ");
		double income = input.nextDouble();
		double tax = 0;

		if ( income <= 8350) {
			tax = income * 0.10;
		} else if ( income <= 33.950) {
			tax = 8350 * 0.10 + (33.950 - 8350) * 0.15;
		} else if (income <= 82.250) {
			tax = 8350 * 0.10 + (33.950 - 8350) * 0.15 + (income - 33950) * 0.25;
		} else if (income <= 171550) {
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
			(82250 - 33950) * 0.25 + (income - 82250) * 0.28;
	} else if (income <= 372950) {
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
			(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
			(income - 171550) * 0.33;
	}	else
			tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
			(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
			(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		System.out.println("Error: invalid status");
	
			System.out.println("Tax is " + (int)(tax * 100) / 100.0);

		
		
	


