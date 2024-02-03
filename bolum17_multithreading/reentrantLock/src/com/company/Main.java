package com.company;


import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        ReentrantLockOrnegi re = new ReentrantLockOrnegi();

        Thread thread1  = new Thread(()-> {

                re.thread1Fonksiyonu();


        });
        Thread thread2  = new Thread(new Runnable() {
            @Override
            public void run() {
                re.thread2Fonksiyonu();

            }
        });

        Thread thread3  = new Thread(new Runnable() {
            @Override
            public void run() {
                re.thread3Fonksiyonu();

            }
        });
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        re.threadOver();


    }

}
