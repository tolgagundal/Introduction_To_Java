package Chapter09.Ch09_01;

public class RectangleTest {
    public static void main(String[] args) {
        // 2 tane object oluştur
        // w: 4 ; h: 40
        // w2: 3.5 ; h2: 35.9

        // Bir obje oluştur

        RectangleClass rectangle1 = new RectangleClass(4, 40 );

        rectangle1.display();

        RectangleClass rectangle2 = new RectangleClass(3.5, 35.9);

        rectangle2.display();

    }
}
