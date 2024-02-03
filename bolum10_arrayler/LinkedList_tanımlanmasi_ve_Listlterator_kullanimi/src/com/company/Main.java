package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler){

        /*for (String a:gidilecek_yerler) {
            System.out.println(a);
        }*/

        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while (iterator.hasNext()){//hasNext() sonraki referansin null olup olmadigini kontrol ediyor
            System.out.println(iterator.next());//.next() sonraki elemana geciyor
        }
    }

    public static void sirali_ekleme(LinkedList<String> gidilecek_yerler,String yeni){

        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while (iterator.hasNext()){

            int karsilastir = iterator.next().compareTo(yeni);

            if (karsilastir == 0){//iki deger esit ise
                System.out.println("Listenizde bu eleman zaten var...");
                return;
            }
            else if (karsilastir < 0){//yeni deger iterator.next den daha büyükse

            }
            else if (karsilastir > 0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }


        }

        iterator.add(yeni);



    }





    public static void main(String[] args) {

        LinkedList<String> gidilecek_yerler = new LinkedList<String>();

        sirali_ekleme(gidilecek_yerler,"Postane");
        sirali_ekleme(gidilecek_yerler,"Market");
        sirali_ekleme(gidilecek_yerler,"Ev");




        /*gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kutuphane");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");*/

        //listeyi_bastir(gidilecek_yerler);

        //System.out.println("---------------------------------------------");

        //gidilecek_yerler.add(1,"Alisveris Merkezi");//1. indekse alisveris merkezini ekliiyor
        //gidilecek_yerler.remove(3);//3. indeksdeki elemani kaldiriyor


        //listeyi_bastir(gidilecek_yerler);


        listeyi_bastir(gidilecek_yerler);













    }
}
