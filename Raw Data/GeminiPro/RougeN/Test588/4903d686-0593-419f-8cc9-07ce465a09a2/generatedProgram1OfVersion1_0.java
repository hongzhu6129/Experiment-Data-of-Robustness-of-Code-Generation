import java.util.LinkedList;

public class RemoveFirstLastLinkedList {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grape");
        myList.add("Mango");

        System.out.println("Original LinkedList: " + myList);


        // Method 1: Using pollFirst() and pollLast() (Java 1.6+) - Recommended
        if (!myList.isEmpty()) { // Check if the list is empty before removing
            myList.pollFirst(); // Removes and returns the first element
            if (!myList.isEmpty()) { // Check again before removing the last, in case the list had only one element
                myList.pollLast();  // Removes and returns the last element
            }
        }


        System.out.println("LinkedList after removing first and last (Method 1): " + myList);



        // Reset the list for demonstrating Method 2
        myList.clear();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grape");
        myList.add("Mango");


        // Method 2: Using removeFirst() and removeLast() (Java 1.6+)
        // These methods throw NoSuchElementException if the list is empty.

        try {
            if (!myList.isEmpty()) {
                myList.removeFirst();
                if (!myList.isEmpty()) { // Important check to avoid exception if the list only had one element.
                    myList.removeLast();
                }
            }

        } catch (java.util.NoSuchElementException e) {
            System.out.println("Error: Cannot remove from an empty list.");
        }

        System.out.println("LinkedList after removing first and last (Method 2): " + myList);


        // Reset the list for demonstrating Method 3 (Suitable for older Java versions as well)
        myList.clear();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grape");
        myList.add("Mango");



        // Method 3: Using remove() with index (Handles edge cases more verbosely)
        if (myList.size() >= 1) {
            myList.remove(0); // Remove first
            if (myList.size() >= 1) { // Must check size again after potentially removing the only element
               myList.remove(myList.size() - 1); // Remove last (index adjusts after first removal)
            }
        }

        System.out.println("LinkedList after removing first and last (Method 3): " + myList);


       // Important notes and best practices:

        // Always check for empty list conditions before removing elements to avoid exceptions. 
        // pollFirst() and pollLast() are generally preferred because they handle empty lists gracefully by returning null.
        // removeFirst() and removeLast() throw exceptions if the list is empty.
        // When using remove() with index, double-check the size before removing the last element, as the index changes after the first removal.

    }
}
