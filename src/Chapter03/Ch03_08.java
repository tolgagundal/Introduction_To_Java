package Chapter03;

import java.util.Scanner;

public class Ch03_08 {

	public static void main(String[] args) {

		// (Sort three integers) prompts the user to enter three integers
		// display the integers in non-decreasing order.

		Scanner input = new Scanner(System.in);

		System.out.println(" Enter three number: ");

		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		// number1 en büyükse

		if ((number1 > number2) && (number1 > number3)) {

			System.out.println("En büyük sayı: " + number1);
		} else if ((number1 > number2) || (number1 > number3)) {
			System.out.println("Ortanca sayı: " + number1);
		} else {

			System.out.println("En küçük sayı: " + number1);
		}

		// number2 en büyükse

		if ((number2 > number1) && (number2 > number3)) {

			System.out.println("En büyük sayı: " + number2);
		} else if ((number2 > number1) || (number2 > number3)) {
			System.out.println("Ortanca sayı: " + number2);
		} else {

			System.out.println("En küçük sayı: " + number2);
		}

		// number3 en büyükse

		if ((number3 > number1) && (number3 > number2)) {

			System.out.println("En büyük sayı: " + number3);
		} else if ((number3 > number1) || (number3> number2)) {
			System.out.println("Ortanca sayı: " + number3);
		} else {
			System.out.println("En küçük sayı: " + number3);
		}

	}

}
