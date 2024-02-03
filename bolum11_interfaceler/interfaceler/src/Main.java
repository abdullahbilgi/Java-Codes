public class Main {

    public static void main(String[] args) {

        /*IMuhandis iMuhandis = new IMuhandis();*/   //interfaceler den obje olusturulmaz

        PcMuhandisi muhandis1 = new PcMuhandisi(false,false);

       /* muhandis1.adli_sicil_kaydi();
        muhandis1.askerlik_durumu_sorgulama();
        muhandis1.mezuniyet_ortalamasi(3.07);

        String[] tecrube = {"Vestel","Havelsan","Turksat"};

        muhandis1.is_tecrubesi(tecrube);*/

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);

        String[] tecrube = {};
        String[] referans = {"Mustafa Murat","Serhat Say"};
        muhendis2.adli_sicil_kaydi();
        muhendis2.askerlik_durumu_sorgulama();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.Calis();





    }
}
