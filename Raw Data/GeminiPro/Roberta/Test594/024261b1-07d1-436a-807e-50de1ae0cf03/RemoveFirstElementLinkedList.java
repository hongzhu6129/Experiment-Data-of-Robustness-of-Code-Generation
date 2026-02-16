import java.util.LinkedList;

public class RemoveFirstElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of strings (names)
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("Original LinkedList: " + names);

        // Remove and return the first element
        String removedElement = removeFirst(names);


        if (removedElement != null) {
            System.out.println("Removed element: " + removedElement);
            System.out.println("Updated LinkedList: " + names);
        } else {
            System.out.println("The LinkedList is empty.");
        }

         // Example with an empty list:
        LinkedList<String> emptyList = new LinkedList<>();
        String removedFromEmpty = removeFirst(emptyList);

        if (removedFromEmpty == null) {
             System.out.println("Correctly returned null for an empty list.");
        } 
        
    }


    // Helper method to remove and return the first element (mimicking a method outside main)
    private static String removeFirst(LinkedList<String> list) {  // Simulates a separate function
        if (list.isEmpty()) {
            return null; // Or throw an exception if appropriate for your use case
        } else {
            return list.removeFirst(); // LinkedList's built-in method for removing the first element
        }
    }
}
