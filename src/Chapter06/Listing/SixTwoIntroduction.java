package Chapter06.Listing;

public class SixTwoIntroduction {
    public static void main(String[] args) {

        int z =max(8,45);

        System.out.println("Max num is: " +z);
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        return result;
    }
}
