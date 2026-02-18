import java.util.LinkedList;

public class InsertAtEndLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert at the end
        String elementToInsert = "Grape";

        // Insert the element at the end using add()
        linkedList.add(elementToInsert);


        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example with integers:
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        int numToInsert = 4;
        intList.add(numToInsert); // Insert at the end

        System.out.println("Updated Integer LinkedList: " + intList);


        // Example demonstrating addLast() explicitly (same effect as add() for inserting at the end)
        LinkedList<Double> doubleList = new LinkedList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);

        double doubleToInsert = 3.3;
        doubleList.addLast(doubleToInsert);  // Insert at the end

        System.out.println("Updated Double LinkedList: " + doubleList);
    }
}



