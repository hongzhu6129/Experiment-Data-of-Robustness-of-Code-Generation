import java.util.LinkedList;

public class LinkedListPositions {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        // Display elements and their positions
        for (int i = 0; i < linkedList.size(); i++) {
            String element = linkedList.get(i);
            System.out.println("Element at position " + i + ": " + element);
        }


        //Alternative using a for-each loop and keeping track of the index manually:

         System.out.println("\n---Alternative using for-each loop---");

         int index = 0;
         for (String element : linkedList) {
            System.out.println("Element at position " + index + ": " + element);
             index++;
        }
    }
}
