import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArralistLinkedlistMain {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        zamanhesapla("arrayList",arrayList);
        zamanhesapla("linkedlist",linkedList);




    }
    public static  void zamanhesapla(String veri_tipi, List<Integer> list)
    {
        //list in sonun adeger ekleme

        long baslangic;
        long bitis;

        baslangic = System.currentTimeMillis();

        for (int i = 0; i <1000000 ; i++) {
            list.add(i);
        }
        bitis = System.currentTimeMillis();

        System.out.println(veri_tipi+" ekleme süresi " + (bitis-baslangic)+ " ms" );

    }

}
