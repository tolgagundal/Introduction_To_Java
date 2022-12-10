package Chapter06.Listing;

public class SixOneIntroduction {
    public static void main(String[] args) {

        System.out.println("sum of numbers: " + sum(1, 10));
        System.out.println("sum of numbers: " + sum(20, 37));
        System.out.println("sum of numbers: " + sum(35, 49));
    }
    public static int sum (int num1, int num2) {
       int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }
}

