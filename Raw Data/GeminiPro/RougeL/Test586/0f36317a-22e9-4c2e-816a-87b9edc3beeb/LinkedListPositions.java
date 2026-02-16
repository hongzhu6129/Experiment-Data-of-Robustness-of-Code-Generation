import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPositions {

    public static void main(String[] args) {
        // Create a LinkedList of names
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");


        // Method 1: Using ListIterator (recommended for LinkedList)
        System.out.println("Using ListIterator:");
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            int index = iterator.nextIndex();
            String name = iterator.next();
            System.out.println("Position: " + index + ", Element: " + name);
        }


        // Method 2: Using a for loop with get() (less efficient for LinkedList)

        System.out.println("\nUsing for loop with get():"); // Added newline for clarity
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println("Position: " + i + ", Element: " + name);
        }




        //Method 3: Using enhanced for loop with a counter (maintains simplicity but requires manual indexing)
        System.out.println("\nUsing enhanced for loop with counter:");
        int index = 0;
        for (String name : names) {
            System.out.println("Position: " + index + ", Element: " + name);
            index++;
        }


    }
}
