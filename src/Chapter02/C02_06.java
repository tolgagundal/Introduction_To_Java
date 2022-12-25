package chapters.Chapter02;

import java.util.Scanner;

public class C02_06 {

	public static void main(String[] args) {

		// Klavyeden okuma yapmak için Scanner nesneleri oluştur.

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 1000");

		// nextInt() metodu ile tam sayi değerinde deger okumasi yapilir.

		int number = input.nextInt();

		int adet = 0, toplam = 0; // BUNU SOR !!! !!! !!!

		while(number != 0)
					{

			toplam = (number % 10) + toplam;
			number /= 10;
			++adet;

		}
		System.out.println("Basamak toplamı: " + toplam);
	}

}
