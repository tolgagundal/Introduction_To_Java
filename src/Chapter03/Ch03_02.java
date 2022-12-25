package Chapter03;

import java.util.Scanner;

public class Ch03_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three digits: ");
			
			
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		int sum = number1 + number2 + number3;
		
		System.out.println("Result is " + sum);
		
		
		
	}

}
