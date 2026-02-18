import java.util.LinkedList;

public class InsertAtFrontLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements (optional)
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("Original LinkedList: " + linkedList);

        // Element to insert at the front
        String elementToInsert = "Grape";

        // Insert at the front using addFirst()
        linkedList.addFirst(elementToInsert);


        System.out.println("LinkedList after insertion: " + linkedList);


        //Example with Integer
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Original Numbers LinkedList: " + numbers);


        int numToInsert = 0;
        numbers.addFirst(numToInsert);
        System.out.println("Numbers LinkedList after insertion: " + numbers);
    }
}
