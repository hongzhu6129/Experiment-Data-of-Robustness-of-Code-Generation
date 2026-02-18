import java.util.LinkedList;

public class RemoveFirstLinkedList {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Date");


        System.out.println("Original LinkedList: " + myList);

        // Remove and return the first element (demonstrating different scenarios)

        if (!myList.isEmpty()) {
            String removedElement = myList.removeFirst();  // Or myList.remove(); since remove() removes the head by default
            System.out.println("Removed element: " + removedElement);
            System.out.println("LinkedList after removal: " + myList);
        } else {
            System.out.println("The LinkedList is empty. Nothing to remove.");
        }


        // Example with an empty list to show the handling
        LinkedList<Integer> emptyList = new LinkedList<>();
        if (!emptyList.isEmpty()) {
            Integer removed = emptyList.removeFirst();
            System.out.println("Removed from empty list (won't be reached):" + removed);
        } else {
            System.out.println("Cannot remove from an empty list.");
        }




         // Poll method (alternative for removing the first element)
        myList.addFirst("Fig"); // Add an element back for demonstration

        System.out.println("LinkedList before poll: " + myList);
        String polledElement = myList.poll(); // poll() returns null if the list is empty
        if (polledElement != null) {
             System.out.println("Polled element: " + polledElement);
        } else {
            System.out.println("Polled from an empty list (or was already empty).");
        }
        System.out.println("LinkedList after poll: " + myList);




        // Demonstrating exception handling when removing from empty list using removeFirst()
         emptyList.clear(); // Ensure it's empty (though it was already)
         try {
             String removedFromEmpty = emptyList.removeFirst(); // This will throw NoSuchElementException
         } catch (java.util.NoSuchElementException e) {
             System.out.println("Exception caught: " + e.getMessage()); // Handle the exception gracefully
         }



    }
}
