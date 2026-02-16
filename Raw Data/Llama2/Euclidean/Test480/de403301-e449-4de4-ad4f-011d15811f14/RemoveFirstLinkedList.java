import java.util.LinkedList;

public class RemoveFirstLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> languages = new LinkedList<>();

        // Add elements to the LinkedList
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        // Print the original LinkedList
        System.out.println("Original LinkedList: " + languages);

        // Check if the LinkedList is empty
        if (!languages.isEmpty()) {
            // Remove the first element
            String removedElement = languages.removeFirst(); 

            // Print the removed element
            System.out.println("Removed element: " + removedElement);

            // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + languages);
        } else {
            System.out.println("LinkedList is empty. Cannot remove an element.");
        }



         // Example demonstrating remove() with an index (though the prompt asked for removing the *first* element)
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original Numbers LinkedList: " + numbers);

         if (!numbers.isEmpty()) {
              int removedNumber = numbers.remove(0); // Remove element at index 0 (the first element).  Similar to removeFirst().
              System.out.println("Removed number (using index): " + removedNumber);
              System.out.println("Updated Numbers LinkedList : " + numbers);
        } else {
           System.out.println("Numbers LinkedList is empty");
        }


    }
}
