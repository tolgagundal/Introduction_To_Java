package CalismaOrnekleri;

import java.util.Scanner;

public class nestedIfElse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cinsiyet girin.");
        String cinsiyet = input.nextLine();
        double yas = input.nextDouble();
    
        if (yas < 0 || yas >90) {
            System.out.println("Girilen yas gecersiz.");
        } else if (!(cinsiyet.equalsIgnoreCase("Kadin") ||
        cinsiyet.equalsIgnoreCase("Erkek"))) {
            System.out.println("Girilen cinsiyet gecersiz.");
        } else if (cinsiyet.equalsIgnoreCase("Kadin") && yas >= 60) {
            System.out.println("Emekli olabilirsin.");
        } else if (cinsiyet.equalsIgnoreCase("Kadin") && yas < 60) {
        System.out.println("Emekli olmak icin" + (60 - yas) + " yil daha calisman lazim");
        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas >= 65) {
            System.out.println("Emekli olabilirsin.");

        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas < 65) {
            System.out.println("Emekli olmak icin" + (65 - yas) + " yil daha calisman lazim");
        }
            

    }
}
