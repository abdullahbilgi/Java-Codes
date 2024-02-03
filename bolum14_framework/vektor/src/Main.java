import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("Java");
        vector.add("Python");
        vector.add("Java");
        vector.add("Php");

        /*for (String s:vector) {
            System.out.println(s);
        }*/

        ListIterator<String> iterator = vector.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("İlk eleman : " + vector.firstElement());
        System.out.println("İlk eleman : " + vector.lastElement());


        System.out.println("******************************************************");

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");

        /*for (String s:stack) {
            System.out.println(s);
        }*/

        Enumeration<String> enumeration = stack.elements();

        while (enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }


        System.out.println(stack.peek());
        System.out.println("********************************");
        System.out.println("Son eleman cikariliyor : " + stack.pop());

        for (String s:stack) {
            System.out.println(s);
        }

        System.out.println("********************************");

        while (!stack.empty())
        {
            System.out.println("Eleman cikariliyor : " + stack.pop());
        }

        System.out.println(stack.empty());







    }
}
