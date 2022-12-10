package Chapter07;

import java.util.Arrays;

public class ArraySplit {

    public static void main(String[] args) {

        String okul = "Okulumu cok seviyorum.";
        String[] arrSplit = okul.split(" ");


        System.out.println(Arrays.toString(arrSplit));
    }
}
