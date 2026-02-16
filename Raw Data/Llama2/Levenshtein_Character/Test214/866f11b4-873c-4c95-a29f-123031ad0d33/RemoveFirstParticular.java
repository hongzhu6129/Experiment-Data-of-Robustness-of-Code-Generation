import java.util.LinkedList;

public class RemoveFirstParticular {

    public static void main(String[] args) {
        // Example usage:
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("apple"); // Duplicate 'apple'
        linkedList.add("grape");

        String elementToRemove = "apple";

        String removedElement = removeFirstParticular(linkedList, elementToRemove);


        if (removedElement != null) {
            System.out.println("Removed element: " + removedElement);
            System.out.println("Updated linked list: " + linkedList);

        } else {
            System.out.println("Element '" + elementToRemove + "' not found in the list.");
            System.out.println("Linked list remains unchanged: " + linkedList);

        }


         linkedList = new LinkedList<>(); // Test with an empty list
        linkedList.add("apple");


        elementToRemove = "orange"; // Test with an element not in the list
        removedElement = removeFirstParticular(linkedList, elementToRemove);


        if (removedElement != null) {
            System.out.println("Removed element: " + removedElement);
            System.out.println("Updated linked list: " + linkedList);
        } else {
            System.out.println("Element '" + elementToRemove + "' not found in the list.");
            System.out.println("Linked list remains unchanged: " + linkedList);
        }
    }


    public static <T> T removeFirstParticular(LinkedList<T> list, T element) {
        if (list == null || list.isEmpty()) {  // Handle null or empty list
            return null;
        }

        // Iterate through the list and remove the first occurrence.
        for (int i = 0; i < list.size(); i++) {  // Using indexed loop for removal.
            if (list.get(i).equals(element)) {
                return list.remove(i); // remove() returns the removed element.
            }
        }
       return null; // Element not found.
    }
}
