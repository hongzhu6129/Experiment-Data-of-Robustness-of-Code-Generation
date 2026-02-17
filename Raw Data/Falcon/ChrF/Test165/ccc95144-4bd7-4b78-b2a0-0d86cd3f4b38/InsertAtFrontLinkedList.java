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

        // Insert at the front using addFirst()
        linkedList.addFirst(elementToInsert);


        System.out.println("LinkedList after inserting at front: " + linkedList);


        // Example with integers
         LinkedList<Integer> intList = new LinkedList<>();
         intList.add(10);
         intList.add(20);

         int numToInsert = 5;
         intList.addFirst(numToInsert);
         System.out.println("Integer LinkedList after inserting at front: " + intList);



    }
}
