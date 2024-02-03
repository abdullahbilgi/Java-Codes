package idman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Idman programina hos geldiniz...");

        System.out.println("Gecerli Hareketler...\nBurpee\nPushup\nSitup\nSquat");
        System.out.println("Bir idman olusturun...");

        System.out.print("Burpee sayisi : ");
        int burpee=scanner.nextInt();
        System.out.print("Pushup sayisi : ");
        int pushup=scanner.nextInt();
        System.out.print("Situp sayisi : ");
        int situp=scanner.nextInt();
        System.out.print("Squat sayisi : ");
        int squat=scanner.nextInt();

        scanner.nextLine();

        idman idman=new idman(burpee,pushup,situp,squat);

        while (idman.idmanBttiMi()==false){

            System.out.print("Hareket Turu(Burpee,Pushup,Situp,Squat) : ");
            String tur=scanner.nextLine();
            System.out.println("Bu harekettekac tane yapacaksniz : ");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,sayi);
        }

        System.out.println("Idmani basari ile bitirdiniz....");





    }
}
