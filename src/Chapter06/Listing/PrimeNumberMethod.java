package Chapter06.Listing;

import java.util.Scanner;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        /*
        1. Kullanıcadan bir değer alıyoruz.
        2. Bu değer asal sayı mı? methodu yaz.
        3. Bu methodun içinde asal sayı mı yazdır?
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz.");
        int numberOfPrime = input.nextInt();

        printPrimeNumber(numberOfPrime);
    }

    public static void printPrimeNumber(int numberOfPrime) {

        int countPrimeNum = 1;
        int num = 2;

        while (countPrimeNum <= numberOfPrime) {
            if (isPrime(num)) {
                if (countPrimeNum % 10 == 0) {
                    System.out.printf("%-5s\n", num);
                } else {
                    System.out.printf("%-5s", num);
                }
                countPrimeNum++;

            }

            num++;


        }
    }
    public static boolean isPrime(int num) {

        for (int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) {
                return false;
            }

        }
        return true;
    }
}
