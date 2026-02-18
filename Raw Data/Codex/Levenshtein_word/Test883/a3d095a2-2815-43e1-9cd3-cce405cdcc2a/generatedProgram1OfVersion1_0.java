import java.util.LinkedList;

public class RemoveFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grape");

        // Check if the list is empty
        if (list.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            // Retrieve and remove the first element
            String firstElement = list.pollFirst(); // or list.removeFirst() - both work

            // Print the removed element
            if (firstElement != null) { // Check in case pollFirst returns null (empty list)
                System.out.println("Removed first element: " + firstElement);
            }

            // Print the updated list 
            System.out.println("Updated list: " + list); 
        }
    }
}


