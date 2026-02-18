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
            System.out.println(iterator.next());
        }

        // Method 2: Using a for-each loop (enhanced for loop)
        System.out.println("\nUsing for-each loop:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }


        // Method 3: Using a while loop with get() and size() (less common)
        System.out.println("\nUsing while loop with get() and size():");
        int index = 0;
        while (index < linkedList.size()) {
            System.out.println(linkedList.get(index));
            index++;
        }


        //Method 4: Using Java 8 Stream API (requires Java 8 or later).
        System.out.println("\nUsing Java 8 Stream API:");
        linkedList.forEach(System.out::println); // Or linkedList.stream().forEach(System.out::println);


       //Method 5: Using a traditional for loop with an index.
        System.out.println("\nUsing traditional for loop:");

        for(int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }



    }
}
