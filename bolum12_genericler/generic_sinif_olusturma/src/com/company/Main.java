package com.company;

public class Main {

    public static void main(String[] args) {// Generic sınıfı yazdırsınıfıdır

        Character [] char_dizi= {'J','A','V','A'};

        Integer [] int_dizi = {1,2,3,4,5,6};

        String [] string_dizi = {"Java","Python","C++","Php"};

        Ogrenci [] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Merve")};


        /*CharYazdir.yazdir(char_dizi);  //genericsiz yazdırınca
        System.out.println("********************************");
        IntegerYazdir.yazdir(int_dizi);
        System.out.println("********************************");
        StringYadir.yazdir(string_dizi);
        System.out.println("********************************");
        OgrenciYazdir.yazdir(ogrenci_dizi);*/


        //Generic kullanarak yazdırma
        YazdirSinifi<Character> yazdir_char = new YazdirSinifi<Character>();
        YazdirSinifi<Integer> yazdir_int = new YazdirSinifi<Integer>();
        YazdirSinifi<String> yazdir_string= new YazdirSinifi<String>();
        YazdirSinifi<Ogrenci> yazdir_ogrenci = new YazdirSinifi<Ogrenci>();

        yazdir_char.yazdir(char_dizi);
        System.out.println("********************************");
        yazdir_int.yazdir(int_dizi);
        System.out.println("********************************");
        yazdir_string.yazdir(string_dizi);
        System.out.println("********************************");
        yazdir_ogrenci.yazdir(ogrenci_dizi);








    }
}
