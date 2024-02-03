package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Ramazan Pidesi Uygulaması");

        Random random = new Random();

        Queue<String> queue = new LinkedList<>();

        queue.offer("Murat");
        queue.offer("Hasan");
        queue.offer("Okan");
        queue.offer("Ayse");
        queue.offer("Merve");
        queue.offer("Ezgi");
        queue.offer("Gizem");
        queue.offer("Mehmet");
        queue.offer("Oguz");
        queue.offer("Azer");

        int pide_sayisi = 1+random.nextInt(10);
        System.out.println("Pideler Cikiyor...");
        System.out.println("Cikan pide sayisi : "+pide_sayisi);
        Thread.sleep(3000);

        while (pide_sayisi!=0)
        {
            System.out.println(queue.poll() + " pideyi aldi...");
            pide_sayisi--;
            Thread.sleep(1000);
        }

        System.out.println("Pideler bitti...");











    }
}
