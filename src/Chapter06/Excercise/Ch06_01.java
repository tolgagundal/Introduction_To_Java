package Chapter06.Excercise;

public class Ch06_01 {
    public static void main(String[] args) {
        //Math: pentagonal numbers

        final int num = 100;
        final int NUMBER_PER_LINE = 10;

        for (int i = 1; i <= num; i++) {
            if (i % 10 == 0) {
                System.out.printf("%-7s\n", getPentagonalNumber(i));
            } else {
                System.out.printf("%-7s", getPentagonalNumber(i));
            }
        }
    }
    public static int getPentagonalNumber(int n) {
           int x =n*(3*n-1)/2;
            return x;
        }
}
