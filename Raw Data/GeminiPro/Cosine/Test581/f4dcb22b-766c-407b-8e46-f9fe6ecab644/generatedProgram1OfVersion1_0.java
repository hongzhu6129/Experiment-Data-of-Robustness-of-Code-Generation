import java.util.LinkedList;

public class LinkedListInsert {

    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> names = new LinkedList<>();

        // Insert elements at the beginning (first position)
        names.addFirst("Alice");
        names.addFirst("Bob");


        // Insert elements at the end (last position)
        names.addLast("Charlie");
        names.addLast("David");

        // Print the LinkedList
        System.out.println(names); // Output: [Bob, Alice, Charlie, David]
    }
}
