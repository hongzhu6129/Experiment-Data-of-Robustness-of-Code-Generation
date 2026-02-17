import java.util.LinkedList;

public class AppendToList {

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
        linkedList.add(elementToAppend); // LinkedList's add() method appends by default

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example with integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int numToAppend = 4;
        numbers.add(numToAppend);

        System.out.println("Updated LinkedList of numbers: " + numbers);



        // Example demonstrating how to handle a potentially null list (defensive programming)
        LinkedList<String> potentiallyNullList = null;

        if (potentiallyNullList == null) {
            potentiallyNullList = new LinkedList<>();  // Initialize if null
        }

        potentiallyNullList.add("First element after null check");  // Now safe to add

        System.out.println("List after null check: " + potentiallyNullList);

    }
}
