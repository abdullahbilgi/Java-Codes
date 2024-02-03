package com.company;

public class Main {

    public static void main(String[] args) {

        String a = "Abdullah";

        String b = new String("Abdullah");

        //System.out.println(b);

        //System.out.println("Harf Sayisi : "+b.length());//b.lenght() stringi 'in boyunu verir

        //System.out.println("0. Indeksi : "+ b.charAt(0));//b.charAt() stringi 'in kacinci indeksini istiyorsak onu verir
        //System.out.println("2. Indeksi : "+ b.charAt(2));
        //System.out.println("son. Indeksi : "+ b.charAt(b.length()-1));

        /*for (int i = 0; i < b.length() ;i++) {//Stringi tek tek bastirir
            System.out.print(b.charAt(i));
        }*/

        //System.out.println(b.startsWith("Ab"));//Ab ile basliyorsa true baslamiyorsa false dondurur
        //System.out.println(b.endsWith("dh"));//ah ile bitiyorsa true bitmiyorsa false dondurur

        //System.out.println(b.indexOf("b"));//aradigimiz harfin bastan itibaren kacinci indekste oldugunu gosteriri
        //System.out.println(b.lastIndexOf("a"));//sondan itibaren aranan harfin kacinci indekste olduguu gosterir
        //System.out.println(b.indexOf("c"));//b stringinin icinde yoksa -1 degerini dondurur

        //System.out.println(b.toLowerCase());//b stringdeki tum harfleri kucuk yapıyor
        //System.out.println(b.toUpperCase());//b stringdeki tum harfleri buyuk yapıyor

        String c = "1923";

        int d = Integer.parseInt(c);

        //System.out.println(d);//Stringi integer a cevirmek

        int e = 1923;

        String f = String.valueOf(e);

        //System.out.println(f);//Integer ı string yapti













    }
}
