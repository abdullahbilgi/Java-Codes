import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*

              Wrapper Class

        boolean -------------> Boolean
        char ------------->Character
        byte ------------->Byte
        short -------------> Short
        int -------------> Integer
        long -------------> Long
        float -------------> Float
        double -------------> Double    */


        ArrayList<String> arrayList = new ArrayList<String>();

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();//alttaki gibi olursa hata verir
        //ArrayList<int> arrayList2 = new ArrayList<int>();


       /* for (int i = 0; i < 10; i++) {
            arrayList1.add(Integer.valueOf(i*4));//Autoboxing
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i).intValue());//Unboxing
        }*/

        for (int i = 0; i < 10; i++) {
            arrayList1.add(i*4);//Integer.valueOf(i*4) java bunu kendisi yapıyor
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));//arrayList1.get(i).intValue() java bunu kendisi yapıyor
        }














    }
}
