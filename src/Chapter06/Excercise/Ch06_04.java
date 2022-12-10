package Chapter06.Excercise;

import java.util.Scanner;

public class Ch06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        reverseNum(num);


    }
        public static void reverseNum(int num) {
        String reverse = "";
        String reverseNum = Integer.toString(num);
            for (int i = reverseNum.length()-1; i > -1; i--) {
                reverse = reverse + reverseNum.charAt(i);
            }

        Integer.parseInt(reverse);
            System.out.println(reverse);
    }
}
