import java.util.TreeSet;

public class TreeSetFirstLast {

    public static void main(String[] args) {

        // Create a TreeSet and populate it with some data
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);

        // Print the original TreeSet
        System.out.println("Original TreeSet: " + numbers);

        // Get the first element (smallest)
        Integer firstElement = numbers.first();
        System.out.println("First element: " + firstElement);

        // Get the last element (largest)
        Integer lastElement = numbers.last();
        System.out.println("Last element: " + lastElement);


        // Example with Strings
        TreeSet<String> strings = new TreeSet<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");

        System.out.println("\nOriginal TreeSet (Strings): " + strings);
        System.out.println("First element (String): " + strings.first());
        System.out.println("Last element (String): " + strings.last());


        // Handling empty TreeSets (important!)
        TreeSet<Integer> emptySet = new TreeSet<>();
        System.out.println("\nEmpty TreeSet: " + emptySet);

        try {
            Integer firstEmpty = emptySet.first();
            System.out.println("First element (empty): " + firstEmpty); // This won't execute
        } catch (NoSuchElementException e) {
            System.out.println("Error: Cannot get first element from an empty TreeSet.");
        }

        try {
            Integer lastEmpty = emptySet.last();
            System.out.println("Last element (empty): " + lastEmpty); // This won't execute
        } catch (NoSuchElementException e) {
            System.out.println("Error: Cannot get last element from an empty TreeSet.");
        }




    }
}
