import java.util.LinkedList;

public class InsertLeftLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert at the left (beginning)
        String newElement = "Grape";

        // Insert at the beginning (left) using addFirst()
        linkedList.addFirst(newElement);


        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example 2: Inserting a number at the left of an Integer LinkedList
         LinkedList<Integer> numberList = new LinkedList<>();
         numberList.add(10);
         numberList.add(20);
         numberList.add(30);

         int newNumber = 5;

        numberList.addFirst(newNumber);
        System.out.println("Updated Number LinkedList: " + numberList);
    }
}
