package com.abdullahbilgi.matematik;

public class Matematik implements IMatematik{

    //kurstan bak
    //https://www.youtube.com/watch?v=cAKDLmDG37s



    @Override
    public void toplama(int a, int b) {
        System.out.println("Toplama Sonucu : "+ (a+b));
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("Cikarma Sonucu : "+ (a-b));
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("Carpma Sonucu : "+ (a*b));
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bolme Sonucu : "+ (double)(a/b));
    }
}
