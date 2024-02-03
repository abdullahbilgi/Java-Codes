package com.company;

public class Main {

    public static void main(String[] args) {

       /*
        try {
            String s = null;

            System.out.println(s.hashCode());
        }
        catch (NullPointerException e){
            System.out.println("Null referans hatasi... ");
        }
        finally {//finally blogu mutlaka yapilacak seyler icin kullanilir
            System.out.println("Finally blogu calisiyor...");
        }

*/

        try {

            int a = 30/0;

        }
        catch (NullPointerException e){
            System.out.println("Null referans hatasi... ");
        }
        finally {//finally blogu mutlaka yapilacak seyler icin kullanilir
            System.out.println("Finally blogu calisiyor...");
        }

        System.out.println("bursi calisiyor");












    }
}
