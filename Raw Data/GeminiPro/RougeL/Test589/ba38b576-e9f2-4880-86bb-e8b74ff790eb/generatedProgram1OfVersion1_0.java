import java.util.LinkedList;

public class RemoveAllLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Print the original LinkedList
        System.out.println("Original LinkedList: " + linkedList);

        // Remove all elements from the LinkedList
        linkedList.clear();

        // Print the LinkedList after removing all elements
        System.out.println("LinkedList after removing all elements: " + linkedList);


        // Another way using a while loop (demonstration - clear() is preferred)
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Original numbers list: " + numbers);

        while (!numbers.isEmpty()) { // Check if the list is empty
            numbers.removeFirst(); // Remove the first element until empty
        }
        System.out.println("Numbers list after removing elements with while loop: " + numbers);


    }
}
