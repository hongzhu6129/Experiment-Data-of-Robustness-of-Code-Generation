import java.util.LinkedList;
import java.util.ListIterator;

public class ReplaceLinkedListElement {

    public static void main(String[] args) {

        // Create a LinkedList of Strings
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Original LinkedList: " + languages);


        // Method 1: Replacing using set() method (index-based)

        // Replace "C++" with "Kotlin" at index 2
        languages.set(2, "Kotlin"); 
        System.out.println("LinkedList after replacing using set(): " + languages);


        // Method 2: Replacing using ListIterator (more flexible)
        languages.add("C#"); // Adding back C# for the next example
        System.out.println("LinkedList before ListIterator replacement: " + languages);


        ListIterator<String> iterator = languages.listIterator();
        while (iterator.hasNext()) {
            String language = iterator.next();
            if (language.equals("JavaScript")) {
                iterator.set("TypeScript"); // Replace "JavaScript" with "TypeScript"
            }
            if (language.equals("C#")) {
                iterator.add("Go"); // You can also insert new elements using ListIterator.add()
            }

        }

        System.out.println("LinkedList after replacing using ListIterator: " + languages);

         // Example: Handling cases where the element might not be present

         // Reset the list (for demonstration)
        languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Kotlin");

        String target = "C++";  // Element that might not exist
        String replacement = "Rust";

        boolean found = false;
        iterator = languages.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(target)) {
                iterator.set(replacement);
                found = true;
                break; // Exit after replacing the first occurrence
            }
        }

        if (found) {
            System.out.println("Replaced " + target + " with " + replacement + ": " + languages);
        } else {
            System.out.println(target + " not found in the LinkedList.  List remains: " + languages);

        }

    }
}
