package arrey;

import java.util.Scanner;

public class Main {

    public static void arrayi_bastir(int[] array){//1.

        for (int i=0;i<array.length;i++){
            System.out.println("Element "+(i+1)+" : "+array[i]);
        }

    }

    public static double ortalama_bul(int[] array){//2.

        int toplam=0;

        for (int i=0;i<array.length;i++){
            toplam+=array[i];
        }

        return ((double)toplam/array.length);

    }

    public static void main(String[] args) {

        //int[] a = new int[10];//10 dizilik yer olusturduk.
        //a[5]=32;
       // System.out.println(a[5]);


        //int[] a = {1,2,3,4,5,6,7,8,9,10};
        //System.out.println(a[2]);


        /*int[] a = new int[5];

        for (int i=0;i<5;i++){
            a[i]=i*4+2;
            System.out.println(a[i]);
        }

        for (int i=0;i<5;i++){
            System.out.println(a[i]);
        }*/


        /*int[] a = new int[5];

        Scanner input = new Scanner(System.in);

        for (int i=0;i<5;i++){
            System.out.print("Dizinin "+(i+1)+"'inci elemanini giriniz :");
            a[i]=input.nextInt();
        }

        for (int i=0;i<5;i++){
            System.out.println(a[i]);
        }*/


        //int[] d = {10,20,30,40,50,60};
        //System.out.println("Arreyimizin uzunlugu : "+d.length);//length arreyin uzunluugunu buluyor.


        int[] a = {10,20,30,40,50,60};// 1.  arrayi fonksiyona gönderme
        arrayi_bastir(a);


        int[] b = {10,20,30,40,50,60};//2.
        System.out.println("ortalama : "+ortalama_bul(b));










    }
}
