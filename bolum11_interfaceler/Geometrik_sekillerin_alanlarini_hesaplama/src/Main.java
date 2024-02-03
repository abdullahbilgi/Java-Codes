import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String islemler = "Islemler...\n"+
                          "1. Kare Alan Hesapla\n"+
                          "2. Ucgen Alan Hesapla\n"+
                          "3. Daire Alan Hesapla\n"+
                          "Cikis icin q'ya basin";

        while (true){
            System.out.println(islemler);
            System.out.print("Hangi Seklin Alanini Hesaplamak Istıyorsunuz : ");
            String sekil_turu = input.nextLine();

            Sekil1 sekil1 = null;

            if (sekil_turu.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }

            else if (sekil_turu.equals("1")){
                System.out.print("Karenin Kenari : ");
                int kenar = input.nextInt();
                input.nextLine();

                sekil1 = new Kare("Kare1",kenar);
                sekil1.alanHesapla();

            }

            else if (sekil_turu.equals("2")){
                System.out.print("Kenar1 : ");
                int kenar1 = input.nextInt();
                System.out.print("Kenar2 : ");
                int kenar2 = input.nextInt();
                System.out.print("Kenar3 : ");
                int kenar3 = input.nextInt();

                input.nextLine();

                sekil1 = new Ucgen("Ucgen1",kenar1,kenar2,kenar3);
                sekil1.alanHesapla();
            }

            else if (sekil_turu.equals("3")){
                System.out.print("Dairenin yaricapini giriniz : ");
                int yaricap = input.nextInt();
                input.nextLine();

                sekil1 = new Daire("Daire1",yaricap);
                sekil1.alanHesapla();
            }

            else {
                System.out.println("Gecersiz Islem !");
            }




        }



    }
}
