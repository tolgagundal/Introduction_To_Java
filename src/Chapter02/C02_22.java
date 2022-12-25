package chapters.Chapter02;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class C02_22 {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter an amount in double, for example 11.56");

double amount = input.nextDouble();			// Enter input

int remainingAmount = (int)(amount * 100);		

int numberOfOneDollars = remainingAmount / 100;  	// Dollars
remainingAmount = remainingAmount % 100;

int numberOfQuarters = remainingAmount / 25;		// Quarters remainingAount = 6
remainingAmount = remainingAmount % 25;

int numberOfDimes = remainingAmount / 10; 
remainingAmount = remainingAmount % 10;

int numberOfNickels = remainingAmount / 5;
remainingAmount = remainingAmount % 5;

int numberOfPennies = remainingAmount;


System.out.println("Your Amount " + amount + " consist of" );
System.out.println("   " + numberOfOneDollars + " dollars");
System.out.println("   " + numberOfQuarters + " quarters");
System.out.println("   " + numberOfDimes + " dimes");
System.out.println("   " + numberOfNickels + " nickels");
System.out.println("   " + numberOfPennies + " pennies");

		
	}

}
