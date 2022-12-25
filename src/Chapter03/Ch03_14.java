package Chapter03;

import java.util.Scanner;

public class Ch03_14 {

	public static void main(String[] args) {

// (Oyun: yazı tura) Kullanıcıyla yazı­tura tahmin oyunu oynayan bir program yazınız. 
		// Program rastgele 0 (tura) ya da 1 (yazı) değerlerini üretsin.
		// Kullanıcıdan tahmini alınız ve doğru olup olmadığını gösteriniz.

System.out.println("Enter 0 or 1, 0 = head, 1 = tail");

		Scanner input = new Scanner(System.in);

		int userInput = input.nextInt();
		
		int output = (int)(Math.random() * 2);
		
		if (output == userInput && output == 0) {
			System.out.println("cevap head, doğru bildiniz");
		} else if  (output == userInput && output == 1) {
			System.out.println("cevap tail, doğru bildiniz");
			
		} else if  (userInput != 1 && userInput != 0) {
			System.err.println("Yanlış aralık girdiniz! Lütfen 0 veya 1 değerlerinden birini giriniz!");
		
			} else {
				System.out.println("bilemediniz! doğru cevap: "+output);
			} 
}
}
