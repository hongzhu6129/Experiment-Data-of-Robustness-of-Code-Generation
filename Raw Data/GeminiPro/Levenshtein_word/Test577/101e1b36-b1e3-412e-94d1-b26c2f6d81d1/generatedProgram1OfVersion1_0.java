import java.util.LinkedList;
import java.util.Iterator;

public class IterateLinkedList {

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
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }


        // Method 3: Using a while loop with get() and size() [Less efficient]
        System.out.println("\nUsing while loop with get() and size():");
        int index = 0;
        while (index < linkedList.size()) {
            System.out.println(linkedList.get(index));
            index++;
        }
        
        // Method 4: Using a traditional for loop with get() and size()
        System.out.println("\nUsing traditional for loop with get() and size():");
        for(int i = 0; i < linkedList.size(); i++){
             System.out.println(linkedList.get(i));
        }




    }
}
