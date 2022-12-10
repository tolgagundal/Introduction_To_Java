package Chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class DiziIslemleri {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);

        int[] dizi = new int[10];

        System.out.println("10 adet sayi giriniz.");

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = klavye.nextInt();
        }

        System.out.println(Arrays.toString(dizi));


    }
}
