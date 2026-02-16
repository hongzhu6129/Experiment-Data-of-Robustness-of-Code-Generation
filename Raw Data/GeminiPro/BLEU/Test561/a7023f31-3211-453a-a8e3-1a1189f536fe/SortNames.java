import java.util.Arrays;

public class SortNames {

    public static void main(String[] args) {
        // Example array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Sort the array alphabetically
        Arrays.sort(names);

        // Print the sorted array
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }


        // Example with case-insensitive sorting:

        String[] namesCaseInsensitive = {"apple", "Banana", "orange", "Grape"};

        Arrays.sort(namesCaseInsensitive, String.CASE_INSENSITIVE_ORDER);


        System.out.println("\nCase-insensitive sorted names:");
        for (String name : namesCaseInsensitive) {
            System.out.println(name);
        }



       // Example with reverse order sorting:
        String[] namesReverse = {"apple", "Banana", "orange", "Grape"};

        // Note:  You can combine comparators for even more complex sorting logic.
        Arrays.sort(namesReverse, (s1, s2) -> s2.compareToIgnoreCase(s1)); // Reverse case-insensitive

        System.out.println("\nReverse case-insensitive sorted names:");
        for (String name : namesReverse) {
            System.out.println(name);
        }


    }
}
