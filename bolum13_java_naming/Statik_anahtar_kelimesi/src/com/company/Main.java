package com.company;

public class Main {

    public static void main(String[] args) {

        /*staticClass s1 = new staticClass("Murat");
        staticClass s2 = new staticClass("Mehmet");

        System.out.println("Obje sayisi : "+ staticClass.obje_sayisi);
        System.out.println("Obje sayisi : "+ staticClass.obje_sayisi);
        System.out.println("Obje sayisi : "+ staticClass.obje_sayisi);*/


        toplama(3,4,5);




    }

    public static void toplama(int a,int b,int c){//method static olmazsa mainde kullanamayız
        System.out.println(a+b+c);
    }



}
