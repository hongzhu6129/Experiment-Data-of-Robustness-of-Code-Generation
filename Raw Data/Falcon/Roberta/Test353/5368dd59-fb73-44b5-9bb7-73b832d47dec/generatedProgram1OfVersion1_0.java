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

        // Append the element using add() - it adds to the end by default
        languages.add(newLanguage);


        System.out.println("LinkedList after appending " + newLanguage + ": " + languages);



        // Demonstrating addLast() -  explicitly adds to the end (same as add())
        String anotherLanguage = "Kotlin";
        languages.addLast(anotherLanguage); // Equivalent to languages.add(anotherLanguage)

        System.out.println("LinkedList after appending " + anotherLanguage + ": " + languages);


        // Example with integers:
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int newNumber = 40;
        numbers.add(newNumber); // Append to the end

        System.out.println("LinkedList of numbers after appending " + newNumber + ": " + numbers);



         // Appending a null element (allowed in LinkedList):
        languages.add(null); // null is a valid element
        System.out.println("LinkedList after appending null: " + languages); 



    }
}
