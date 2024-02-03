package com.company;

import java.util.Scanner;

public class Main {

    public static void mekan_kontrol(int yas){

        if (yas<18){

            //throw kelimesi biz exception(hata) firlatmak istedigimizde kullaniriz.
            //Hatayi biz olustururuz
            throw new ArithmeticException();
        }
        else {
            System.out.println("Mekana hosgeldiniz...");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

        try {
            mekan_kontrol(yas);
        }
        catch (ArithmeticException e){
            System.out.println("18 yasindan kucukler mekana giremez...");
        }









    }
}
