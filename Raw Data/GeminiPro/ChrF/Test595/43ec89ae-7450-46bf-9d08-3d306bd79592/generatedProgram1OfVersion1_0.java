import java.util.LinkedList;

public class RetrieveFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Check if the list is empty before attempting to retrieve the first element
        if (!linkedList.isEmpty()) {
            // Retrieve the first element using peek() or getFirst()
            String firstElement = linkedList.peek(); // or linkedList.getFirst();

            // Print the first element
            System.out.println("First element: " + firstElement);

            // Verify that the element is not removed
            System.out.println("Linked list after retrieving: " + linkedList); 
        } else {
            System.out.println("The linked list is empty.");
        }


        //Example with an Integer LinkedList:
         LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        if (!numbers.isEmpty()) {
           Integer firstNumber = numbers.peekFirst(); // peekFirst() is also an option

            System.out.println("First number: " + firstNumber);
            System.out.println("Numbers list after retrieving: " + numbers);

        } else {
            System.out.println("The numbers list is empty.");
        }
    }
}
