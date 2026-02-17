import java.util.LinkedList;

public class InsertAtEndLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
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


         //More examples for different data types:

        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4); // Insert at the end
        System.out.println("Integer LinkedList: " + intList);

        LinkedList<Double> doubleList = new LinkedList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        doubleList.add(4.4);  // Insert at the end
        System.out.println("Double LinkedList: " + doubleList);


    }
}
