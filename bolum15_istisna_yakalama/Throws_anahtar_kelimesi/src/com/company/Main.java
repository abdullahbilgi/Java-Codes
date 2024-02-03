package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void mekan_kontrol(int yas) throws IOException{

        //throws amahtar kelimesi ChcekExceptionlarda kullanilmasi zorunlu

        if (yas<18){


            throw new IOException();
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
        } catch (IOException e) {
            System.out.println("IOException olustu");
        }

        /*ustteki gibi yaprsak hatayi bi yakalamis oluruz ama

        public static void main(String[] args) throws IOException{

        mekan_kontrol(yas);
        }

        main blogunu boyle yazarsak hatayi kullanacak kisi bulsun diye boyle bırakırız
        */










    }
}
