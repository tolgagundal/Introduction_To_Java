package Chapter03.InterviewQuestions;

import java.util.Scanner;

public class Boolean {

	/*
	 * Write a Boolean expression that evaluates to true if weight is greater than
	 * 50 pounds or height is greater than 60 inches. /***
	 * 
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int weight = input.nextInt();
		int height = input.nextInt();

		boolean condition = weight > 50 || height > 60;

		if (condition == true) {

			System.out.println("True");

		} else {
			
			System.out.println("False");
		}
			

	}

}
