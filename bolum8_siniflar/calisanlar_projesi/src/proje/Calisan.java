package proje;

public class Calisan {

    private String Ad;
    private String Soyad;
    private String id;

    public Calisan(String ad, String soyad, String id) {
        Ad = ad;
        Soyad = soyad;
        this.id = id;
    }

    public void BilgileriGoster(){
        System.out.println("Calisan Bilgileri...");
        System.out.println("Ad : "+Ad);
        System.out.println("Soyad : "+Soyad);
        System.out.println("Id : "+id);
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
