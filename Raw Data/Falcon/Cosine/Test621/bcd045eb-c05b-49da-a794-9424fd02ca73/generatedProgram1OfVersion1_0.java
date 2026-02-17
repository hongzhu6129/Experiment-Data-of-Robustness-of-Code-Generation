import java.util.LinkedList;

public class InsertAtFrontLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of strings (names)
        LinkedList<String> names = new LinkedList<>();

        // Add some initial names
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");

        // Specify the element to insert at the front
        String newElement = "David";

        // Insert the new element at the front using addFirst()
        names.addFirst(newElement);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + names);


        // Example with an empty LinkedList:
         LinkedList<String> emptyNames = new LinkedList<>();
         emptyNames.addFirst("Eve"); // Works fine even if the list is initially empty
         System.out.println("List starting empty: " + emptyNames);

        //Illustrate potential null insertion:
        String nullName = null;
        names.addFirst(nullName); // LinkedList allows nulls
        System.out.println("List with null inserted: " + names);

    }
}
