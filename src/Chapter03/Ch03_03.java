package Chapter03;

import java.util.Scanner;

public class Ch03_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a, b, c, d, e, f: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		
		//ax + by = e
		//cx + dy = f
		
		double x = (e * d) - (b * f) / (a * d) - (b * c);
		double y = (a * f) - (e * c) / (a * d) - (b * c);
		
		boolean result = (a * d) - (b * c) == 0;
		
	if ((a * d) - (b * c) == 0) {
		
		System.out.println(" Denklemin çözümü yoktur.");
		} else {
			System.out.println(" result is " + result);
		}
				
	}

}
