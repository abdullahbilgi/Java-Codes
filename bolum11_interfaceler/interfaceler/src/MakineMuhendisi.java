public class MakineMuhendisi implements IMuhandis,ICalisma{//bir class'a iki tane interface iplament edebiliriz

    @Override
    public void Calis() {
        System.out.println("Makine muhandisi calisiyor...");
    }

    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }


    @Override
    public void askerlik_durumu_sorgulama() {

        if (askerlik){
            System.out.println("Askerligimi Yaptim.");
        }
        else {
            System.out.println("Askerlik henuz yapmadim.");
        }

    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {

        return "Ortalamam : "+derece;
    }

    @Override
    public void adli_sicil_kaydi() {

        if (adli_sicil){
            System.out.println("Adli sicil kaydin bulunuyor.");
        }
        else {
            System.out.println("Herhangi bir adli sicil kaydin bulunmuyor.");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {

        if (array.length == 0){
            System.out.println("Herhangi bir is tecrubesi bulunmuyor...");
        }
        else {
            System.out.println("Makine Muhendisi olarak su sirketlerde calistim.");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

    }

    public void referans_getir(String[] array){

        if (array.length == 0){
            System.out.println("Herhangi bir is referans bulunmuyor...");
        }
        else {
            System.out.println("Referanslarım...");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }




}
