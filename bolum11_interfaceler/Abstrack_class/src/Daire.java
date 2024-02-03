public class Daire extends Sekil1{

    private int yaricap;

    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void alan_hesapla() {

        System.out.println(getIsim() + " alani " + (Math.PI*yaricap*yaricap));

    }

    public void cevre_hesapla(){
        System.out.println("Dairenin cevresi : "+(2*Math.PI*yaricap));
    }
}
