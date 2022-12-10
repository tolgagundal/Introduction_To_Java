package Chapter09.Listing;

public class Calculator {
    public int num1;
    public int num2;
    public String color;
    Calculator() {
    }

    Calculator(int num1, int num2, String color) {
        this.num1 = num1;
        this.num2 = num2;
        this.color = color;

    }
    public int toplama() {
        return this.num1 + this.num2;
    }
    public int cikarma() {
        return this.num1 - this.num2;
    }
    public int carpma() {
        return this.num1 * this.num2;
    }
    public int bolme() {
        return this.num1 / this.num2;
    }
}