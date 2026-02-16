import java.util.LinkedList;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // Add some names to the linked list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("Original linked list: " + names);

        // Remove all elements from the linked list
        names.clear();  //  This is the most efficient way

        System.out.println("Linked list after removing all elements: " + names);


        // Demonstrating another (less efficient) method: removing one by one. 
        // Useful if you might have some condition for removal
        names.add("Eve");
        names.add("Frank");
        names.add("Grace");


        System.out.println("New linked list: " + names);


        while (!names.isEmpty()) { // iterate while the list is not empty
            names.removeFirst();  // remove the first element in each iteration
        }

        System.out.println("Linked list after removing elements one by one : " + names);
    }
}
