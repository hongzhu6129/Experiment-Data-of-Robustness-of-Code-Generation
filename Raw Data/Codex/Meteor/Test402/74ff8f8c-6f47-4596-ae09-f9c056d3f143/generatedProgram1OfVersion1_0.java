import java.util.LinkedList;

public class AppendToList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Element to append
        String elementToAppend = "Date";

        // Append the element to the end of the list
        linkedList.add(elementToAppend); // or linkedList.addLast(elementToAppend);  Both are equivalent.


        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList); 
    }
}
