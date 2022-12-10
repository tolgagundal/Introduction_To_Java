package Chapter07;

public class ArraysTest{
    public static void main(String[] args) {
        int[] sayiDizisi;

        sayiDizisi = new int[30];

        for (int i = 0; sayiDizisi.length < i; i++) {
            sayiDizisi[i] = i;

        }
        System.out.println(sayiDizisi.length);
    }


}
