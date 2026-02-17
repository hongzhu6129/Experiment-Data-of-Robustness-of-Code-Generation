import java.util.LinkedList;

public class RemoveFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");


        if (!linkedList.isEmpty()) {
            // Retrieve and remove the first element using pollFirst() which returns null if the list is empty.
            String firstElement = linkedList.pollFirst(); 

            if (firstElement != null) { //Check if an element was retrieved (list wasn't empty)
                 System.out.println("Removed element: " + firstElement);
                 System.out.println("Updated LinkedList: " + linkedList);
            } else {
                System.out.println("The LinkedList was empty.");
            }


        } else {
            System.out.println("The LinkedList is empty.  Nothing to remove.");

        }


        // Example using removeFirst() which throws an exception if the list is empty (less preferred, usually)
        // Uncomment to test this and comment out the above safer approach
        /*
        try {
           String firstElement = linkedList.removeFirst();
           System.out.println("Removed element: " + firstElement);
           System.out.println("Updated LinkedList: " + linkedList);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("The LinkedList is empty. Cannot remove.");
        }
        */
    }
}
