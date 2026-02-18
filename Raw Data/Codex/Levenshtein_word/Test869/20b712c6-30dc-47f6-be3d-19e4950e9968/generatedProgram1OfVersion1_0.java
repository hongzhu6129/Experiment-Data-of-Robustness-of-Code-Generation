import java.util.LinkedList;

public class CheckLinkedListEmpty {

    public static void main(String[] args) {
        // Example 1: Empty linked list
        LinkedList<String> names1 = new LinkedList<>();
        System.out.println("Is names1 empty? " + names1.isEmpty()); // Output: true

        // Example 2: Non-empty linked list
        LinkedList<String> names2 = new LinkedList<>();
        names2.add("Alice");
        names2.add("Bob");
        System.out.println("Is names2 empty? " + names2.isEmpty()); // Output: false


        // Example 3:  Using size() to check (alternative)
        LinkedList<String> names3 = new LinkedList<>();
        System.out.println("Is names3 empty (using size)? " + (names3.size() == 0)); // Output: true
        
        names3.add("Charlie");
        System.out.println("Is names3 empty (using size)? " + (names3.size() == 0)); // Output: false



    }
}
