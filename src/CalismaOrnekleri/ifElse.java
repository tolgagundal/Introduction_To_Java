package CalismaOrnekleri;

import java.util.Scanner;



public class ifElse {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("ucgenin kenarlarını giriniz.");

        double kenar1 = input.nextDouble();
        double kenar2 = input.nextDouble();
        double kenar3 = input.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil.");

        }
    }
}