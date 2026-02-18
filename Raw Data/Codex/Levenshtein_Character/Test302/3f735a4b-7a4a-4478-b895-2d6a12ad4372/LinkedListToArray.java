import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArray {

    public static void main(String[] args) {
        // Create a LinkedList of names
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Alice");
        namesLinkedList.add("Bob");
        namesLinkedList.add("Charlie");
        namesLinkedList.add("David");

        // Convert the LinkedList to an ArrayList
        ArrayList<String> namesArrayList = new ArrayList<>(namesLinkedList);


        // Print the ArrayList to verify the conversion
        System.out.println("ArrayList: " + namesArrayList);
    }
}
