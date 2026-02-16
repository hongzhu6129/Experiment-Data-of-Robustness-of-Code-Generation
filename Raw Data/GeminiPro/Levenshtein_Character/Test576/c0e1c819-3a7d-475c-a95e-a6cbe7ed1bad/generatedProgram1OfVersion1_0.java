import java.util.LinkedList;

public class AppendToLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to append
        String elementToAppend = "Grape";

        // Append the element to the end of the list
        linkedList.add(elementToAppend); // or linkedList.addLast(elementToAppend); both achieve the same result

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList); 
    }
}
