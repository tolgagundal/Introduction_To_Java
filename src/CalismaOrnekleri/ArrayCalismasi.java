package YoutubeCalismalari;

import java.util.Arrays;

public class ArrayCalismasi {

	public static void main(String[] args) {

		int sayi [] = new int [6];
		
		String str = "Java cok guzel";
		
		String[] kelimeler = str.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));
		
		String[] kelimeler2 = str.split("a");
		
		System.out.println(Arrays.toString(kelimeler2));
		
		String[] kelimeler3 = str.split("");
		
		System.out.println(Arrays.toString(kelimeler3));
		
		int[] sayilar = {1,2,3};
		
		
		
	}

}
