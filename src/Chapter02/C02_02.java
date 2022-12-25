package chapters.Chapter02;

import java.util.Scanner;

public class C02_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" yaricap giriniz: ");

		double yaricap = input.nextDouble();

		double alan = yaricap * yaricap * Math.PI;
		System.out.println(" alan = " + alan);

		System.out.println(" yukseklik giriniz: ");

		double yukseklik = input.nextDouble();

		double hacim = alan * yukseklik;

		System.out.println(" hacim = " + hacim);

	}

}
