package composition;

public class Test {
    public static void main(String[] args) {

        Resolution resolution = new Resolution(1920,1080);

        Monitor monitor = new Monitor("VS1920DE","ASUS","18.5",resolution);

        Kasa kasa = new Kasa("Shadow Blade","Shadow","Temperli Cam");

        Anakart anakart = new Anakart("8250-PRO","Asus",10,"Windows 10");


        Bilgisayar pc = new Bilgisayar(monitor,kasa,anakart);

        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitor_kapat();
        pc.getAnakart().isletim_sistemi_yule("Ubuntu 16.04");
        pc.getKasa().Bilgileri_goster();


    }
}
