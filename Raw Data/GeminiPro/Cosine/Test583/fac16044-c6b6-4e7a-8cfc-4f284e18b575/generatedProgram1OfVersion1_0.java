import java.util.LinkedList;

public class LinkedListInsertAtEnd {

    public static void main(String[] args) {

        // Create a LinkedList of Strings
        LinkedList<String> languages = new LinkedList<>();

        // Add some initial elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // Element to insert at the end
        String newLanguage = "JavaScript";

        System.out.println("Initial LinkedList: " + languages);

        // Insert at the end using add()
        languages.add(newLanguage); 

        System.out.println("LinkedList after inserting at the end: " + languages);


        // Example with an integer LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int newNumber = 4;

        System.out.println("\nInitial Integer LinkedList: " + numbers);
        numbers.add(newNumber);  // Add at the end
        System.out.println("Integer LinkedList after inserting at the end: " + numbers);


        // Illustrating offer() which is functionally equivalent to add() for inserting at the end.
        LinkedList<Character> chars = new LinkedList<>();
        chars.add('A');
        chars.add('B');

        char newChar = 'C';

        System.out.println("\nInitial Character LinkedList: " + chars);

        chars.offer(newChar); // offer() also inserts at the end
        System.out.println("Character LinkedList after inserting at the end (using offer()): " + chars);



        // Demonstrating addLast() which is explicitly for inserting at the end.
         LinkedList<Double> doubles = new LinkedList<>();
        doubles.add(1.1);
        doubles.add(2.2);

        double newDouble = 3.3;

        System.out.println("\nInitial Double LinkedList: " + doubles);

        doubles.addLast(newDouble); // addLast() inserts at the end.
        System.out.println("Double LinkedList after inserting at the end (using addLast()): " + doubles);


    }
}
