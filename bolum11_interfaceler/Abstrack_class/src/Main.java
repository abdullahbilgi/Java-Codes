public class Main {

    public static void main(String[] args) {

        //Sekil1 sekil1 = new Sekil1();//abstract class lardan obje olusturulmaz

        Kare kare1 = new Kare("Kare1",5);
        Daire daire1 = new Daire("Daire1",3);

        kare1.alan_hesapla();
        daire1.alan_hesapla();

        kare1.cevre_hesapla();
        daire1.cevre_hesapla();

        kare1.ismini_soyle();
        daire1.ismini_soyle();





    }
}
