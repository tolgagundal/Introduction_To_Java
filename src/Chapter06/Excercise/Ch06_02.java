package Chapter06.Excercise;

import java.util.Enumeration;
import java.util.Scanner;

public class Ch06_02 { //Sum the digits in an integer
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        long num = input.nextLong();
        System.out.println("SumDigits: "  + getSumDigits(num));


       }
    public static long getSumDigits(long num) {

        long birlerBasamagi = num % 10;
        long onlarBasamagi = (num/10) % 10;
        long yuzlerBasamagi = (num/100);

        return birlerBasamagi + onlarBasamagi + yuzlerBasamagi;
    }


}

