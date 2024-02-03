package com.company;

public interface IDeneme {

    //böyle kullanılacağımız zaman public,static,final yazmaya gerek yok java bunu anlayıp kendisi hallediyor

    public int a = 4; //private kullanılamıyor

    //public int b;
    //interfacelerde setter ve getter yoktur o yüzden böyle kullanılamaz

    public static String deneme = "dememe";

    //public final int c;
    // interfacelerde consructer olmadığı için böyle kullanılamaz


    public final int c = 6;


    //interfacelere gövdeli method yazmak istiyorsak static kullanmamız gerekiyor
    public static void deneme(){
        System.out.println("Deneme");
    }





}
