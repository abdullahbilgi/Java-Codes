package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        try {
            //Exception olusturabilecek kodlar
        }

        catch (Exception turu e){
            //Exception durumuda yapilacak islemler
        }
        */




        //int a = 30/0; //Unchecked Exception

       /* int[] b = {1,2,3,4,5};
        System.out.println(b[5]);*/


        //System.out.println("Burasi calisiyor...");

        /*

        try {
            //int c = 30/0;//ArithmeticException

            int [] d = {1,2,3,4,5};
            System.out.println(d[6]);


        }
        catch (ArrayIndexOutOfBoundsException e){//(Exception e ) seklinde yazilabilir

            //System.out.println("Bir sayi sifira bolunemez..");//ArithmeticException icin

            System.out.println("Array in boyunu astiniz....");

            e.printStackTrace();//Hatanin ne oldgunu soyluyor
        }

        System.out.println("Burasi calisiyor");

*/

        try {

            /*
            -Bir tane exception yakalayinca ilgili catch siradan baslayrak ilgili catch blogunu bulur
            ve try-catch blogunu atlayarak devam eder.
            -ilk exception bulunca diger exception lara bakmaz.en ustte olana bakar.
             */

            int e = 30/0;

            int [] f = {1,2,3,4,5};
            System.out.println(f[6]);
        }
        catch (ArithmeticException e){
            System.out.println("Bir sayi 0'a bolunemez...");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayin boyunu astiniz...");
        }
        catch (Exception e){//catch bloklari ozelden genele dogru yazilir
            System.out.println("Bir hata olustu");
        }

        System.out.println("Burasi calisiyor");



















    }
}
