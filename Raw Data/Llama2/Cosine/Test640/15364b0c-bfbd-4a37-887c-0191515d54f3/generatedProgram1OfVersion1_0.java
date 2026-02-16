import java.util.LinkedList;

public class AppendToList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // The element to append
        String elementToAppend = "Date";

        // Append the element to the end of the list
        linkedList.add(elementToAppend); //  LinkedList's add() method appends by default

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example with an integer LinkedList
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        int numToAppend = 4;
        intList.add(numToAppend);

        System.out.println("Updated Integer LinkedList: " + intList);

    }
}
