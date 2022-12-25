package chapters.Chapter02;

import java.util.Scanner;

public class C02_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Enter the subtotal and gratuityrate: ");

		double subtotal = input.nextDouble();

		double gratuityrate = input.nextDouble();

		double gratuity = subtotal * (gratuityrate / 100);

		double total = subtotal + gratuity;

		System.out.println("The gratuity is " + gratuity + " and total is " + total);

	}

}
