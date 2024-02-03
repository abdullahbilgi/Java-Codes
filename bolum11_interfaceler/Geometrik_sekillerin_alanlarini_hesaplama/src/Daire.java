public class Daire extends Sekil1{

    private int yaricap;

    public Daire(String isim,int yaricap){
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + " in alani " + (Math.PI*Math.pow(yaricap,2)));
    }
}
