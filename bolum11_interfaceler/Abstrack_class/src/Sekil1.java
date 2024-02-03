public abstract class Sekil1 {

    private String isim;

    public Sekil1(String isim){
        this.isim = isim;
    }

    public void ismini_soyle(){
        System.out.println("Bu obje "+ isim + " objesidir.");
    }

    abstract void alan_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
