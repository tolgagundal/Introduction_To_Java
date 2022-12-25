package Chapter03;

import java.util.Scanner;

public class Ch03_11 {

	public static void main(String[] args) {

		/*
		 * (Bir ayın gün sayısı) Kullanıcıdan ay ve yıl bilgisini alan ve yılın bu ayına
		 * ait gün sayısını gösteren bir program yazınız. Örneğin; kullanıcı ay için 2
		 * ve yıl için 2012 girerse, program “Şubat 2012, 29 gündür” mesajını
		 * gösterecek. Eğer kullanıcı ay için 3 ve yıl için 2015 girerse, program “Mart
		 * 2015, 31 gündür” mesajını gösterecek.
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a month and year");

		int month = input.nextInt();
		int year = input.nextInt();

		int day=0;
		
		String monthName="";
			
				
		switch (month) {

		case 1:{
			day = 31; monthName="Ocak";
			}break;
		case 2: {
			day = 30; monthName="Şubat";
			}break;
		case 3: {
			day = 31; monthName="Mart";
			}break;
		case 4:{
			day = 31; monthName="Nisan";
			}break;
		case 5: {
			day = 31; monthName="Mayıs";
			}break;
		case 6: {
			day = 31; monthName="Haziran";
			}break;
		case 7: {
			day = 31; monthName="Temmuz";
			}break;
		case 8: {
			day = 31; monthName="Ağustos";
			}break;
		case 9: {
			day = 31; monthName="Eylül";
			}break;
		case 10: {
			day = 31; monthName="Ekim";
			}break;
		case 11: {
			day = 31; monthName="Kasım";
			}break;
		case 12: {
			day = 31; monthName="Aralık";
			}break;
		
		} 
		
		System.out.println(monthName + " " + year + " , " + day + " gündür.") ;
	}

}
