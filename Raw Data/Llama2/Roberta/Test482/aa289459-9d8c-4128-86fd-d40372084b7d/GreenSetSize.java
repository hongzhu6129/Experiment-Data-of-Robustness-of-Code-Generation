import java.util.HashSet;
import java.util.Set;

public class GreenSetSize {

    public static void main(String[] args) {
        // Create a HashSet to represent the green set.
        Set<String> greenSet = new HashSet<>();

        // Add some elements (representing green items, for example).
        greenSet.add("apple");
        greenSet.add("lime");
        greenSet.add("grass");
        greenSet.add("spinach");
        greenSet.add("emerald");  //  A green gem

        // Get the number of elements in the green set.
        int numberOfElements = greenSet.size();

        // Print the size.
        System.out.println("The number of elements in the green set is: " + numberOfElements);
    }
}
