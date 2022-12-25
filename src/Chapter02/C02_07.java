package chapters.Chapter02;

import java.util.Scanner;

public class C02_07 {

	public static void main(String[] args) {

		// Kullanıcıdan bir dakika girmesini iste.

		Scanner input = new Scanner(System.in);

		// Buna karşılık gelen yıl, gün ve dakikayı yazdır.

		System.out.println("Enter the number of minutes: ");

		int minutes = input.nextInt();

		int totalDays = minutes / (60 * 24);

		int totalYears = totalDays / 365;

		int remainDays = totalDays - (totalYears * 365);

		System.out.println(minutes + " minutes is aproximately " + totalYears + " years and " + remainDays + " days ");

		;

	}

}
