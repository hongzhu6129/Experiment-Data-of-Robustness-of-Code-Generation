import java.util.LinkedList;
import java.util.List;

public class RetrieveFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList
        List<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");


        // Check if the list is empty before retrieving the first element
        if (!linkedList.isEmpty()) {
            String firstElement = linkedList.get(0); // Retrieve the first element
            System.out.println("First element: " + firstElement);


            // Demonstrate that the element is still in the list
            System.out.println("List after retrieval: " + linkedList);
        } else {
            System.out.println("The list is empty.");
        }



         //Example with an Integer list
         List<Integer> numbers = new LinkedList<>();
         numbers.add(10);
         numbers.add(20);
         numbers.add(30);

         if (!numbers.isEmpty()) {
             Integer firstNumber = numbers.get(0);
             System.out.println("First number: " + firstNumber);
             System.out.println("Numbers list after retrieval: " + numbers);
         } else {
             System.out.println("The numbers list is empty.");
         }
    }
}
