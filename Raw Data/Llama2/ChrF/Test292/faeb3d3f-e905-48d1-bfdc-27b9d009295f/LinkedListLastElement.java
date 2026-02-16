import java.util.LinkedList;

public class LinkedListLastElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");


        if (!linkedList.isEmpty()) {
            // Retrieve the last element using peekLast() - doesn't remove
            String lastElement = linkedList.peekLast();

            System.out.println("Last element: " + lastElement);  // Output: Last element: Date

            // Demonstrate that the element is still in the list:
            System.out.println("List contents: " + linkedList); // Output: List contents: [Apple, Banana, Cherry, Date]

        } else {
            System.out.println("The linked list is empty.");
        }

        // Example with an Integer LinkedList
         LinkedList<Integer> numbers = new LinkedList<>();
         numbers.add(10);
         numbers.add(20);
         numbers.add(30);

         if (!numbers.isEmpty()) {
              Integer lastNumber = numbers.peekLast();
             System.out.println("Last number: " + lastNumber); // Output: Last number: 30
         } else {
             System.out.println("The number list is empty.");
         }



    }
}
