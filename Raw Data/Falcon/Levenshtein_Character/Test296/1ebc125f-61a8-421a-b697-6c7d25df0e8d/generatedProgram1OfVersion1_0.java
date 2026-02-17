import java.util.LinkedList;

public class LinkedListPositions {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");

        // Display elements and their positions
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Element at position " + i + ": " + linkedList.get(i));
        }


        //Alternative using enhanced for loop with an index counter (less efficient but demonstrates another approach)
        System.out.println("\nAlternative approach using enhanced for loop (less efficient):");
        int index = 0;
        for (String element : linkedList) {
            System.out.println("Element at position " + index + ": " + element);
            index++;
        }



        // A further alternative using ListIterator - useful if you also need to modify the list while iterating.
        System.out.println("\nUsing a ListIterator:");
        java.util.ListIterator<String> iterator = linkedList.listIterator();
        while(iterator.hasNext()) {
            int currentIndex = iterator.nextIndex(); // Get the index *before* moving to the next element
            String currentElement = iterator.next();  // Move to the next element and retrieve its value
            System.out.println("Element at position " + currentIndex + ": " + currentElement);
        }

    }
}
