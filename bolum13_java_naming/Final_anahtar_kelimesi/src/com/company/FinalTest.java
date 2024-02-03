package com.company;

public class FinalTest {

    //final ile tanımlanan değerler değiştirilemiyor.
    //ilk değeri ya ilk başta vericez yada consructer ile vericez
    //başta değer verirsek consructer içinde yeniden değer veremeyiz

    public final int obje_sayisi;

    private static int say = 0;

    private final String isim;

    public FinalTest(String isim){

        this.isim=isim;
        say++;
        obje_sayisi=say;

    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }
}
