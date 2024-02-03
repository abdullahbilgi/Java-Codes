package com.company;

import java.util.Scanner;

public class Main {


    public static void mekan_kontrol(int yas){

        if (yas<18){
            throw new InvalideAgeException("Invalid Age");
        }
        else {
            System.out.println("Mekana hos geldiniz...");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

        try {
            mekan_kontrol(yas);
        }
        catch (InvalideAgeException e){

            //e.printStackTrace();
            System.out.println(e);
        }




    }
}
