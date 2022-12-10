package Chapter09.Ch09_01;

public class RectangleClass {
    // data field

    double width;
    double height;

    // Kullanıcı herhangi bir değer girmediğinde çalıştırılacak default değerleri atayacak constructurdır.

    RectangleClass() {
        width =1;
        height =1;
    }
    // Kullanıcadan alıncak argumanlar bu constructurda kullanılır.

    public RectangleClass(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Width: " + width + " Height: " + height + " Alan: " + getArea() + " ve cevre: " + getPerimeter());
    }


}


