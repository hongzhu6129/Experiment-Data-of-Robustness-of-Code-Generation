import java.util.LinkedList;

public class InsertAtFrontLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements (optional)
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Original LinkedList: " + linkedList);

        // Element to insert at the front
        String elementToInsert = "Grape";

        // Insert the element at the front
        linkedList.addFirst(elementToInsert);  // or push(elementToInsert) - both do the same thing


        System.out.println("LinkedList after insertion: " + linkedList);


        // Example with an Integer LinkedList
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(10);
        numberList.add(20);

        int numberToInsert = 5;
        numberList.push(numberToInsert); // or addFirst(numberToInsert)

        System.out.println("Integer LinkedList after insertion: " + numberList);

    }
}
