package chapters.Chapter02;

import java.util.Scanner;

public class C02_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Bir santigrat değeri giriniz: ");
		
		double santigrat = input.nextDouble();
	
		double fahrenayt = (9.0 / 5) * santigrat + 32;
		
		System.out.println("Sonuc = " + fahrenayt + " dır.");
		
		
	}

}
