package com.abdullahbilgi.paket1;

import com.abdullahbilgi.paket2.AdayOgrenci;

public class Ogrenci implements AdayOgrenci {//Farklı paketlerden interfaceleri kullanmak için o paketleri dahil etmemiz gerekiyor
    @Override
    public void dersCalis() {
        System.out.println("Ders calisiyorum...");
    }
}
