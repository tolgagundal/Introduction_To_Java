package Chapter03;

import java.util.Scanner;

public class Ch03_33 { // (Financial: compare costs)

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight and price for package 1: ");
		
		double w1 = input.nextDouble();
		double p1 = input.nextDouble();
		
		double cost1 = p1 / w1;
		
		System.out.println("Enter weight and price for package 2: ");
			
		double w2 = input.nextDouble();
		double p2 = input.nextDouble();
		
		double cost2 = p2 / w2;
		
		if (cost1 < cost2) {
			System.out.println("Package 1 has a better price.");
		} else { 
			System.out.println("Package 2 has a better price");
		}
	}

}
