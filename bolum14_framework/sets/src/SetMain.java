import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {

        /*
    Set Interface ----> HashSet,LinkedHashSet, TreeSet

    Set Interface ile List Interface’in farkı
    List interface’i implemente eden classlar bir elementten birden fazla depolayabilirken,
    Set interface’i implemente eden classlar bir elementten sadece bir tane depolarlar.

    HashSet Sınıfı

    HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

    1.HashSet elementleri "hashing" yani hash table  mekanizmasına uygun bir biçimde depolarlar
    (Her element belli bir key'e göre depolanır.)

    2.HashSet bir element'i sadece bir defa depolar.(Set Interface)

    3. Elementlerin ekleme sırasına göre depolamaz.

    LinkedHashSet Sınıfı

    LinkedHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

    1. LinkedHashSet hem HashTable hem de Set Interface'in LinkedList implementasyonu gibi davranır.

    2. HashSette olduğu gibi bir elementi sadece bir defa depolar.(Set Interface)

    3. Elementleri ekleme sırasına göre depolar.


    TreeSet Sınıfı

    TreeSet sınıfı NavigableSet inteface'ini implemente eder ve AbstractSet sınıfından miras alır.
    NavigableSet interface'i de SortedSet interfaceinden miras alır.

    1. Elementleri depolamak için Tree yani Ağaç yapısını kullanır.

    2. Elementleri alfabetik olarak sıralarlar.



    HashSet vs LinkedHashSet vs TreeSet

    HashSet, Hash Table mekanizmasını uyguladığı için elementler sıralı değildir. Ekleme,Çıkarma ve
    Arama metodları sabit zamanda( Time Complexity : O(1) ) çalışır.

    TreeSet, elementleri tree yapısına yani ağaç yapısına uygun depolar. Ekleme,Çıkarma ve
    Arama metodları O(log(n)) complexitysi ile çalışır.

    LinkedHashSet sınıfı hashtable ile linked list yapısını kullanarak elementleri depolar.Bu yüzden,
    elemetler ekleme sırasına göre depolanır. Ekleme,Çıkarma ve Arama metodları
    sabit zamanda( Time Complexity : O(1) ) çalışır.



    */

    /*    Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        set1.add("Java");
        set1.add("python");
        set1.add("C++");
        set1.add("Javascript");
        set1.add("php");

        set2.add("java");
        set2.add("python");
        set2.add("C++");
        set2.add("Javascript");
        set2.add("php");

        set3.add("java");
        set3.add("python");
        set3.add("C++");
        set3.add("Javascript");
        set3.add("php");

        set3.add("php");

       System.out.println("hashset*****************************************");

        for (String s:set1) {
            System.out.println(s);
        }

        System.out.println("LinkedHashSet*****************************************");

        for (String s:set2) {
            System.out.println(s);
        }

        System.out.println("TreeSet*****************************************");

        for (String s:set3) {
            System.out.println(s);
        }

        System.out.println(set1.contains("Go"));
        System.out.println(set1.contains("Java"));

        System.out.println(set1.isEmpty());

        set1.remove("Java");*/



        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Java");
        set1.add("python");
        set1.add("C++");
        set1.add("Javascript");
        set1.add("php");

        set2.add("Go");
        set2.add("Java");
        set2.add("CSS");

        Set<String> fark = new HashSet<>(set2);//fark bulma

        System.out.println(fark.removeAll(set1));
        System.out.println(fark);


        System.out.println("********************************");

        Set<String> kesisim = new HashSet<>(set2);//kesisim bulma

        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);















    }
}
