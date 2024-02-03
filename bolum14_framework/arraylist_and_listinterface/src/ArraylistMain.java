import java.util.ArrayList;
import java.util.List;

public class ArraylistMain {
    public static void main(String[] args) {

       // ArrayList<String> arrayList = new ArrayList<>();

        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("Pyhton");
        list.add("c++");

        System.out.println(list.get(0));
        //System.out.println(list.get(3));

        System.out.println("***************************************");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("***************************************");

        for (String s:list) {
            System.out.println(s);
        }





    }
}
