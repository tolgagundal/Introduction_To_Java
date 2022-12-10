package Chapter09.Ch09_04;

import java.util.Random;

public class RandomTest {

        public static void main(String[] args) {
            Random randomx = new Random(1000);

            for (int i = 0; i < 50; i++) {
                System.out.print(randomx.nextInt(100) + " ");
                if((i+1) % 10 == 0){
                    System.out.println();
                }
            }
        }
    }

