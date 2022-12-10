package Chapter07.Listing;

import java.util.Scanner;

public class YaziyiTerstenYazdir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir yazi giriniz");
    String yazi = input.nextLine();
    char[] yaziDizisi = yazi.toCharArray();
    char[] yazininTersi = terseCevir(yaziDizisi);

        System.out.println("Girdiğiniz yazinin ters: " + yazininTersi);

    }

    public static char[] terseCevir(char[] yaziDizisi) {
        char[] yazininTersi = new char[yaziDizisi.length];

        for (int i = 0, j = yazininTersi.length -1; i <yazininTersi.length; i++, j--){

            yazininTersi[j] = yaziDizisi[i];
        }
return yazininTersi;
    }
}
