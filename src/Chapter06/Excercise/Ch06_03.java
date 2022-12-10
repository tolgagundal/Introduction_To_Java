package Chapter06.Excercise;

import java.util.Scanner;

public class Ch06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if(isPalindrome(num)) {
            System.out.println("Your number is palindrome number.");
        } else {
            System.out.println("Your number is not palindrome number.");
        }
    }
        public static boolean isPalindrome(int num) {

        if (num == reverse(num)) {

            return true;
        }
            return false;
        }
        public static int reverse (int num) {
        String reverse = "";
        String revNum = Integer.toString(num);
            for (int i = revNum.length() - 1; i > -1 ; i--) {
                reverse = reverse + revNum.charAt(i);
            }
            return Integer.parseInt(reverse);



    }
}
