package Chapter09.Listing;

public class SimpleCircle {
    double radius = 1;

    // Construct a circle object

    SimpleCircle() {
    }

    // Construct a circle object
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }
    // Return the area of this circle
    double getArea() {
        return radius * radius * Math.PI;
    }
    // Return the perimeter of this circle
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    // Set new radius for this circle
    void setRadius( double newRadius) {
        radius = newRadius;

    }
    }

