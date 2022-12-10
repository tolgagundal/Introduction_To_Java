package Chapter06.Excercise;

import java.util.Scanner;

public class Ch06_05 {  // Sort three numbers
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);



    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 > num2 && num2 > num3) {
            System.out.println(num1 +" is max");
            System.out.println(num2 +" is mid");
            System.out.println(num3 +" is min");

        } else if (num1 > num3 && num3 > num2) {
            System.out.println(num1 +" is max");
            System.out.println(num3 +" is mid");
            System.out.println(num2 +" is min");

        } else if (num2 > num1 && num1 > num3) {
            System.out.println(num2 +" is max");
            System.out.println(num1 +" is mid");
            System.out.println(num3 +" is min");

        }  else if (num2 > num3 && num3 > num1){
            System.out.println(num2 +" is max");
            System.out.println(num3 +" is mid");
            System.out.println(num1 +" is min");

        } else if (num3 > num1 && num1 > num2){
            System.out.println(num3 +" is max");
            System.out.println(num1 +" is mid");
            System.out.println(num2 +" is min");

        }   else if (num3 > num2 && num2 > num1){
            System.out.println(num3 +" is max");
            System.out.println(num2 +" is mid");
            System.out.println(num1 +" is min");

        }

    }

    }

