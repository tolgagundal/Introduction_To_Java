package Chapter03;

import java.util.Scanner;

public class Ch03_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the weight of the package");

		double w = input.nextDouble();

		if (0 < w && w <= 1) {
			System.out.println("Your shipping cost is 3.5$");

		} else if ( 1 < w && w <= 3) {
			System.out.println(" Your shipping cost is 5.5$");
			
		} else if ( 3 < w && w <= 10) {
			System.out.println(" Your shipping cost is 8.5$");
			
		} else if ( 10 < w && w <= 20) {
			System.out.println(" Your shipping cost is 10.5$");
			
		}  else if (w > 20) {
			System.out.println("The package can not be shipped.");
			
			
		}

}

}
