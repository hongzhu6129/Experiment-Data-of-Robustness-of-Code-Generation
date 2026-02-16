import java.util.LinkedList;

public class RemoveFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Check if the list is empty before attempting to remove
        if (!linkedList.isEmpty()) {
            // Retrieve and remove the first element using poll()
            String firstElement = linkedList.poll(); 

            // Print the removed element and the updated list
            System.out.println("Removed element: " + firstElement);
            System.out.println("Updated LinkedList: " + linkedList);
        } else {
            System.out.println("LinkedList is empty.");
        }


         // Example with integers:
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        if (!numbers.isEmpty()) {
           Integer firstNumber = numbers.poll();
           System.out.println("Removed number: " + firstNumber);
           System.out.println("Updated numbers list: " + numbers);
        } else {
             System.out.println("Numbers list is empty.");
        }
    }
}
