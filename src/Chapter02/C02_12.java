package chapters.Chapter02;

import java.util.Scanner;

public class C02_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter speed and acceleration: ");

		double speed = input.nextDouble();

		double acceleration = input.nextDouble();

		double length = (speed * speed) / (2 * acceleration);

		System.out.println(" Min runway length: " + length);

	}

}
