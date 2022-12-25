package chapters.Chapter02;

import java.util.Scanner;

//Population projection) Rewrite Programming Exercise 1.11 to prompt the user 
//to enter the number of years and displays the population after the number of years. 
//Use the hint in Programming Exercise 1.11 for this program. The population 
//should be cast into an integer. Here is a sample run of the program:

public class C02_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner object
		
		// Prompt the user to the number of years
		
		System.out.println("Enter the number of years");
		
		//Ipucu: Java’da, iki tam sayının bölümü, yine bir tamsayıdır. Ondalık kısım atılır. Örneğin; ​5 ​/ ​4 ​değeri ​1
	//	(​1.25​ değil) ve ​10 ​/ ​4 ​değeri ​2 ​(​2.5​ değil) olur. Eğer noktadan sonraki kısım kaybedilmek istenmiyorsa
		//sayılardan birinin noktalı olması gerekir. Örneğin; ​5.0 ​/ ​4 ​değeri ​1.25 ​ve ​10 ​/ ​4.0 ​değeri ​2.5​.

		int years = input.nextInt()
				
				// Calculate population projection
				
				int population = 312032486;
		
		
		
		
	}

}
