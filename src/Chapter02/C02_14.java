package chapters.Chapter02;

import java.util.Scanner;

public class C02_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

		System.out.println(" Enter weight in pound: " + "Enter height in inches: ");

		double weight = input.nextDouble();
		double height = input.nextDouble();
		double kilograms = weight * 0.45359237;  	// Convert weight to kilograms
		double meters = height * 0.0254;   // Convert height to meters
				
		
	  double bmi = kilograms /  Math.pow(meters, 2);	  
			 
		
		System.out.println(" bmi is " + bmi);

	}

}
