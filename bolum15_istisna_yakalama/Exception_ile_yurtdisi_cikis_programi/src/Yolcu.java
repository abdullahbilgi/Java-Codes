import java.util.Scanner;

class SiyasiException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasaginiz bulunuyor");
    }
}

class VizeException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Vizeniz bulunmamaktadir...");
    }
}

class HarcException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Lutfen yurtdisi harcini tam yatirin...");
    }
}




public class Yolcu  {

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



    public void yurtdisiHarciKontrol() throws HarcException {

        if (this.harc < 15){
            throw new HarcException();

        }
        else {
            System.out.println("Yurtdisi harc islemi tamam !");

        }
    }


    public void siyasiYasakKontrol() throws SiyasiException {
        if (this.siyasiYasak == true){

            throw new SiyasiException();

        }
        else {
            System.out.println("Siyasi yasaginiz bulunmuyor....");

        }
    }


    public void vizeDurumKontrol() throws VizeException {
        if (this.vizeDurumu == true){

            System.out.println("Vize islemleri tamam...");

    }
        else {
            throw new VizeException();

        }
    }
}

