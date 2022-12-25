package chapters.Chapter02;

import java.util.Scanner;

public class C02_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" (side1)​,​ (side2)​,​ (side3)​ gibi üç nokta giriniz. ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double side1 = Math.pow(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2), 0.5);
		double side2 = Math.pow(Math.pow((y2 - y3), 2) + Math.pow((x2 - x3), 2), 0.5);
		double side3 = Math.pow(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2), 0.5);

		double side = (side1 + side2 + side3) / 2;

		double area = Math.pow(side * ((side - side1) * (side - side2) * (side - side3)), 0.5);

		System.out.println(" The area of the triangle is " + area);

	}

}
