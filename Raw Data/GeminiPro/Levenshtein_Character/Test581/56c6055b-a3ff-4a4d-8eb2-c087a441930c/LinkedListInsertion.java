import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> days = new LinkedList<>();

        // Initial elements
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");

        System.out.println("Initial LinkedList: " + days);


        // Insert at the beginning (first position)
        days.addFirst("Monday");


        // Insert at the end (last position)
        days.addLast("Friday");

        System.out.println("LinkedList after insertions: " + days);



       // More Examples (if needed):  Inserting at specific indexes


        days.add(2, "Tuesday Afternoon"); // Inserts at index 2 (3rd position)
        System.out.println("LinkedList after inserting at index 2: " + days);

         //Be careful when inserting using an index; ensure it's within the bounds of the list
        // Otherwise an IndexOutOfBoundsException will be thrown

        // Example of inserting an element that already exists (duplicates are allowed)
        days.addLast("Friday"); // Friday is already there; another "Friday" will be added at the end.
        System.out.println("LinkedList after inserting another Friday:" + days);


    }
}
