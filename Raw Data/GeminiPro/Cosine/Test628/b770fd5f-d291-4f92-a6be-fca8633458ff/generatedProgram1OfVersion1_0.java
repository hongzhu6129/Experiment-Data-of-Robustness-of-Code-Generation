import java.util.HashSet;
import java.util.Set;

public class RemoveLastElementFromGreenSet {

    public static void main(String[] args) {
        // Create a HashSet (Green set is not a standard Java collection, 
        // assuming it refers to a regular HashSet)
        Set<String> greenSet = new HashSet<>();

        // Add some elements to the set
        greenSet.add("apple");
        greenSet.add("banana");
        greenSet.add("orange");
        greenSet.add("grape");

        // Sets don't have a defined order, so there's no guaranteed "last" element.
        //  We need to iterate to get and remove an element.  This example removes 
        // *an* element (not necessarily the one most recently added)

        if (!greenSet.isEmpty()) {
            String lastElement = null;
            for (String element : greenSet) { // Iterate to find *an* element
                lastElement = element; 
            }


            if (lastElement != null) { // Remove the element we found
                greenSet.remove(lastElement);
                System.out.println("Removed element: " + lastElement);

            }
        } else {
            System.out.println("The set is empty.");
        }

        System.out.println("Remaining elements in the set: " + greenSet);



        // Example of using a LinkedHashSet if you *do* need to maintain insertion order:
        Set<String> orderedGreenSet = new java.util.LinkedHashSet<>();
        orderedGreenSet.add("apple");
        orderedGreenSet.add("banana");
        orderedGreenSet.add("orange");
        orderedGreenSet.add("grape");

        if (!orderedGreenSet.isEmpty()) {
            String trulyLast = null;
            for (String element : orderedGreenSet) { // Get last element (order is preserved)
                trulyLast = element;
            }

            if (trulyLast != null) { // Remove the element we found
                orderedGreenSet.remove(trulyLast);
                System.out.println("\nRemoved last element from LinkedHashSet: " + trulyLast);
            }

        }else {
            System.out.println("\nThe LinkedHashSet is empty.");
        }


        System.out.println("Remaining elements in the LinkedHashSet: " + orderedGreenSet);


    }
}
