package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int bakiye=1000;
        System.out.println("********************************");
        System.out.println("1.Islem : Bakiye Ogrenme\n2. Islem : Para Cekme\n3.Islem : Para Yatirma\nCikmak icin q'a basin");
        System.out.println("********************************");

        while (true){
            System.out.print("Islemi seciniz:");
            String islem=scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz : "+bakiye);
            }
            else if(islem.equals("2")){
                System.out.print("Para cekmek istediginiz tutar : ");
                int tutar=scanner.nextInt();
                scanner.nextLine();

                if ((bakiye-tutar)<0)
                    System.out.println("Bakiyeniz yetersiz. Bakiyeniz : "+bakiye);
                else {
                    bakiye-=tutar;
                    System.out.println("Yeni bakiyeniz :"+bakiye);
                }
            }
            else if(islem.equals("3")){
                System.out.print("Yatirmak istediginiz tutari giriniz:");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiyeniz:"+bakiye);

            }
            else{
                System.out.println("Gecersiz islem...");
            }


        }







    }
}
