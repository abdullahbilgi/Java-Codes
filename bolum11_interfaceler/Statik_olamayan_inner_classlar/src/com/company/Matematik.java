package com.company;

import java.util.Scanner;

public class Matematik {


    private double PI = Math.PI;

        public class Factoriel {

            public void faktoriel() {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Bir sayi giriniz : ");
                int sayi = scanner.nextInt();
                scanner.nextLine();

                int fakt = 1;

                for (int i = 2; i <= sayi; i++) {
                    fakt *= i;
                }
                System.out.println("Faktoriyel : " + fakt);


            }
        }

        public class Asal{

            public boolean asal_mi(int sayi){

                int i = 2;

                while (i<sayi){

                    if (sayi%i == 0)
                        return false;

                    i++;
                }
                return true;


            }
        }


        public class Alan{

           public class DaireAlan{
               public void daire_alan(int yaricap){
                   System.out.println("Dairenin yaricapi : " + (yaricap*yaricap*PI));
               }
           }

        }









}
