import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListIteration {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        // Method 1: Using an Iterator (Recommended way)
        System.out.println("Using Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Method 2: Using a for-each loop (Simplified iteration)
        System.out.println("\nUsing for-each loop:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Method 3: Using a traditional for loop (Less efficient)
        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < linkedList.size(); i++) {
            String element = linkedList.get(i);  // get() can be slow for LinkedList
            System.out.println(element);
        }


        // Method 4: Using a while loop (Similar to iterator)
         System.out.println("\nUsing while loop:");
         int i = 0;
         while (i < linkedList.size()) { // Less efficient than iterator
             String element = linkedList.get(i); // get() is slow for LinkedList
             System.out.println(element);
             i++;
         }



    }
}
