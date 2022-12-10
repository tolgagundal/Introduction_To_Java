package Week09;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int DIZI_UZUNLUGU = 2;

        int[] dizi = new int[DIZI_UZUNLUGU];

        System.out.println("once " + dizi[0]);
        dizi = new int[100];

        System.out.println("sonra " + dizi[0]);

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);

        }
        // dizi elemanları yazdırılıyor

        for (int i = 0; i < dizi.length; i++) {
            System.out.printf("%5d", dizi[i]);
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println(dizi);

        char[] city = {'D', 'a', 'l', 'l', 'a','s'};
        System.out.println(city);

        String str = "Dallas";
        System.out.println(str);


        // dizinin toplamı

        int top = 0;
        for (int i = 0; i < dizi.length; i++) {
            top += dizi[i];
        }
        System.out.println("Dizi elemanlarının toplamı " + top);

        // dizinin en büyük elemanı

        int max = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (max < dizi[i]) {
                max = dizi[i];
            }
        }
        System.out.println("Max num: " + max + " dir");

        // dizinin en büyük elemanın en küçük indexi

        int enBuyukElemanı = 0;
        int enBuyukElemanınIndexi = -1;
        for (int i = 0; i < dizi.length ; i++) {
            if (enBuyukElemanı <= dizi[i]){
                enBuyukElemanı = dizi[i];
                enBuyukElemanınIndexi = i;
            }
            System.out.println(enBuyukElemanı);
            System.out.println(enBuyukElemanınIndexi);

        }
    }


}

