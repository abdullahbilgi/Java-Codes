package com.company;

public class staticClass {

    public static int obje_sayisi = 0;//static ile oluşturunca bellekte sadce bir defa oluşturulurlar

    private static String isim;

    public staticClass(String isim){

        this.isim=isim;

        obje_sayisi++;

    }

    public static String getIsım() {//static method static olmayan bir özellik kullanamaz ör(private isim)
        return isim;
    }



}
