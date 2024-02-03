package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] arreyi_doldur(int sayi){//1.

        Scanner input = new Scanner(System.in);
        int[] cikti = new int[sayi];

        for (int i=0;i<sayi;i++){
            cikti[i]=input.nextInt();
        }
        return cikti;
    }

    public static void arrayi_bastir(int[] array){//2.

        for (int i=0;i<array.length;i++){
            System.out.println("Element "+(i+1)+" : "+array[i]);

        }
    }

    public static void array_sort(int[] array){//3.

        Arrays.sort(array);//icine bir dizi alarak siralama yapar.
        arrayi_bastir(array);
    }

    public static void main(String[] args) {

        //int[] a = arreyi_doldur(5);// 1. ve 2.
        //arrayi_bastir(a);// 1. ve 2.

        //array_sort(a);//1. ve 3. kullan

        int[] a1 = {1,2,3,4,5};
        int[] a2= {1,2,3,4,5};

        if (Arrays.equals(a1,a2))//if(a1==a2) olsaydi esit degiller yazardi.//Arrays.equals(a1,a2) arraylerin icerigini kontrol ediyor
            System.out.println("Esitler");
        else
            System.out.println("Esit degiller");

        









    }
}
