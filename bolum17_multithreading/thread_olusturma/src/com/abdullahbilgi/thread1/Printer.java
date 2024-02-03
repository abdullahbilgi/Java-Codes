package com.abdullahbilgi.thread1;

public class Printer extends Thread{

    private String isim;

    @Override
    public void run() {
        System.out.println(isim+ "Çalışıyor...");

        for (int i = 1 ; i < 10; i++) {
            System.out.println(isim+ " Yazıyyor : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread işini bitirdi...");
    }

    public Printer(String isim) {
        this.isim = isim;
    }
}
