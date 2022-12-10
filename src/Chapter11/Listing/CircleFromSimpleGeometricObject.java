package Chapter11;

public class CircleFromSimpleGeometricObject
        extends SimpleGeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject() {
    }
    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }
    public CircleFromSimpleGeometricObject (String color, boolean filled, double radius) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double diameter() {
        return radius * 2;
    }
    public double perimeter() {
        return 2*radius*radius*Math.PI;
    }
    public void printCircle() {
        System.out.println("The circle is created: " + getDateCreated() + " and the radius is: " + radius);

    }






}
