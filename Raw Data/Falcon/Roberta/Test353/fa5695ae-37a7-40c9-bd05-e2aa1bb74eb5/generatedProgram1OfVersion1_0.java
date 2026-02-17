import java.util.LinkedList;

public class AppendToList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Element to append
        String elementToAppend = "Date";

        // Append the element to the end of the linked list
        linkedList.add(elementToAppend); // Or linkedList.addLast(elementToAppend);  Both are equivalent.

        // Print the updated linked list
        System.out.println("Updated LinkedList: " + linkedList); 
    }
}
