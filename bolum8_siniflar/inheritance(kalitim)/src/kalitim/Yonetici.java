package kalitim;

public class Yonetici extends Calisan {//Subclass

    private int sorumlu_kisi;//ekstra özellik

    public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {

        super(isim, maas, departman);

        this.sorumlu_kisi=sorumlu_kisi;

    }

    public void zam_yap(int zam_niktari){
        System.out.println("Calisanlara "+zam_niktari+" tl zam yapildi.");
    }

    public void BilgileriGoster(){
        /*System.out.println("Isım : "+getIsim());
        System.out.println("Maas : "+getMaas());
        System.out.println("Departman : "+getDepartman());*/
        super.BilgileriGoster();

        System.out.println("Sorumlu kisi sayisi : "+this.sorumlu_kisi);
    }










}
