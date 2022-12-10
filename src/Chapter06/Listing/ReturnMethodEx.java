package Chapter06.Listing;

import java.util.Scanner;

public class ReturnMethodEx {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade");
        double grade = input.nextDouble();
        System.out.print("The grade is: " + printGrade(grade));
    }

    public static char printGrade(double score) {
        char letterGrade;

        if (score >= 90.0) {
            letterGrade = 'A';
        } else if (score >= 80.0) {
            letterGrade = 'B';
        } else if (score >= 70.0) {
            letterGrade = 'C';
        } else if (score >= 60.0) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }


}