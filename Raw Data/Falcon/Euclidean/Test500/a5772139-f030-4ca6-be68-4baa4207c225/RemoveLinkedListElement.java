import java.util.LinkedList;

public class RemoveLinkedListElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");

        System.out.println("Original LinkedList: " + linkedList);

        // Element to remove
        String elementToRemove = "Orange";


        // Method 1: Using remove(Object)
        boolean removed = linkedList.remove(elementToRemove); 

        if (removed) {
            System.out.println("LinkedList after removing '" + elementToRemove + "': " + linkedList);
        } else {
            System.out.println("'" + elementToRemove + "' not found in the LinkedList.");
        }



        // Reset the LinkedList (for demonstrating remove(int) - optional)
        linkedList.clear();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");


        // Method 2: Using remove(int index) - removes by index, not value directly.
        int indexToRemove = linkedList.indexOf("Grape"); // Find the index of "Grape"


        if (indexToRemove != -1) { // Check if the element exists
            String removedElement = linkedList.remove(indexToRemove);
            System.out.println("LinkedList after removing element at index " + indexToRemove + " ('" + removedElement + "'): " + linkedList);
        } else {
            System.out.println("Element not found in the LinkedList.");
        }




       //Example demonstrating removing the first and last elements:

        // Reset the LinkedList again
         linkedList.clear();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");

        linkedList.removeFirst(); //Removes "Apple"
        System.out.println("LinkedList after removing first: " + linkedList);

        linkedList.removeLast(); //Removes "Mango"
        System.out.println("LinkedList after removing last: " + linkedList);


        //Removing a non-existent element:
        linkedList.clear();
        linkedList.add("Apple");

        boolean removedNonExistent = linkedList.remove("Pear"); //This will return false.
        System.out.println("Removed non-existent Pear? " + removedNonExistent);
        System.out.println("LinkedList: " + linkedList);

    }
}
