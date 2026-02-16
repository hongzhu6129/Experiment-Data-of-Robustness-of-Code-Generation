import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

    public static void main(String[] args) {
        // Create a sample list
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("took"); // Element to be removed
        myList.add("orange");
        myList.add("grape");

        // Retrieve and remove "took"
        String removedElement = retrieveAndRemove(myList, "took");

        // Print the removed element (if found)
        if (removedElement != null) {
            System.out.println("Removed element: " + removedElement);
        } else {
            System.out.println("Element 'took' not found in the list.");
        }

        // Print the updated list
        System.out.println("Updated list: " + myList);
    }

    private static String retrieveAndRemove(List<String> list, String elementToRemove) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(elementToRemove)) {
                String removed = list.get(i); // or list.remove(i); returns removed item.
                list.remove(i);
                return removed;
            }
        }

        return null; // Element not found
    }
}
