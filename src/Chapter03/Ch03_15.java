package Chapter03;

import java.util.Scanner;

public class Ch03_15 {

	public static void main(String[] args) {

		int lottery = (int)(Math.random() * 1000);
		System.out.print("lottery pick (three digits): "+lottery);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your lottery pick (three digits): ");
		
		int guess = input.nextInt();
		
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = (lottery / 10) % 10;
		int lotteryDigit3 = lottery % 10;
		
		int guessDigit1 = guess / 100;
		int guessDigit2 = (guess / 10) % 10;
		int guessDigit3 = guess / 10;
		
		boolean conditionAllDigit =(
						lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2 && lotteryDigit3 == guessDigit3 ||
						lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit1 ||	
						lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit2
						);
		boolean conditionOneDigit =(
				lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3 ||
				lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3 ||
				lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3
				);
		
		if (lottery == guess) {
			System.out.println("Tebrikler 10.000 $ kazandınız.");
			
		}else if(conditionAllDigit) { 
			System.out.println("Tebrikler 3.000 $ kazandınız.");
			
			
		}else if(conditionOneDigit) {
			System.out.println("Tebrikler 1.000 $ kazandınız.");
			
		}else {
			System.out.println("Tekrar deneyiniz.");
		}
	}

}
