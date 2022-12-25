package Chapter03;

import java.util.Scanner;

public class Ch03_19 {

	public static void main(String[] args) {

		/*
		 * (Compute the perimeter of a triangle) Write a program that reads three edges
		 * for a triangle and computes the perimeter if the input is valid. Otherwise,
		 * display that the input is invalid. The input is valid if the sum of every
		 * pair of two edges is greater than the remaining edge
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three edges of tirangle");

		int e1 = input.nextInt();
		int e2 = input.nextInt();
		int e3 = input.nextInt();

		int cevre = e1 + e2 + e3;

		boolean condition = (e1 + e2) > e3 && (e2 + e3) > e1 && (e3 + e1) > e2;

		if (condition) {
			System.out.println("input is valid.");
		} else {
			System.out.println("invalid value!");
		}

	}

}
