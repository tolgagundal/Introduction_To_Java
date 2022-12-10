package Chapter07.Listing;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        double[] list = new double[10];
        list[9] = 5.5;
        System.out.println(list[0] + list[1]);
        double total =0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];

        }
        System.out.println(total);

        double min = list[0];
        int indexOfMin = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i] < min) {
                min = list[i];
                indexOfMin = i;
                
            }
            
        }
        System.out.println(indexOfMin);

        double[] random = new double[5];
        for (int i = 0; i < random.length; i++) {
            random[i] = Math.random() * 100;
            System.out.printf("%.2f  ", random[i]);

        } System.out.println();
        System.out.println(Arrays.toString(random) + " ");


    }
}
