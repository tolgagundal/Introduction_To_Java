package Chapter07.Listing;

import Chapter06.Listing.RandomCharacter;

public class DizidekiHarfleriSay {
    public static void main(String[] args) {
        char[] karakterDizisi = rassalDiziYarat();
        karakterDizisiniYazdir(karakterDizisi);

    }
    public static void karakterDizisiniYazdir(char[] karakterDizisi) {
        for (int i = 0; i < 100; i++) {

            if ((i+1) % 10 == 0) {

                System.out.println(karakterDizisi[i]);

            } else {
                System.out.print(karakterDizisi[i] + " ");
            }
        }
    }

    public static char[] rassalDiziYarat() {
        char[] dizi = new char[100];
            for (int i = 0; i < 100 ; i++) {

                dizi[i] = RandomCharacter.getRandomLowerCaseLetter();

            }
            return dizi;
        }


    }