package com.company;

public class Main {

    public static void main(String[] args) {

        IOgrenci ogrenci = new IOgrenci() {//anonim inner class ile interface lerde class a gerek kalmadan obje yaratma
            @Override
            public void ders_calis() {
                System.out.println("Ders calisiyorum...");
            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum...");
            }
        };

        ogrenci.ders_calis();
        ogrenci.derse_gir();


        System.out.println("**********************************************************");

        AOgrenci ogrenci2 = new AOgrenci("Abdullah Bilgi",314) {
            @Override
            void kayit_yaptir() {
                System.out.println("Kayit yapiliyor..." + "ısim : " + getIsim() + "Numara : " + getNumara());
            }
        };

        ogrenci2.kayit_yaptir();
        ogrenci2.selamla();



    }

    public interface IOgrenci{
        void ders_calis();
        void derse_gir();
    }

    public static abstract class AOgrenci{

        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }

        abstract void kayit_yaptir();

        public void selamla(){
            System.out.println("Selamlar...");
        }

    }


}
