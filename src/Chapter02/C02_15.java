package chapters.Chapter02;

import java.util.Scanner;

public class C02_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter x1 and y1:"
				+ "Enter x2 and y2");
		
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	
	double distance = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
	System.out.println(" The distance bt two point is " + distance);
	
	
				
				
		
	}

}
