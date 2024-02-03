import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void islemleri_bastir(){

        System.out.println("0 - Islemleri Goruntule...");
        System.out.println("1 - Bir sonraki sehre git...");
        System.out.println("2 - Bir onceki sehre git...");
        System.out.println("3 - Uygulamadan Cik");

    }



    public static void sehirleri_turla(LinkedList<String> sehirler){

        ListIterator<String> iterator = sehirler.listIterator();

        int islem;

        islemleri_bastir();

        Scanner input = new Scanner(System.in);

        if (!iterator.hasNext()){
            System.out.println("Herhangi bir sehir bulunamiyor...");
        }

        boolean cikis = false;
        boolean ileri = true;

        while (!cikis){

            System.out.print("Bir islem seciniz : ");

            islem = input.nextInt();

            switch (islem){

                case 0:
                    islemleri_bastir();
                    break;
                case 1:

                    if (!ileri){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                       ileri=true;
                    }

                    if (iterator.hasNext()){
                        System.out.println("Sehre gidiliyor : "+iterator.next());
                    }
                    else {
                        System.out.println("Gidilecek sehir kalmadi...");
                        ileri=false;
                    }
                    break;
                case 2:

                    if (ileri){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                       ileri=false;
                    }

                    if (iterator.hasPrevious()){
                        System.out.println("Sehre gidiliyor : "+iterator.previous());
                    }
                    else{
                        System.out.println("Sehir Turu Basladi...");
                        ileri=true;
                    }
                    break;
                case 3:
                    cikis=true;
                    System.out.println("Uygulamadan cikiliyor...");
                    break;
            }
        }




    }




    public static void main(String[] args) {

        LinkedList<String> sehirler = new LinkedList<String>();

        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");

        sehirleri_turla(sehirler);



    }
}
