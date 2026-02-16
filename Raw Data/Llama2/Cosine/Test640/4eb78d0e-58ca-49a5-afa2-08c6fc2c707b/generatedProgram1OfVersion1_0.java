import java.util.LinkedList;

public class AppendLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Element to append
        String elementToAppend = "Mango";

        // Append the element to the end of the linked list
        linkedList.add(elementToAppend); // or linkedList.addLast(elementToAppend); both achieve the same

        // Print the updated linked list
        System.out.println("Updated LinkedList: " + linkedList);


        // Example with integers:
         LinkedList<Integer> numbers = new LinkedList<>();
         numbers.add(1);
         numbers.add(2);
         numbers.add(3);

         int numberToAppend = 4;
         numbers.add(numberToAppend);

         System.out.println("Updated LinkedList of numbers: " + numbers);

    }
}
