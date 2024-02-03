package proje;

public class Yazilimci extends Calisan{

    private String diller;

    public Yazilimci(String ad, String soyad, String id,String diller) {
        super(ad, soyad, id);
        this.diller=diller;
    }

    public void formatAt(String isletim_sistemi){
        System.out.println(getAd()+ "" + isletim_sistemi + "'ni yukluyor...");

    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();
        System.out.println("Yazilimcinin Bildigi diller : "+diller);
    }
}
