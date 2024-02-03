import java.util.ArrayList;

public class Main {

    public static void yazdir(ArrayList<String> a){

        for (int i = 0; i < a.size(); i++) {
            System.out.println("Element "+(i+1)+" : "+a.get(i));
        }

    }

    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<String>();

        arrayList.add("Metalica");//arraylist.add(" "); arraylist e eleman ekler
        arrayList.add("Guns'n Roses");
        arrayList.add("Black Sabbath");
        arrayList.add("Iron Maiden");
        arrayList.add("Metalica");

        //System.out.println(arrayList.get(0));//get(0) array'in ilk degeri
        //System.out.println(arrayList.get(3));
        //System.out.println(arrayList.get(6));//hata veriyor

        //System.out.println(arrayList.size());//arraylist.size() arraylistin boyunu verir.

        //arrayList.remove("Metalica");//isimli elemani siler
        //arrayList.remove(1);//1. indeksteki elemani siler

        //System.out.println(arrayList.indexOf("Metalica"));//baştan aranan kelimenin indeksini verir
        //System.out.println(arrayList.lastIndexOf("Metalica"));//sondan aranan kelimenin indeksini verir
        //System.out.println(arrayList.indexOf("Dream Theater"));//Listede olamayan birşey verince -1 döndürür

        //arrayList.set(4,"Megadeth");//array in 4. indeksini düzenler


         /*for (int i = 0; i < arrayList.size(); i++) {//arraylisti sirasi ile yadirma
            System.out.println(arrayList.get(i));

        }*/

        yazdir(arrayList);//fonksiyona arraylist göndermek


    }
}
