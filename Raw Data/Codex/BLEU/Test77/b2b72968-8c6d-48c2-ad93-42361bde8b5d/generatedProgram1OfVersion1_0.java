import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {

        // Create a LinkedList of Strings
        LinkedList<String> myList = new LinkedList<>();

        // Inserting at the beginning (head) of the list
        myList.addFirst("Apple"); // Inserts "Apple" at the beginning
        myList.addFirst("Banana"); // Inserts "Banana" before "Apple"
        myList.push("Orange");    // Another way to insert at the beginning (same as addFirst)


        // Inserting at the end (tail) of the list
        myList.addLast("Grape");  // Inserts "Grape" at the end
        myList.add("Mango");     // Another way to insert at the end (same as addLast)


        // Print the updated LinkedList
        System.out.println("Linked List after insertions: " + myList);



        // Example to show how elements are ordered:
        System.out.println("\nIterating and accessing elements:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i)); 
        }

         // Demonstrate removing elements:
        String removedFirst = myList.removeFirst(); // Removes and returns the first element
        String removedLast = myList.removeLast(); // Removes and returns the last element
        System.out.println("\nLinked List after removing first and last: " + myList);
        System.out.println("Removed first: " + removedFirst);
        System.out.println("Removed last: " + removedLast);



    }
}
