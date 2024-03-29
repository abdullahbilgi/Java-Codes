import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("YGS LYS Birincisi Bulma Programı...");
        Scanner scanner = new Scanner(System.in);

        String islemler = "Islemler ...\n" +
                "1. Eşit Ağırlık Ogrencileri Birincisi\n" +
                "2. Sayısal Ogrencileri Birincisi\n" +
                "Cikis icin q'ya basin";



        while (true){

            System.out.println("**********************************");
            System.out.println(islemler);
            System.out.println("**********************************");

            System.out.print("Islemi giriniz : ");
            String secim = scanner.nextLine();

            //Birinci öğrenci
            System.out.print("Birici Ogrencinin ismi : ");
            String isim1 = scanner.nextLine();
            System.out.print("Netler (Turkce Matematik Edebiyat Fizik) : ");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();

            //Ikınci öğrenci
            System.out.print("Ikınci Ogrencinin ismi : ");
            String isim2 = scanner.nextLine();
            System.out.print("Netler (Turkce Matematik Edebiyat Fizik) : ");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
            scanner.nextLine();


            //Ucuncu öğrenci
            System.out.print("ucuncu Ogrencinin ismi : ");
            String isim3 = scanner.nextLine();
            System.out.print("Netler (Turkce Matematik Edebiyat Fizik) : ");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();







            if (secim.equals("q")){
                System.out.println("Programdan Cikiliyor....");
                break;
            }
            else if (secim.equals("1")){

                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1,matematik1,edebiyat1,fizik1,isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2,matematik2,edebiyat2,fizik2,isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3,matematik3,edebiyat3,fizik3,isim3);

                EsitAgirlik birinci = birinci(ogrenci1,ogrenci2,ogrenci3);

                System.out.println("Birinci Esit Agirlik Ogrencisi : "+birinci.getIsim());
                System.out.println("Ogrenci puanı : "+birinci.puanHesapla());

            }
            else if (secim.equals("2")){

                Sayisal ogrenci1 = new Sayisal(turkce1,matematik1,edebiyat1,fizik1,isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2,matematik2,edebiyat2,fizik2,isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3,matematik3,edebiyat3,fizik3,isim3);

                Sayisal birinci = birinci(ogrenci1,ogrenci2,ogrenci3);

                System.out.println("Birinci Esit Agirlik Ogrencisi : "+birinci.getIsim());
                System.out.println("Ogrenci puanı : "+birinci.puanHesapla());

            }
            else {
                System.out.println("Gecersiz islem...");
            }

        }
    }
    //generic methods
    public static <E extends Aday> E birinci(E e1,E e2,E e3){// <E extends Aday> E çok genel değil sadece adaydan kullamılan objeler için

        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()){
            return e1;
        }
        else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()){
            return e2;
        }
        else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()){
            return e3;
        }

        else {
            return null;
        }


    }






}
