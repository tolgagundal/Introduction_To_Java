package chapters.Chapter02;

import java.util.Scanner;

public class C02_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Aşağıdaki tabloyu oluşturacak bir program yazınız: ");

		int tamSayi;
	
		
		for(int a = 1; a <= 5; a++) { 
			
			tamSayi = (int)(Math.pow(a, a + 1));
			System.out.println(a + "  "+(a+1)+"  " + tamSayi);
		}
		
		
	}
			}

