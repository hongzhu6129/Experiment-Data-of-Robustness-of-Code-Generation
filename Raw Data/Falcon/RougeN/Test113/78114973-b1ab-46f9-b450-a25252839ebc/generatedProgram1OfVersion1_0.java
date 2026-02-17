import java.util.LinkedList;

public class RemoveFirstElement {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> languages = new LinkedList<>();

        // Add elements to the LinkedList
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Initial LinkedList: " + languages);

        // Check if the LinkedList is empty
        if (!languages.isEmpty()) {

            // Retrieve and remove the first element using removeFirst()
            String firstElement = languages.removeFirst();

            System.out.println("Removed element: " + firstElement);
            System.out.println("Updated LinkedList: " + languages);


            //Alternative: Retrieve and remove using remove() which defaults to the first element/head
            languages.addFirst("Kotlin"); //Adding back an element for demonstration.
            System.out.println("LinkedList after adding Kotlin: " + languages);

            String firstElement2 = languages.remove(); // No index provided means remove the first.
            System.out.println("Removed element (using remove()): " + firstElement2);
            System.out.println("Updated LinkedList: " + languages);



             // Illustrate the difference between peekFirst() and removeFirst()
            languages.addFirst("Swift"); //Adding back for peekFirst demonstration.
            System.out.println("LinkedList after adding Swift: " + languages);


            String peekedElement = languages.peekFirst(); // Retrieves, but doesn't remove.
            System.out.println("Peeked element (using peekFirst()): " + peekedElement); 
            System.out.println("LinkedList after peekFirst() : " + languages); //List remains unchanged

            languages.removeFirst();  // Now remove Swift
            System.out.println("LinkedList after removing Swift : " + languages);

        } else {
            System.out.println("The LinkedList is empty.");
        }




        // Example of handling potential exceptions
        LinkedList<Integer> numbers = new LinkedList<>();
        try{
            Integer firstNum = numbers.removeFirst(); // Trying to remove from an empty list throws an exception
            System.out.println(firstNum); 
        } catch (java.util.NoSuchElementException e){ //Handle it gracefully
            System.out.println("Cannot remove from an empty list.");
        }


    }
}
