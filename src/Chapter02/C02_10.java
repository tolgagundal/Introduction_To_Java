package chapters.Chapter02;

import java.util.Scanner;

public class C02_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter the amount of water in kilograms: "
				+ "Enter the initial temperature:"
				+ "Enter the final temperature:"
				+ "The energy needed is: ");
		
		double kilograms = input.nextDouble();
		double initTemperature = input.nextDouble();
		double finalTemperature = input.nextDouble();
		
		double energyNeeded = kilograms * (finalTemperature - initTemperature) * 4184 ;
		
		System.out.println(" The energy needed is: " + energyNeeded);
		
		
		
		
		
	}

}
