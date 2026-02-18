import java.util.HashSet;

public class HashSetSize {

    public static void main(String[] args) {

        // Create a HashSet of strings
        HashSet<String> colors = new HashSet<>();

        // Add some elements to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red"); // Adding a duplicate - it won't be added twice


        // Get the number of elements in the HashSet using the size() method
        int numberOfElements = colors.size();

        // Print the size of the HashSet
        System.out.println("The HashSet contains " + numberOfElements + " elements.");


        // Demonstrate another way to create and populate a HashSet directly
        HashSet<Integer> numbers = new HashSet<>(java.util.Arrays.asList(1, 2, 3, 4, 5, 5, 5)); // Duplicates are ignored

        System.out.println("The numbers HashSet contains " + numbers.size() + " elements.");


        // Check if the HashSet is empty using isEmpty()
        HashSet<String> emptySet = new HashSet<>();
        if (emptySet.isEmpty()) {
            System.out.println("The emptySet is empty.");
        } else {
            System.out.println("The emptySet is not empty.");
        }


        // Clearing a HashSet - removes all elements
        colors.clear(); 
        System.out.println("After clearing, the colors HashSet contains " + colors.size() + " elements.");


    }
}
