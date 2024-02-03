package Encapsulation;

public class Main {
    public static void main(String[] args) {

       /* Abone abone = new Abone();//Encapsulation 'a uymuyor.

        abone.isim="Abdullah Bilgi";
        abone.bakiye=200;
        abone.sehir="Ordu";

        abone.dogalgaz_kullan(200);  */

        GelismisAbone abone = new GelismisAbone("Abdullah Bilgi",200,"Ordu");//Encapsulation 'a uygun

        abone.bakiye_ogren();



    }
}
