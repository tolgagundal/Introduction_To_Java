package Chapter03;

import java.util.Scanner;

public class Ch03_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");

		int num = input.nextInt();

		boolean condition1 = num % 5 == 0 && num % 6 == 0;
		if (condition1) {
			System.out.println("Is " + num + " divisible by 5 and 6? " + " " + condition1);
		}

		boolean condition2 = num % 5 == 0 || num % 6 == 0;
		if (condition2) {
			System.out.println("Is " + num + " divisible by 5 or 6?" + " " + condition2);
		}

		boolean condition3 = num % 5 == 0 || num % 6 == 0 ^ num % 5 == 0 && num % 6 == 0;
		if (condition3) {
			System.out.println("Is " + num + " divisible by 5 or 6, but not both?" + " " + condition3);
		}
//            ------ BİR YERDE MANTIK HATASI YAPIYORUM!!!!!!!!!!!!!!!!!!!!!!!!!!
	}

}
