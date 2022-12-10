package Chapter07.Listing;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int size = input.nextInt();
        double[] arrNumbers = new double[size];  // kullanıcıdan array size ı alalım.
        double sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter "+(i+1) +". number: ");
            arrNumbers[i] = input.nextDouble();
            sum += arrNumbers[i];   // kullanicidan her array elemani icin deger aldik.

        }
        double average = sum / size;

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arrNumbers[i] > average) {
                count++;
            }
        }
        System.out.printf("Average is %.2f , %d above average." , average ,count );
}
}


