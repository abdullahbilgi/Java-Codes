package composition;

public class Kasa {

    private String model;
    private String uretici;
    private String malzeme;

    public Kasa(String model, String uretici, String malzeme) {
        this.model = model;
        this.uretici = uretici;
        this.malzeme = malzeme;
    }

    public void Bilgileri_goster(){
        System.out.println("Model : "+model);
        System.out.println("Uretici : "+uretici);
        System.out.println("Malzeme : "+malzeme);
    }

    public void bilgisayari_ac(){
        System.out.println("Bilgisayar aciliyor...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }
}
