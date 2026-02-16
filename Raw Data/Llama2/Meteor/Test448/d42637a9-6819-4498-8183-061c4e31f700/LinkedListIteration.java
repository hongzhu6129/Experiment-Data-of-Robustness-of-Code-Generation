import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListIteration {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        // Method 1: Using an Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Method 2: Using a for-each loop (enhanced for loop)
        System.out.println("\nUsing for-each loop:");
        for (String element : linkedList) {
            System.out.println(element);
        }


        // Method 3: Using a while loop and get() method with index.  Less efficient.
        System.out.println("\nUsing while loop and get():");
        int index = 0;
        while (index < linkedList.size()) {
            System.out.println(linkedList.get(index));
            index++;
        }

        // Method 4: Using a traditional for loop and get() method with index. Less efficient.
        System.out.println("\nUsing traditional for loop and get():");
        for(int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

    }
}
