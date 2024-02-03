package com.company;

public class Main {

    public static void main(String[] args) {

        Seyirci seyirci1 = new Seyirci("Oguz arttıran");
        Seyirci seyirci2 = new Seyirci("Abdullah bilgi");

        seyirci1.oyun_seyret();

        System.out.println("Seyirci sayisi : " + Seyirci.getSeyirci_sayisi());
        System.out.println("Seyirci sayisi : " + seyirci1.getSeyirci_sayisi());
        System.out.println("Seyirci sayisi : " + seyirci2.getSeyirci_sayisi());

        selamla();

        




    }

    public static void selamla(){
        System.out.println("Selamlar...");
    }



}
