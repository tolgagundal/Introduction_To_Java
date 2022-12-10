package CalismaOrnekleri;

public class VoidMethod {

    public static void main(String[] args) {

        /*
        Uye degilse: % 5 indirim
        Uye ise ve 5 yildan az ise : % 10 indirim
        Uye ise ve 5 yildan fazla ise : % 15 indirim

         */

        boolean uyeMi = true;
        int uyelikYili = 13;
        int satisFiyati = 250;
        indirimliFiyatHesaplama( uyeMi,  uyelikYili,  satisFiyati);

    }
    public static void indirimliFiyatHesaplama (boolean uyeMi, int uyelikYili, int satisFiyati) {
        if (uyeMi) {
            if (uyelikYili < 5) {
                System.out.println("indirim tutari: " + satisFiyati * 0.1);
                System.out.println("indirimli fiyatı: " + (satisFiyati - (satisFiyati * 0.1)));
            } else {

                System.out.println("indirim tutari: " + satisFiyati * 0.15);
                System.out.println("indirimli fiyati: " + (satisFiyati - (satisFiyati * 0.15)));
            }

        } else {
            System.out.println("indirim tutari: " + satisFiyati * 0.05);
            System.out.println("indirimli fiyati: " + (satisFiyati - (satisFiyati * 0.05) ));}

    }
}
