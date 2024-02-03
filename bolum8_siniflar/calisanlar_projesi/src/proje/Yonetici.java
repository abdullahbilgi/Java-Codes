package proje;

public class Yonetici extends Calisan{

    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, String id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();
        System.out.println("Yoneticinin sorumlu oldugu kisi sayisi : "+sorumlu_kisi_sayisi);
    }

    public void zamYap(int zamMiktari){
        System.out.println(getAd()+" calisanlara "+zamMiktari+" kadar zam yapiyor...");
    }




}
