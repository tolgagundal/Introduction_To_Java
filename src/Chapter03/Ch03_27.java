package Chapter03;

import java.util.Scanner;

public class Ch03_27 {

	public static void main(String[] args) {

		// (Geometry: points in triangle?)
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point's x- and y- coordinates: ");

		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean condition = x >= 0 && x <= 200 && y >= 0 && y <= 100;
		
		if (condition) {
			
			System.out.println("The point is in the triangle");
		} else {
			System.out.println("The point is not in the triangle!");
		}
	}

}
