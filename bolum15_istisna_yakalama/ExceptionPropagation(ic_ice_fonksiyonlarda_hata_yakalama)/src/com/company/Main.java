package com.company;

public class Main {

    public static void ucuncu_fonsiyon(){
        try {

            int a = 12 / 0;
        }
        catch (ArithmeticException e){
            System.out.println("Bir sayi sifira bolunemez");
        }

    }

    public static void ikinci_fonksiyon(){

        ucuncu_fonsiyon();
    }

    public static void birinci_fonksiyon(){
        ikinci_fonksiyon();
    }

    /* bu sekildede exception u yakalayabiliriz

     public static void ucuncu_fonsiyon(){


            int a = 12 / 0;


    }

    public static void ikinci_fonksiyon(){

    try{
        ucuncu_fonsiyon();
        }
        catch(){
        System.out.println("Bir sayi 0 a bolunemez");
        }

    }

    public static void birinci_fonksiyon(){
        ikinci_fonksiyon();
    }


     */




    public static void main(String[] args) {

        birinci_fonksiyon();

        /*
        ucuncu() --> ikinci() --> birinci() --> main

        soldan baslayarak exception i yakalamaya calisir. sirasi ile soldakinde yoksa sagdakine
        bakarak exception arar hicbir fonksiyonda yakalayamazsa hataya sebeb olur

          */
    }
}
