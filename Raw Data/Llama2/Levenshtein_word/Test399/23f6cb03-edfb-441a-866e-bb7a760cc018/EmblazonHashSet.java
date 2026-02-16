import java.util.HashSet;

public class EmblazonHashSet {

    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> hashSet = new HashSet<>();

        // Add some initial elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Element to emblazon (add to the end conceptually - HashSets don't have a guaranteed order)
        String elementToEmblazon = "Grape";

        // Emblazon the element.  For a HashSet, simply adding it is sufficient,
        // as HashSets don't maintain insertion order.  If the element is already
        // present, this operation will be idempotent (no change).
        hashSet.add(elementToEmblazon);

        // Print the updated HashSet
        System.out.println("Updated HashSet: " + hashSet);



        // Example demonstrating adding a duplicate:
        String duplicateElement = "Apple";  // Already in the set
        hashSet.add(duplicateElement); // No effect; HashSet handles duplicates.
        System.out.println("HashSet after adding a duplicate: " + hashSet);


        // If you NEED to maintain order, consider a LinkedHashSet instead.  This
        // example shows how to "emblazon" to the end of a LinkedHashSet,
        // ensuring it's always the last element:

         java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet<>();
         linkedHashSet.add("Red");
         linkedHashSet.add("Green");
         linkedHashSet.add("Blue");

         String elementToEnd = "Violet";

         // Remove and then re-add to put it at the end
         linkedHashSet.remove(elementToEnd); // Remove if already present
         linkedHashSet.add(elementToEnd);      // Add at the end

         System.out.println("LinkedHashSet (maintains order): " + linkedHashSet);


    }
}
