import java.util.HashSet;
import java.util.Set;

public class RemoveFirstElementGreenSet {

    public static void main(String[] args) {
        // Create a HashSet (representing the "green set")
        Set<String> greenSet = new HashSet<>();

        // Add some elements (you can customize these)
        greenSet.add("Lime");
        greenSet.add("Emerald");
        greenSet.add("Olive");
        greenSet.add("Seafoam");

        // Check if the set is empty.  If it is, there's nothing to retrieve or remove.
        if (greenSet.isEmpty()) {
            System.out.println("The green set is empty.");
            return;  // Exit the program
        }


        // HashSet doesn't guarantee order, so "first" is arbitrary. We'll take any element.
        String firstElement = greenSet.iterator().next();

        // Remove the retrieved element
        greenSet.remove(firstElement);

        // Print the retrieved element and the updated set.
        System.out.println("Retrieved and removed element: " + firstElement);
        System.out.println("Updated green set: " + greenSet);


    }
}
