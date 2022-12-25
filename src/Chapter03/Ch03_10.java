package Chapter03;

import java.util.Scanner;

public class Ch03_10 {

	public static void main(String[] args) {

		/* (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a 
subtraction question. Revise the program to randomly generate an addition question with two integers less than 100.
/**
 * 
 */

int number1 = (int) (Math.random() * 10);
int number2 = (int) (Math.random() * 10);

if (number1 < number2) {
	int temp = number1;
			
			number1 = number2;
	number2 = temp;	
}

System.out.println(" What is " + number1 + " - " + number2 + "? ");

Scanner input = new Scanner(System.in);
int answer = input.nextInt();

if (number1 - number2 == answer)
System.out.println("You are correct");

else {
	System.out.println("Your answer is wrong.");
	System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
	
}


	}

}
