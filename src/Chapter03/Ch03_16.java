package Chapter03;

import java.util.Scanner;

public class Ch03_16 {

	public static void main(String[] args) {

		/*
		 * (Random point) Write a program that displays a random coordinate in a
		 * rectangle. The rectangle is centered at (0, 0) with width 100 and height 200.
		 */

		Scanner input = new Scanner(System.in);

		double a = ((Math.random() * 100) - 50);

		System.out.printf("a: %.2f" , a);

		double b = ((Math.random() * 200) - 100);

		System.out.printf("\nb: %.2f" ,b);

		int area = (int) (a * b);

		System.out.println("\nalan: " + area);

	}

}
