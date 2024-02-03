package Beyblade;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Beyblade Programina Hosgeldiniz...");
        System.out.println("Cikis icin q'ya basiniz...");

        Scanner input=new Scanner(System.in);

        while (true){
            System.out.print("Hangi Beyblade'i uretmek istiyorsunuz ? ");
            String islem =input.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();

                Beyblade beyblade = fabrika.beybladeUret(islem);

                if (beyblade == null){
                    System.out.println("Lutfen gecerli bir beyblade ismi girin...");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCıkar();
                }
            }
        }












    }
}
