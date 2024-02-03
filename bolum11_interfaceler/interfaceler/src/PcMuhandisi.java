public class PcMuhandisi implements IMuhandis{

    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhandisi(boolean askerlik, boolean adli_sicil) {
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

        System.out.println("Bilgisayar Muhendisi Olaral Su Sirketlerde Calistim ...");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
