import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArray {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        // Convert LinkedList to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(linkedList);

        // Print the ArrayList (optional, but helpful for verification)
        System.out.println("ArrayList: " + arrayList); 
    }
}
