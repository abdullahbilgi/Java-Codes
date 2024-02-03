package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

class CarpmaException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Iki sayida cok buyuk lutfen kucuk sayilar giriniz...");
    }
}


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a,b;

        System.out.println("Toplama icin 1'e\nCikarma icin 2'ye\nCarpma icin 3'e\nBolme icin 4'e basiniz\n");
        int islem = scanner.nextInt();

        try {

            switch (islem){
                case 1:
                    System.out.print("Birinci sayiyi giriniz:");
                    a=scanner.nextDouble();
                    System.out.print("ikinci sayiyi giriniz:");
                    b=scanner.nextDouble();
                    System.out.println("Toplamanin sonucu = "+(a+b));
                    break;
                case 2:
                    System.out.print("Birinci sayiyi giriniz:");
                    a=scanner.nextDouble();
                    System.out.print("ikinci sayiyi giriniz:");
                    b=scanner.nextDouble();
                    System.out.println("Cıkarmanin sonucu = "+(a-b));
                    break;
                case 3:
                    System.out.print("Birinci sayiyi giriniz:");
                    a=scanner.nextDouble();
                    System.out.print("ikinci sayiyi giriniz:");
                    b=scanner.nextDouble();
                    if (a>10000 && b>10000){
                        throw new CarpmaException();
                    }

                    System.out.println("Carpmanin sonucu = "+(a*b));
                    break;
                case 4:
                    System.out.print("Birinci sayiyi giriniz:");
                    a=scanner.nextDouble();
                    System.out.print("ikinci sayiyi giriniz:");
                    b=scanner.nextDouble();
                    System.out.println("Bolmenin sonucu = "+(a/b));
                    break;
                default:
                    System.out.println("Hatali islem...");
                    break;
            }

        }
        catch (ArithmeticException e){
            System.out.println("Bir sayi sifira bolunemez...");
        }
        catch (InputMismatchException e){
            System.out.println("Lutfen inputlari dogru formatta girin....");
        } catch (CarpmaException e) {
            e.printStackTrace();
        }


    }
}
