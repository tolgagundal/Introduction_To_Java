package Chapter03;

import java.util.Scanner;

public class Ch03_31 {    	// (Financials: currency exchange)

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from dollars to RMB: 6.81 ");
		
		double rate = input.nextDouble();
		
		// Prompt the user to enter 0 to convert from USD to RMB
		// and 1 to convert from RMB to USD
		
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		
		int option = input.nextInt();
		
		// Prompt the user to enter the amount in USD or RMB
				// to convert it to RMB or USD respectively
		
		double amount;
		
		switch (option) 
		{ 
		case 0: System.out.println("Enter the dollar amount: ");
		
			amount = input.nextDouble();
			
			System.out.println("$" + amount + " is " + (amount * rate) + " yuan"); break;
			
			
		case 1: System.out.println("Enter the RMB amount: ");
		
		amount = input.nextDouble();
		
		System.out.println(amount + " yuan is $" + ((int)((amount * 100) / rate)) / 100.0); break;
		
		default: System.out.println("Incorrect input");
		
		
		
		
		
		
		
		
		}
	}

}
