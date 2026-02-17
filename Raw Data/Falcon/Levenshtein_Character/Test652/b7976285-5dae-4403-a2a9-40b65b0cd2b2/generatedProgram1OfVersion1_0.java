import java.util.HashSet;
import java.util.Set;

public class RemoveFromGreenSet {

    public static void main(String[] args) {
        // Create a HashSet (representing the "green set")
        Set<String> greenSet = new HashSet<>();

        // Add some elements
        greenSet.add("apple");
        greenSet.add("banana");
        greenSet.add("grape");
        greenSet.add("kiwi");

        // Element to remove
        String elementToRemove = "banana";

        System.out.println("Original Green Set: " + greenSet);

        // Remove the element
        greenSet.remove(elementToRemove); // HashSet's remove handles nulls gracefully

        System.out.println("Green Set after removing '" + elementToRemove + "': " + greenSet);


        // Example demonstrating removing a non-existent element:
        String nonExistentElement = "orange";
        greenSet.remove(nonExistentElement); // No error; simply does nothing
        System.out.println("Green Set after attempting to remove '" + nonExistentElement + "': " + greenSet);


        // Example demonstrating removing null (if it exists)
        greenSet.add(null);  // Add null to the set
        System.out.println("Green Set with null added: " + greenSet);
        greenSet.remove(null);
        System.out.println("Green Set after removing null: " + greenSet);


    }
}
