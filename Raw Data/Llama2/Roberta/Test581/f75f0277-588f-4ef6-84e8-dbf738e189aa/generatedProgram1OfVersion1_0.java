import java.util.HashSet;

public class AppendToHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add some initial elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Element to append
        String elementToAppend = "Grape";

        // Append the element.  HashSet's add() method handles duplicates;
        // if the element is already present, it won't be added again.
        hashSet.add(elementToAppend);


        // Print the updated HashSet
        System.out.println("Updated HashSet: " + hashSet);


        // Example with an integer HashSet
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int numberToAdd = 4;
        numbers.add(numberToAdd);
        System.out.println("Updated Integer HashSet: " + numbers);

       // Example demonstrating that duplicates are not added
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        String duplicateColor = "Red"; // Already in the set
        colors.add(duplicateColor); // This won't have any effect

        System.out.println("HashSet with duplicate attempt: " + colors);


    }
}
