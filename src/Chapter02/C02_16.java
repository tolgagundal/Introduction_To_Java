package chapters.Chapter02;

import java.util.Scanner;

public class C02_16 {

	public static void main(String[] args) {

		// area of hexagon

		Scanner input = new Scanner(System.in);

		System.out.println(" Enter the side: ");
		double side = input.nextDouble();

		double area = (3 * Math.pow(3, 0.5) * Math.pow(side, 2)) / 2;
		
		System.out.println(" Area of hexagon is " + area);
		
	}

}
