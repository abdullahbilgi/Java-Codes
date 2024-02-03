public class Main {
    public static void main(String[] args) throws InterruptedException {

        String sartlar = "Yurtdisi Cikis Kurallari...\n"+
                         "Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor...\n"+
                         "15 TL harc bedelinizi tam olarak yatirmaniz gerekiyor...\n"+
                         "Gideceginiz ulkeye vizenizin bulunmasi gerekiyor...";
        String massage = "Yurtdisi sartlarinin hepsini saglamaniz gerekiyor";


        while (true){

            System.out.println("****************************************************");
            System.out.println(sartlar);
            System.out.println("****************************************************");


            Yolcu yolcu = new Yolcu();

            System.out.println("Harc Bedeli Kontrol Ediliyor...");

            Thread.sleep(3000);

            try {
                yolcu.yurtdisiHarciKontrol();
            } catch (HarcException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("Siyasi Yasak Kontrol Ediliyor...");

            Thread.sleep(3000);

            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("Vize Durumu Kontrol Ediliyor...");

            Thread.sleep(3000);

            try {
                yolcu.vizeDurumKontrol();
            } catch (VizeException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("ıslemleriniz Tamam ! Yurtdisina Cikailirsiniz....");

            break;



        }



    }
}
