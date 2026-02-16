import java.util.LinkedList;

public class AppendToLinkedList {

    public static void main(String[] args) {

        // Create a LinkedList of Strings
        LinkedList<String> languages = new LinkedList<>();

        // Add some initial elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Initial LinkedList: " + languages);

        // Element to append
        String newLanguage = "JavaScript";


        // Method 1: Using add() - Appends to the end by default
        languages.add(newLanguage); 
        System.out.println("After appending '" + newLanguage + "' using add(): " + languages);

        // Remove the last added element to demonstrate addLast()
        languages.removeLast();


        // Method 2: Using addLast() - Explicitly appends to the end
        languages.addLast(newLanguage);
        System.out.println("After appending '" + newLanguage + "' using addLast(): " + languages);


        // Example with integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int newNumber = 40;
        numbers.addLast(newNumber); // or numbers.add(newNumber);
        System.out.println("LinkedList of numbers after appending " + newNumber + ": " + numbers);


        // Appending to an empty LinkedList
        LinkedList<Double> decimals = new LinkedList<>();
        decimals.add(3.14); // Appending to an initially empty list
        System.out.println("LinkedList of decimals: " + decimals);



        /*  Key takeaways:
        *   Both add() and addLast() achieve the same result of appending to the end of the LinkedList.
        *   addLast() makes the intention clearer that you want to append to the end.
        *   These methods work even if the LinkedList is initially empty. 
        */
    }
}
