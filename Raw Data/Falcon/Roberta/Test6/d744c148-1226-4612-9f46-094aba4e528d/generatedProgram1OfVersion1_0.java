import java.util.LinkedList;

public class LinkedListLastElement {

    public static void main(String[] args) {

        // Create a LinkedList of Strings
        LinkedList<String> languages = new LinkedList<>();

        // Add some elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        // Check if the list is empty
        if (languages.isEmpty()) {
            System.out.println("The linked list is empty.");
            return; // Exit if the list is empty
        }


        // Method 1: Using peekLast()
        String lastElement = languages.peekLast();
        System.out.println("Last element (using peekLast()): " + lastElement);


        // Method 2: Using get() with size() - 1 (index of last element)
        lastElement = languages.get(languages.size() - 1); 
        System.out.println("Last element (using get()): " + lastElement);



        // Demonstrate that the elements are still in the list
        System.out.println("Linked list after retrieving last element:");
        for (String language : languages) {
            System.out.println(language);
        }



        // Example of handling an empty list gracefully (more concisely):
         LinkedList<Integer> numbers = new LinkedList<>();
         Integer lastNumber =  (numbers.isEmpty()) ? null : numbers.peekLast(); // Use a ternary operator


        if(lastNumber != null){
            System.out.println("Last number: " + lastNumber);
        } else {
            System.out.println("The numbers list is empty.");
        }




    }
}
