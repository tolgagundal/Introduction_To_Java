package chapters.Chapter02;

import java.util.Scanner;

public class C02_17 {

	public static void main(String[] args) {

		// Science: wind-chill temperature

		Scanner input = new Scanner(System.in);

		System.out.println(" Enter the temperature in Fahrenheit between -58F and 41F: "
				+ "Enter the wind speed: (>=2) in miles per hour: ");

		double temperature = input.nextDouble();
		double speed = input.nextDouble();

		double windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(speed, 0.16))
				+ (0.4274 * temperature * Math.pow(speed, 0.16));

	System.out.println("The wind chill index is " + windChill);
	}

}
