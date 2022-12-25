package Chapter03;

import java.util.Scanner;

public class Ch03_12 {

	public static void main(String[] args) {
/*
 * Palindrom sayılar) Kullanıcıdan üç basamaklı bir tam sayı alan ve bu sayının palindrom olup
olmadığını sınayan bir program yazınız. Eğer sayı sağdan­sola ve soldan­sağa aynı ise, bu sayı
palindromdur. Programın örnek akışını inceleyiniz:
 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3-digits number");
		
		int number = input.nextInt();
		int num3 = number / 100;
		int num2 = number / 10;
		int num1 = number % 10;
		
		
		if (num1 == num3) {
			
			 System.out.println(" Your number is palindromdur.");
		} 
		
		else {
			System.out.println("It isn't a palindrom.");
		}
			
	}

}
