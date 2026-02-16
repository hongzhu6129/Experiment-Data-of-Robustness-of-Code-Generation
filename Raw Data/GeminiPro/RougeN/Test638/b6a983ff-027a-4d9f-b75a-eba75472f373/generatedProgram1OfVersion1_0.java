import java.util.LinkedList;

public class RemoveFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");


        if (!linkedList.isEmpty()) {
            // Retrieve and remove the first element
            String firstElement = linkedList.removeFirst(); // or linkedList.pollFirst() which returns null if empty

            System.out.println("Removed element: " + firstElement);
            System.out.println("Updated LinkedList: " + linkedList);
        } else {
            System.out.println("LinkedList is empty.");
        }

       
    }
}
