package CalismaOrnekleri;

import java.util.Scanner;

public class TernaryOrnegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int sayi = input.nextInt();

        System.out.println(sayi %5==0 ? " 5'in tam katidir ":" 5'in tam kati degildir");

    }
}
