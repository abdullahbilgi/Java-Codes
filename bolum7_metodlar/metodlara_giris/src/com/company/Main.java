package com.company;

public class Main {//metod overloding
    public static void skorhesapla(String isim,int puan){
        System.out.println(isim+" adli oyuncunun "+puan+" puani var.");
    }
    public static void skorhesapla(int puan){
        System.out.println("Isimsiz oyuncunun puanı "+puan+" puani var.");
    }
    public static void skorhesapla(String isim){
        System.out.println(isim+" adli oyuncunun hic puani yok.");
    }


    public static void main(String[] args) {
	// write your code here
        skorhesapla("Abdullah",1500);
        skorhesapla("Abdulah");
        skorhesapla(1500);
    }
}
