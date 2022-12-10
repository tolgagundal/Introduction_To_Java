package Chapter05.Listing;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Generate a random number to be guessed

        int num = (int)(Math.random() * 101);

        System.out.println("Guess a magic umber 1-100");

        //Prompt the user to guess the number
        System.out.println("\nEnter your guess: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if(guess == num) {
            System.out.println("Cong!");
        } else {
            System.out.println("Try again later.");
        }

    }
}
