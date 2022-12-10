package Chapter06.Listing;

import java.util.Scanner;

public class VoidMethodEx {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade");
        double grade = input.nextDouble();

        System.out.println("The grade is: ");
        printGrade(grade);

    }
    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        } else if (score >= 80.0) {
            System.out.println('B');
        } else if (score >= 70.0) {
            System.out.println('C');
        } else if (score >= 60.0) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }


    }
}