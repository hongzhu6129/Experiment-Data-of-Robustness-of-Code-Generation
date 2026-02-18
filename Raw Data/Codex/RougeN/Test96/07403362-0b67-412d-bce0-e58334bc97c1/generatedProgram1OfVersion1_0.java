import java.util.Arrays;

public class SortNames {

    public static void main(String[] args) {
        // Example array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Mallory", "bob"};

        // Sort the array using Arrays.sort() - case-sensitive
        Arrays.sort(names); 

        System.out.println("Case-sensitive Sort:");
        printArray(names);

        // Case-insensitive sort using a Comparator (Java 8+ lambda expression)
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println("\nCase-insensitive Sort:");
        printArray(names);

    }

    // Helper function to print the array
    public static void printArray(String[] arr) {
        for (String name : arr) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
