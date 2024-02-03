package com.abdullahbilgi.thread2;

public class Printer implements Runnable{
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

        System.out.println(isim+ " Thread işini bitirdi...");
    }

    public Printer(String isim) {
        this.isim = isim;
    }
}
