package proje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calisanlar Programına Hosgeldiniz...");

        System.out.println("***************************************");
        System.out.println("Islemler...\n1. Yazilimci Islemleri\n2. Yonetici Islemleri\nCıkıs icin q'ya basin.");
        System.out.println("***************************************");

        while (true){
            System.out.print("Islemi seciniz : ");
            String islem=scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci=new Yazilimci("Abdullah","Bilgi","346","Java,C,Pyhthon");

                System.out.println("Yazilimci islemleri\n1. Format At\n2. Bilgileri Goster\nCikis icin q'ya basin");

                while (true) {
                    System.out.print("Islemi Seciniz :");
                    String y_islem=scanner.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yazilimci islemlerinden cikiliyor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.print("Isletim sistemini giriniz : ");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2")){
                        yazilimci.BilgileriGoster();
                    }
                    else
                        System.out.println("Gecersiz yazilimci islemi...");

                }


            }
            else if (islem.equals("2")){
                Yonetici yonetici=new Yonetici("Sehat","Say","123",10);

                System.out.print("Yonetici islemleri\n1. Zam yap\n2. Bilgileri Goster\nCikis icin q'ya basin ");

                while (true){
                    System.out.print("Islem seciniz : ");
                    String y_islem=scanner.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yonetici islemlerinden cikiliyor....");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.print("Yoneticiden ne kadar zam yapmasini istiyorsunuz : ");
                        int zam_miktari=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktari);
                    }
                    else if (y_islem.equals("2")){
                        yonetici.BilgileriGoster();
                    }
                    else
                        System.out.println("Gecersiz yonetici islemi...");
                }

            }
            else
                System.out.println("Gecersiz işlem");

        }

    }
}
