import java.util.LinkedList;

public class RemoveAllLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Original LinkedList: " + linkedList);

        // Remove all elements using clear()
        linkedList.clear();

        System.out.println("LinkedList after clearing: " + linkedList);


        // Demonstrating another approach (removing one by one, though less efficient)
         LinkedList<Integer> numbers = new LinkedList<>();
         numbers.add(1);
         numbers.add(2);
         numbers.add(3);

        System.out.println("Original Numbers LinkedList: " + numbers);

        while (!numbers.isEmpty()) {
            numbers.removeFirst(); // Or numbers.removeLast() to remove from the end
        }

        System.out.println("Numbers LinkedList after removing one by one: " + numbers);



    }
}
