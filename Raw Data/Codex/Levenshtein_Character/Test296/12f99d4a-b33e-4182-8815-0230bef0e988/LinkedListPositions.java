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

        // Display elements and their positions
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Element at position " + i + ": " + linkedList.get(i));
        }
    }
}
