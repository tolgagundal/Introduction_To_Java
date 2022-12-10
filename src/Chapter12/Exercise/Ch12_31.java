package Chapter12.Exercise;

import java.io.File;
import java.util.Scanner;

public class Ch12_31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();
        System.out.println("Enter gender(M/F): ");
        char gender = input.next().charAt(0);
        System.out.println("Enter a name: ");
        String name = input.nextLine();



    }
}
