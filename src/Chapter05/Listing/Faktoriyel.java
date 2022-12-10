package Chapter05;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);

        int sayi = 10;

        int faktoriyel = 1; // neden 1 : carpmaya gore 1 etkisiz eleman

        for (int i = sayi; i >= 1; i--) {

            faktoriyel = faktoriyel * i;


        }
        System.out.println(faktoriyel);
    }
}
