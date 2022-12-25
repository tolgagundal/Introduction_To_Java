package chapters.Chapter02;

import java.util.Scanner;

public class C02_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Deger giriniz: ");

		double feet = input.nextDouble();

		double meters = feet * 0.305;

		System.out.println(feet + " feet is " + meters + "meters");

	}

}
