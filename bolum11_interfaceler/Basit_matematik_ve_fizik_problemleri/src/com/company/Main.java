package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik ve Fizik Problemleri Programina Hosgeldiniz...");

        String islemler = "Islemler...\n"
                         +"1. Dairenin Alanini Hesaplama\n"
                         +"2. Ucgen Cevresi Hesaplama\n"
                         +"3. 2 Vektorun Ic Carpimini Hesaplama\n"
                         +"Cikis icin q'ya basin.";

        while (true){
            System.out.println(islemler);
            System.out.print("Islemi seciniz : ");
            String islem = input.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }

            else if (islem.equals("1")){
                System.out.print("Dairenin Yaricapi : ");
                int yaricap = input.nextInt();
                input.nextLine();

                Problem.Matematik.daire_alan(yaricap);
            }

            else if (islem.equals("2")){
                System.out.print("Kenar 1 : ");
                int kenar1 = input.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2 = input.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3 = input.nextInt();
                input.nextLine();

                Problem.Matematik.ucgen_cevre(kenar1,kenar2,kenar3);
            }

            else if (islem.equals("3")){
                Vec vec1 = new Vec("Vekor1");
                Vec vec2 = new Vec("Vektor2");

                Problem.Fizik.icCarpim(vec1,vec2);
            }

            else {
                System.out.println("Gecersiz islem !");
            }
        }

    }
}
