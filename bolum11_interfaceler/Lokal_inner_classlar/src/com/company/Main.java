package com.company;

public class Main {

    public static void main(String[] args) {


        class Alan{//Lokal inner class larin basinda erisim belirleyiciler kullanilmaz

            public void daire_alan(int yaricap){
                System.out.println("Dairenin alani : " + (yaricap*yaricap*Math.PI));
            }
        }


        Alan alan = new Alan();
        Alan alan2 = new Alan();

        alan.daire_alan(10);

        alan2.daire_alan(3);

    }

    public static void deneme(){

        Alan alan = new Alan();//lokal inner calsslar kullanildigi metoda ozgudur.
    }




}
