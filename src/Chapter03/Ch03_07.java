package Chapter03;

import java.util.Scanner;

public class Ch03_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"Enter an amount in double, for example 11.56: ");
			double amount = input.nextDouble();
			
			int remainingAmount = (int)(amount * 100);
			
			// Find the number of one dollars
			
			int numberOfDollars = remainingAmount / 100; 
			remainingAmount %= 100; 
			
			// Find the number of quarters in the remaining amount
			
			int numberOfQuarters = remainingAmount / 25;
			remainingAmount %=25;
			
			// Find the number of dimes in the remaining amount
			
			int numberOfDimes = remainingAmount / 10;
			remainingAmount  %= 10;
			
			// Find the number of nickels in the remaining amount
			int numberOfNickels = remainingAmount / 5;
			remainingAmount %= 5;
			
			// Find the number of pennies in the remaining amount
			
			int numberOfPennies = remainingAmount;
			
			// Display results
			
			System.out.println("Your amount " + amount + "consist of ");
			System.out.println(numberOfDollars + (numberOfDollars ==  1 ? "dollar " : " dollars "));
			System.out.println(numberOfQuarters + (numberOfQuarters ==  1 ? "quarter " : " quarters "));
			System.out.println(numberOfDimes + (numberOfDimes ==  1 ? "dime " : " dimes "));
			System.out.println(numberOfNickels + (numberOfNickels ==  1 ? " nickel " : " nickels "));
			System.out.println(numberOfDimes + (numberOfDimes ==  1 ? " dime " : " dimes "));
			System.out.println(numberOfPennies + (numberOfPennies ==  1 ? " pennie " : " pennies "));
			
	}

}
