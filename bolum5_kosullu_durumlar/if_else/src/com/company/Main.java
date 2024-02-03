package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz:");
        int sayi=scanner.nextInt();

        if(sayi<0){
            System.out.println("Sayi negatif...");
        }
        else if(sayi>0){
            System.out.println("Sayi pozitif...");
        }
        else
            System.out.println("Sayi 0 dir...");
    }
}
