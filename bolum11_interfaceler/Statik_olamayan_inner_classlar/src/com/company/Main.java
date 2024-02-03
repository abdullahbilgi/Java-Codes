package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Matematik.Factoriel factoriel = new Matematik().new Factoriel();/*ilk once matematik.factoriel diyerek class a erisiyoz sonra
                                                                          matematik objesi olusurup matematik objesi icinde factoriel objesi olusturuyoruz.*/
        Matematik.Asal asal = new Matematik().new Asal();

        Matematik.Alan.DaireAlan alan = new Matematik().new Alan().new DaireAlan();


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();

        if (asal.asal_mi(sayi))
            System.out.println("Bu bir asal sayidir.");
        else
            System.out.println("Bu bir asal sayi degildir..");


        factoriel.faktoriel();

        alan.daire_alan(5);


    }
}
