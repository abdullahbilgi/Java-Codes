import java.util.*;

public class Mapmain {
    public static void mapyazdir(Map<Integer,String> map)
    {
        map.put(10,"C++");
        map.put(5,"Java");
        map.put(1,"Python");
        map.put(2,"Php");
        map.put(100,"C");

        /*for(Map.Entry<Integer,String> entry: map.entrySet())
        {
            System.out.println("Key : "+ entry.getKey()+" Value : "+entry.getValue());
        }*/

        /*for(Integer key : map.keySet())//farli yazdirma
        {
            System.out.println("Key : "+key + " Value : "+ map.get(key));
        }*/



        Collection<String> values = map.values();//degerleri yazdirmak icin

        for (String s : values)
        {
            System.out.println("Deger: "+s);
        }



    }
    public static void main(String[] args) {




        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> linkedhashmap = new LinkedHashMap<>();
        Map<Integer,String> treemap = new TreeMap<>();

        System.out.println("*********************************");
        mapyazdir(hashMap);
        System.out.println("*********************************");
        mapyazdir(linkedhashmap);
        System.out.println("*********************************");
        mapyazdir(treemap);













    }
}
