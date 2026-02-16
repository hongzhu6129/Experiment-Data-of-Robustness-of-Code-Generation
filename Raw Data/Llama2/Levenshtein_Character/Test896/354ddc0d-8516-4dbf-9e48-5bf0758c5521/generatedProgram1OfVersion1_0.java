import java.util.TreeSet;

public class RemoveLastTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Check if the TreeSet is empty
        if (numbers.isEmpty()) {
            System.out.println("TreeSet is empty. Cannot remove the last element.");
            return; // Exit the program
        }

        // Retrieve the last element (largest element in a TreeSet)
        Integer lastElement = numbers.last();

        // Remove the last element
        numbers.remove(lastElement);

        // Print the last element and the updated TreeSet
        System.out.println("Removed last element: " + lastElement);
        System.out.println("Updated TreeSet: " + numbers);


        // Example with strings

         TreeSet<String> strings = new TreeSet<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");


        if (strings.isEmpty()) {
            System.out.println("TreeSet is empty. Cannot remove the last element.");
            return; 
        }

         String lastString = strings.last();
        strings.remove(lastString);

         System.out.println("Removed last String: " + lastString);
        System.out.println("Updated TreeSet: " + strings);



    }
}
