package Chapter09.Listing;

public class ClassTest {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator( 3, 5, "blue");

        System.out.println("3 + 5 = " +cal1.toplama());
        System.out.println("3 * 5 = " +cal1.carpma());
    }
}
