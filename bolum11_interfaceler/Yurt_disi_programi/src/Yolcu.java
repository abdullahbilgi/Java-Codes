import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner input = new Scanner(System.in);

        System.out.print("Yatirdiginiz harc bedeli : ");
        this.harc=input.nextInt();
        input.nextLine();

        System.out.print("Herhangi bir siyasi yasaginiz var mi (evet yada hayir) : ");
        String cevap = input.nextLine();

        if (cevap.equals("evet")){
            this.siyasiYasak = true;}
        else{
            this.siyasiYasak = false;}

        System.out.print("Vizeniz var mi (evet yada hayir) : ");
        String cevap2 = input.nextLine();

        if (cevap2.equals("evet")){
            this.vizeDurumu = true;}
        else{
            this.vizeDurumu = false;}


    }


    @Override
    public boolean yurtdisiHarciKontrol() {

        if (this.harc < 15){
            System.out.println("Lutfen yurtdisi cikis harcini tam yatirin....");
            return false;
        }
        else {
            System.out.println("Yurtdisi harc islemi tamam !");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true){
            System.out.println("Siyasi yasginiz bulunuyor.Yurtdisina cikamazsiniz...");
            return false;
        }
        else {
            System.out.println("Siyasi yasaginiz bulunmuyor....");
            return true;
        }
    }

    @Override
    public boolean vizeDurumKontrol() {
        if (this.vizeDurumu == true){
            System.out.println("Vize islemleri tamam !");
            return true;
    }
        else {
            System.out.println("Vizeniz gideceginiz ulkeye bulunmamaktadir...");
            return false;
        }
    }
}

