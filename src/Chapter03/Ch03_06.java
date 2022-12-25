package Chapter03;

import java.util.Scanner;

public class Ch03_06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Enter a weight in pounds");
		double weight = input.nextDouble();
		
		System.out.println(" Enter a height in inches");
		double height = input.nextDouble();
		
		final double kilograms = 0.4535;
		final double meters = 0.0254;
		
		double weightInKilograms = weight * kilograms;
		double heightInMeters = height * meters;
		
		double bmi = weightInKilograms / Math.pow(heightInMeters, 2);
		
		// display result
		
		System.out.println(" bmi is " + bmi );
		
		if (bmi < 18.5)
		System.out.println("Underweight");
		
		else if (bmi < 25)
		System.out.println("Normal");
		
		else if (bmi < 30)
		System.out.println("Overweight");
		
		else 
			System.out.println("Obese");
		
		
	
		
				
				
				
				

	}

}
