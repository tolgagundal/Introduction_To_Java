package Chapter06.Listing;

public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 10;
        final int CHARS_PER_LINE = 50;

        for (int i = 1; i <= NUMBER_OF_CHARS ; i++) {
            char ch = RandomCharacter.getRandomUpperCaseLetter();
            if (i % CHARS_PER_LINE ==0) {
                System.out.println(ch + " ");
            } else {
                System.out.print(ch + " ");
            }


        }
    }
}
