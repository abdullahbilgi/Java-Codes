package atm;

import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap){

        Login login=new Login();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Bankamiza hos geldiniz...");
        System.out.println("******************************************");
        System.out.println("Kullanici Girisi");
        System.out.println("******************************************");
        int giris_hakki=3;

        while (true){
            if (login.login(hesap)){
                System.out.println("Giris basarili...");
                break;
            }
            else {
                System.out.println("Giris Basarisiz...");
                giris_hakki-=1;
                System.out.println("Kalan Giris Hakki : "+giris_hakki);
            }
            if (giris_hakki==0){
                System.out.println("Giris Hakkiniz Bitti...");
                return;
            }
        }

        System.out.println("******************************************");
        System.out.println("1. Bakiye Goruntule\n2. Para Yatirma\n3. Para Cekme\nCıkıs icin q'ya basin");
        System.out.println("******************************************");

        while (true){
            System.out.print("İslemi Seciniz : ");
            String islem=scanner.nextLine();

            if (islem.equals("q"))
                break;
            else if (islem.equals("1"))
                System.out.println("Bakiyeniz : "+hesap.getBakiye());
            else if (islem.equals("2")){
                System.out.print("Yatirmak istediginiz tutar : ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.ParaYatir(tutar);
            }
            else if (islem.equals("3")){
                System.out.print("Cekmek istediginiz tutar : ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.ParaCek(tutar);
            }
            else
                System.out.println("Gecersiz islem....");
        }




    }


}
