package Chapter03;

import java.util.Scanner;

public class Ch03_20 {

	public static void main(String[] args) {

		/*(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula 
to compute the wind-chill temperature. The formula is valid for temperatures in 
the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
Write a program that prompts the user to enter a temperature and a wind speed. 
The program displays the wind-chill temperature if the input is valid; otherwise, 
it displays a message indicating whether the temperature and/or wind speed is 
invalid.*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit bt -58F and 41F: " 
		+ "Enter the wind speed: (>=2) in miles per hour: ");
		
		double temperature = input.nextDouble();
		double windSpeed = input.nextDouble();
		
		boolean condition = temperature > -58 && temperature < 41 && windSpeed >= 2;
		
		if (condition) {
			System.out.println("valid.");
		} else {
			System.out.println("invalid.");
	}

}
}
