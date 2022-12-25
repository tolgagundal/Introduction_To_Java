package chapters.Chapter02;

import java.util.Scanner;

public class C02_09 {
	/*
	 * ​(​Fizik: ivme) Aşağıdaki formülde gösterildiği gibi, ortalama ivme hızdaki
	 * değişimin zamana bölünmesiyle elde edilir. ​ ​ ​ Kullanıcıdan ilk hızı​ (v0)
	 * metre/saniye, son hızı (​v1) metre/saniye ve zamanı (​t) saniye olarak alan
	 * ve ortalama ivmeyi gösteren bir program yazınız.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(" Enter v0: , v1: and t: ");

		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();

		double acceleration = (v1 - v0) / t;

		System.out.println(" The average acceleration is " + acceleration);

	}

}
