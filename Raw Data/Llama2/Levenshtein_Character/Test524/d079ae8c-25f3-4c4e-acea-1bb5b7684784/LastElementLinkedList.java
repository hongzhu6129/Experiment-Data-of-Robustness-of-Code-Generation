import java.util.LinkedList;

public class LastElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        // Check if the list is empty
        if (linkedList.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            // Retrieve the last element using peekLast()
            String lastElement = linkedList.peekLast();

            // Print the last element
            System.out.println("Last element: " + lastElement);


            // Demonstrate that peekLast() does not remove the element
            System.out.println("Linked list after peekLast(): " + linkedList);
        }



         //Example with an Integer LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        if (!numbers.isEmpty()) {
            Integer lastNumber = numbers.peekLast();
            System.out.println("Last number: " + lastNumber);
            System.out.println("Numbers after peekLast(): " + numbers);

        } else {
              System.out.println("The numbers list is empty.");
        }
    }
}
