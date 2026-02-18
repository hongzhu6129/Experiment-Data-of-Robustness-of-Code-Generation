import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> languages = new LinkedList<>();

        // Add some initial elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Initial LinkedList: " + languages);

        // Insert "JavaScript" at index 1
        insertAtIndex(languages, 1, "JavaScript");
        System.out.println("After inserting JavaScript at index 1: " + languages);


        // Insert "Kotlin" at index 0 (beginning)
        insertAtIndex(languages, 0, "Kotlin");
        System.out.println("After inserting Kotlin at index 0: " + languages);


        // Insert "Swift" at the end (index = size)
        insertAtIndex(languages, languages.size(), "Swift");  // Inserting at the end
        System.out.println("After inserting Swift at the end: " + languages);

        // Demonstrate handling index out of bounds
        try {
            insertAtIndex(languages, 10, "Ruby"); // This will throw an exception
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    public static void insertAtIndex(LinkedList<String> list, int index, String element) {
        // Check for valid index
        if (index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for LinkedList of size " + list.size());
        }

        // Use ListIterator for efficient insertion
        ListIterator<String> iterator = list.listIterator();
        for (int i = 0; i < index; i++) {
            iterator.next(); // Move the iterator to the desired position
        }
        iterator.add(element); // Insert the element
    }


}

