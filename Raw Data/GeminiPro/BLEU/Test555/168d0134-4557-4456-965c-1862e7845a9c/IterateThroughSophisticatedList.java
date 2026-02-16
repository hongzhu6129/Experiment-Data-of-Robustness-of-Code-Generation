import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class IterateThroughSophisticatedList {

    public static void main(String[] args) {

        // Example 1: ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("Iterating through ArrayList:");
        // Method 1: Using a for loop with get()
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // Method 2: Using an enhanced for loop (for-each loop)
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Method 3: Using an Iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // Example 2: LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);


        System.out.println("\nIterating through LinkedList:");
        // Methods are the same as ArrayList (for loop, enhanced for loop, iterator)
        for (int num : linkedList) {  // Example using enhanced for loop
            System.out.println(num);
        }


        // Example 3: Vector (Thread-safe ArrayList)
        List<Double> vector = new Vector<>();
        vector.add(1.1);
        vector.add(2.2);
        vector.add(3.3);

        System.out.println("\nIterating through Vector:");
        // Methods are the same as ArrayList and LinkedList
        Iterator<Double> vectorIterator = vector.iterator(); // Example using Iterator
        while (vectorIterator.hasNext()) {
            System.out.println(vectorIterator.next());
        }



        // Example 4:  Custom List Implementation (if needed)
        // If you have your own custom list implementation, you would typically provide 
        // an iterator() method that returns an Iterator<YourElementType> to allow easy traversal.

    }
}
