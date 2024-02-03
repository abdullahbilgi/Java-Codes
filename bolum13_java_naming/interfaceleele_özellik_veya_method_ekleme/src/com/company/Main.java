package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(IDeneme.a);
        //java bunun iterface olduğunu anlıyor ve obje oluşturulamadığını bildiği için isim üzerinden erişim sağlıyor

        System.out.println(IDeneme.deneme);

        System.out.println(IDeneme.c);

        IDeneme.deneme();

    }
}
