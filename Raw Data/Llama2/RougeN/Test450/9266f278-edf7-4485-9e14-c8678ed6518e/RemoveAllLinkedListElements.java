import java.util.LinkedList;

public class RemoveAllLinkedListElements {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // Add some sample names
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("Initial linked list: " + names);

        // Remove all elements from the linked list
        names.clear();

        System.out.println("Linked list after removing all elements: " + names);


        //  Alternative method using removeAll(): (demonstration)
         LinkedList<String> names2 = new LinkedList<>();
        names2.add("Eve");
        names2.add("Frank");
        names2.add("Grace");

        System.out.println("Second initial linked list: " + names2);
        names2.removeAll(names2); // Removes all elements matching the list itself (effectively clearing it)

        System.out.println("Second linked list after removing all elements: " + names2);

    }
}
