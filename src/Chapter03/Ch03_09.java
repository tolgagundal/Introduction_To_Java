package Chapter03;

import java.util.Scanner;

public class Ch03_09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int isbn = input.nextInt();

		int n1 = isbn / 100000000;
		int remainingDigits = isbn % 100000000;
		int n2 = remainingDigits / 1000000;
		remainingDigits %= 10000000;
		int n3 = remainingDigits / 1000000;
		remainingDigits %= 1000000;
		int n4 = remainingDigits / 100000;
		remainingDigits %= 1000000;
		int n5 = remainingDigits / 10000;
		remainingDigits %= 10000;
		int n6 = remainingDigits / 1000;
		remainingDigits %= 10000;
		int n7 = remainingDigits / 100;
		remainingDigits %= 100;
		int n8 = remainingDigits / 10;
		remainingDigits %= 10;
		int n9 = remainingDigits;

		int n10 = (n1 * 1 + n2 * 2 + n3 * 3 + n4 * 4 + n5 * 5 + n6 * 6 + n7 * 7 + n8 * 8 + n9 * 9) % 11;

		// Display the 10-digit ISBN

		System.out.println("The ISBN-10 number is " + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9);

		if (n10 == 10)
			System.out.println("X");
		else
			System.out.println(n10);

	}

}
