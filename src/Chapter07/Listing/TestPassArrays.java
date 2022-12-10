package Chapter07.Listing;

public class TestPassArrays {
    //main method
    public static void main(String[] args) {
        int[] a = {1, 2};
        // swap elements using the swap method
        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        // Swap elements using the swapFirstTwoInArray method
        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    // swap two variables
    private static void swap(int i, int i1) {
        int temp = i1;
        int n2 = 0;
        int n1 = n2;
        n2 = temp;

    }
    private static void swapFirstTwoInArray(int[] a) {
        int[] array = new int[0];
        int temp = array[0];
        array[0] = array[1];
        array[1]= temp;

            }
}
