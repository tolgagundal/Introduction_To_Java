package Chapter03;

import java.util.Scanner;

public class Ch03_22 {

	public static void main(String[] args) {

		// (Geometry: point in a circle?)

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point with two coordinates: ");

		double p1 = input.nextDouble();
		double p2 = input.nextDouble();

		double yariCap = 10;

		boolean condition = p1 <= yariCap || p2 <= yariCap;
		
		if(condition) {
			System.out.println("Point is in the circle");
		} else {
			System.out.println("Point is not in the circle");
		}
						// Bu noktaların merkezi (0,0) olduğunu nereden göstereceğim.
	}

}
