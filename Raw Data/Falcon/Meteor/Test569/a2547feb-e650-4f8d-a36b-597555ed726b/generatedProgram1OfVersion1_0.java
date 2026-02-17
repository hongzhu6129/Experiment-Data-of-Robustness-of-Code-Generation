import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class EmptySophisticatedList {

    public static void main(String[] args) {

        // Demonstrating with different List implementations:

        // 1. ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList before clearing: " + arrayList);
        arrayList.clear(); // Empties the ArrayList
        System.out.println("ArrayList after clearing: " + arrayList);


        // 2. LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("LinkedList before clearing: " + linkedList);
        linkedList.clear(); // Empties the LinkedList
        System.out.println("LinkedList after clearing: " + linkedList);


        // 3. Vector (synchronized List - a more "sophisticated" choice in some cases)
        List<Double> vector = new Vector<>();
        vector.add(1.1);
        vector.add(2.2);
        vector.add(3.3);


        System.out.println("Vector before clearing: " + vector);
        vector.clear(); // Empties the Vector
        System.out.println("Vector after clearing: " + vector);



        // You can also create your own custom List implementations and use the clear() method if it's defined according to the List interface contract.

    }
}
