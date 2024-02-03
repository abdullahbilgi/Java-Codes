public class KapsamSinifi {

    private int privateDegisken = 30;

    public KapsamSinifi() {
        System.out.println("perivateDegisken = "+ privateDegisken);
    }

    public void onileCarp(){

        int privateDegisken = 10;//Aynı isimde iki değişken varsa en lokal olanı kullanılır

        for (int i = 0; i < 6; i++) {
            System.out.println( i + " * "+privateDegisken + " = "+(i*privateDegisken));
            //this.privateDegisken yaparsak private değişkene erişmiş oluruz
        }

    }
}
