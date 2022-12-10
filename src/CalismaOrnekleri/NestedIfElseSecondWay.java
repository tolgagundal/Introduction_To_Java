package CalismaOrnekleri;

import java.util.Scanner;

public class NestedIfElseSecondWay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cinsiyet ve yas girin.");
        String cinsiyet = input.nextLine();
        double yas = input.nextDouble();

        //once degiskenlerden birini ana degisken olarak secelim.

        if (cinsiyet.equalsIgnoreCase("Kadin")) { // kadin bolumu
            if (yas < 0 || yas > 90) {
                System.out.println("gecersiz yas");
            } else if (yas < 60) {
                System.out.println("Emekli olmak icin " + (60 - yas) + "daha calismalisin.");
            } else {
                System.out.println("emekli olabilirsin.");
            }
        }

        else if (cinsiyet.equalsIgnoreCase ("Erkek")) { // erkek bolumu

             if (yas < 0 || yas > 90) {
                 System.out.println("gecersiz");
             } else if (yas < 65) {
                  System.out.println("Emekli olmak icin " + (65 - yas) + "daha calismalisin.");
             } else {
                  System.out.println("emekli olabilirsin");
        }
    }   else  {
             System.out.println("hatali giris");
        }
    }
}

