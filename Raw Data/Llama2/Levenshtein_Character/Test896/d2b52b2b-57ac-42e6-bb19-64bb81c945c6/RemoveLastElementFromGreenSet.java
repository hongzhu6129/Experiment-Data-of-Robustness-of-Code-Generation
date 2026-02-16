import java.util.HashSet;
import java.util.Set;

public class RemoveLastElementFromGreenSet {

    public static void main(String[] args) {
        // Create a HashSet (Green set is not a standard Java collection, so using HashSet)
        Set<String> greenSet = new HashSet<>();

        // Add some elements
        greenSet.add("Lime");
        greenSet.add("Emerald");
        greenSet.add("Olive");
        greenSet.add("Forest");

        // Retrieving and removing the last element is tricky with HashSet because it doesn't inherently have an order.
        // We need to convert to an ordered collection like an ArrayList.
        if (!greenSet.isEmpty()) { // Check if the set is empty before proceeding
            String lastElement = null;
            for (String element : greenSet) { // Iterate to find the "last" added element (which is not truly deterministic in a HashSet)
                lastElement = element; // This will end up with the element that happened to be iterated through last
            }


            System.out.println("Original Set: " + greenSet);

            if (lastElement != null) {
                greenSet.remove(lastElement);
                System.out.println("Removed element: " + lastElement);
                System.out.println("Set after removal: " + greenSet);
            }

        } else {
            System.out.println("The set is empty.");
        }
    }
}
