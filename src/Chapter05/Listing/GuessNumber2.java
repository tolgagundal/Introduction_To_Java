package Chapter05.Listing;

import java.util.Scanner;

public class GuessNumber2 {
    public static void main(String[] args) {
        //Generate a random number to be guessed
        int number = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number bt 0-100");

        int guess = -1;
        while (guess != number) {
            //Prompt the user to guess number
            System.out.println("\nEnter your guess: ");

            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            }


        }

    }
}