import java.util.LinkedList;

public class RetrieveFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Check if the LinkedList is empty
        if (linkedList.isEmpty()) {
            System.out.println("The LinkedList is empty.");
        } else {
            // Retrieve the first element using peekFirst()
            String firstElement = linkedList.peekFirst(); 

            // Print the first element
            System.out.println("First element: " + firstElement);


            //Alternatively, use peek() - it does the same thing as peekFirst()
            String firstElement2 = linkedList.peek();
            System.out.println("First element (using peek()): " + firstElement2);


            // Demonstrate that peekFirst() doesn't remove the element
             System.out.println("LinkedList after peekFirst(): " + linkedList);



            // For comparison, show how getFirst() retrieves AND removes
             if (!linkedList.isEmpty()) { // Important to check for empty list to avoid exceptions
                 String removedFirst = linkedList.getFirst();
                 System.out.println("Removed first element (using getFirst()): " + removedFirst);
                 System.out.println("LinkedList after getFirst(): " + linkedList);
             }
        }
    }
}
