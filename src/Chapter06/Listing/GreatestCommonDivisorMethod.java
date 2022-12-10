package Chapter06.Listing;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1");
        int num1 = input.nextInt();
        System.out.println("Enter number2");
        int num2 = input.nextInt();

        System.out.println("The greatest common divisor for " + num1 +
                " and " + num2 + " is " + getGcd(num1, num2));
        }
        public static int getGcd(int num1, int num2) {
        int gcd = 1;
        int k = 2;
        while (k <= num1 && k <= num2) {
            if (num1 % k==0 && num2 % k==0) {
                gcd = k;
            }
            k++;
        }
        return gcd;


    }
}
