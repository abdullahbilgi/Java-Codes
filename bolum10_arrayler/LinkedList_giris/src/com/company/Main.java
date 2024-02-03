package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> diller = new ArrayList<String>();

        diller.add("Java");
        diller.add("Php");
        diller.add("Pyhton");
        diller.add("Kotlin");
        diller.add("C#");

       /* for (int i = 0; i < diller.size(); i++) {
            System.out.println(diller.get(i));
        }*/

        for (String a:diller) {//foreach ile yazdirma
            System.out.println(a);
        }

        System.out.println("-------------------------------------------");

        diller.add(1,"C++");//sirasi belli olan bir listede istedigimiz indekse eleman ekleyebiliyoruz


        for (String a:diller) {//foreach ile yazdirma
            System.out.println(a);
        }






    }
}
