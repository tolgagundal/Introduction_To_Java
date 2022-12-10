package Week09;

import java.util.Scanner;

public class ArrayOrtUzeri {

    public static void main(String[] args) {
        Scanner input = new Scanner("Ortalama alınacak sayı sayısı");
         int donguSayisi = input.nextInt();
         double top = 0;
         double[] dizi = new double[donguSayisi];


        for (int i = 0; i < donguSayisi ; i++) {
            System.out.println("Bir sayi giriniz");
        top += input.nextInt();
        }
        System.out.println("Ort: " + (top / donguSayisi));
    }
}
