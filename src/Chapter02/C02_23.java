package chapters.Chapter02;

import java.util.Scanner;

public class C02_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter driving distance: ");
		System.out.println("Enter miles per gallon: ");
		System.out.println("Enter price per gallon: ");
		
		double distance = input.nextDouble();
		double milesPerGallon = input.nextDouble();
		double pricePerGallon = input.nextDouble();
		
		double cost = (distance / milesPerGallon) * pricePerGallon;
		
		System.out.println("Cost of driving is   " + cost);
		
		
		
		
		
		
		
		

	}

}
