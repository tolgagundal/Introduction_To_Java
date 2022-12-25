package chapters.Chapter02;

import java.util.Scanner;

public class C02_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter investment amount: "
				+ "Enter annual interest rate in percentage: "
				+ "Enter number of years: ");
		
		double investmentAmount = input.nextDouble();
		double interestRate = input.nextDouble();
		double years = input.nextDouble();
		
		double accumulatedValue = investmentAmount * (Math.pow(1 + (interestRate), years * 12));
		
		System.out.println(" Accumulated value is " + accumulatedValue);
	}

}
