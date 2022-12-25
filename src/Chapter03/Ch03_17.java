package Chapter03;

import java.util.Random;
import java.util.Scanner;

public class Ch03_17 {

	public static void main(String[] args) {

		/*
		 * //* (Game: scissor, rock, paper) Write a program that plays the popular
		 * scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a
		 * scissor, and a paper can wrap a rock.) The program randomly generates a
		 * number 0, 1, or 2 representing scissor, rock, and paper. The program prompts
		 * the user to enter a number 0, 1, or 2 and displays a message indicating
		 * whether the user or the computer wins, loses, or draws. Here are sample runs:
		 */

		Scanner input = new Scanner(System.in);

		// int game = (int) (Math.random() * 3);

		Random random = new Random();
		int number = random.nextInt(3);

		System.out.println("Enter a number (0: scissor, 1: rock, 2: paper");
		int userNumber = input.nextInt();

		String name = "";
		String username = "";

		switch (number) {

		case 0: {
			name = "scissor";
			break;
		}
		case 1: {
			name = "rock";
			break;
		}
		case 2: {
			name = "paper";
			break;
		}
		}

		switch (userNumber) {

		case 0: {
			username = "scissor";
			break;
		}
		case 1: {
			username = "rock";
			break;
		}
		case 2: {
			username = "paper";
			break;
		}
		}

		if (number == 2 && userNumber == 1 || number == 1 && userNumber == 0 || number == 0 && userNumber == 1) {
			System.out.println("The computer is " + name + " ,you are " + username + " . Computer won. ");

		} else if (number == userNumber) {
			System.out.println("The computer is " + name + " ,you are " + username + " too . It is a draw");
		} else {
			System.out.println("The computer is " + name + " ,you are " + username + " . You won");
		}

	}

}
