package chapters.Chapter02;

import java.util.Scanner;

public class C02_20 {
	
	/* ​Finans uygulaması: faiz hesaplama) Bakiye ve yıllık faiz oranını biliyorsak aşağıdaki
formülü kullanarak bir sonraki ay elde edilecek faiz geliri hesap edilebilir.
faizGetirisi = bakiye * (yillikFaizOrani / 1200)
Kullanıcıdan, bakiye ve yıllık faiz oranını isteyen ve bir sonraki ay için elde edilecek faiz gelirini
hesaplayan bir program yazınız.
/*
 * 
 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter balance and interest rate");
		
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		
		double interest = balance * (interestRate / 1200);
		
		System.out.println("The interest is " + interest);
		
		
	}

}
