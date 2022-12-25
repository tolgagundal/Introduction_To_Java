package Chapter03;

import java.util.Scanner;

public class Ch03_05 {

	public static void main(String[] args) {

		/*
		 * (Haftanın günü) Kullanıcıdan bugüne karşılık gelen bir tam sayı (Pazar ­ 0,
		 * Pazartesi ­ 1, …, ve Cumartesi ­ 6 olacak şekilde) alan bir program yazınız.
		 * Aynı zamanda kullanıcıdan, “bugünden kaç gün sonra” için de bir tam sayı
		 * değeri alarak, ona karşılık gelen günü gösteriniz. Örnek akışı inceleyiniz:
		 * /* /*
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter today's day: ");

		int day = input.nextInt();

		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		// Calculate future day
		
		int futureDay = (day + daysElapsed) % 7;
		
		System.out.println("Today is ");
		 switch (day)
		 {
		 case 0 : System.out.print("Sunday"); break;
		 case 1 : System.out.print("Monday"); break;
		 case 2: System.out.print("Tuesday"); break;
		 case 3: System.out.print("Wednesday"); break;
		 case 4: System.out.print("Thursday"); break;
		 case 5: System.out.print("Friday"); break;
		 case 6: System.out.print("Saturday");
		 
		 }
		 
		 System.out.print(" and the future day is ");
		 		switch (futureDay)
		 		{
		 		
		 		case 0 : System.out.println("Sunday"); break;
		 		case 1 : System.out.println("Monday"); break;
		 		case 2: System.out.print("Tuesday"); break;
				 case 3: System.out.print("Wednesday"); break;
				 case 4: System.out.print("Thursday"); break;
				 case 5: System.out.print("Friday"); break;
				 case 6: System.out.print("Saturday");
		 }
		
		
	}

}
