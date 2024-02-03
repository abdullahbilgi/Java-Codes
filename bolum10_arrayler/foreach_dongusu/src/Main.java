public class Main {
    public static void main(String[] args) {

       /* String[] array = {"elma","armut","kiraz"};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

        for (String a:array)//bir arrayi sirali olarak yazdirir.
            System.out.println(a);*/


        /*int[] array2={1,2,3,4,5,6,7};

        for (int a : array2)
            System.out.println(a);*/

        Deneme[] array3={new Deneme("Abdullah"),new Deneme("Bilgi")};

        for (Deneme a:array3)
            a.yaz();






    }
}
