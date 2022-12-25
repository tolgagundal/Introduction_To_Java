package Chapter03;

import java.util.Scanner;

public class Ch03_23 {

// (Geometry: point in a rectangle?)

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point with two coordinates: ");

		double p1 = input.nextDouble();
		double p2 = input.nextDouble();

		boolean condition = p1 >= -5 && p1 <= 5 && p2 >= -2.5 && p2 <= 2.5;
		
		double area = p1 * p2;

		if (condition) {
			System.out.println("Point " + p1 + "," + p2 + " is in the rectangle");
	} else { 
		System.out.println("Point " + p1 + "," + p2 + " is not in the rectangle\"");
	}
		
		
	}

}
