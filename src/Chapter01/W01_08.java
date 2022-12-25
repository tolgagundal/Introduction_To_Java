package chapters.Chapter01;

import java.lang.Math;

public class W01_08 {
	public static void main(String[] args) {
		double perimeter;
		double radius = 5.5;
		double area;
		double pi = Math.PI;
		perimeter = 2 * radius * pi;
		area = radius * radius * pi;
		System.out.println("Çemberin alanı:" + area);
		System.out.println("Çemberin çevresi:" + perimeter);

	}
}
