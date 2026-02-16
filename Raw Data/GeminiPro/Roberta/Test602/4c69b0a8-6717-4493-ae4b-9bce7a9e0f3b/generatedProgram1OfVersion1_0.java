import java.util.HashSet;

public class AddToEndHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add some initial elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Element to be added to the end (Note: HashSet doesn't have a defined order)
        String elementToAdd = "Grape";


        // HashSet doesn't guarantee insertion order, so "adding to the end" isn't directly possible.
        //  However, we can add the element. The output when iterating may or may not show
        // it as the last element.
        hashSet.add(elementToAdd); 


        // Print the HashSet to see if the element has been added (order not guaranteed)
        System.out.println("HashSet after adding 'Grape': " + hashSet);


        // If you *need* a specific order, use a LinkedHashSet:

        java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grape"); // Added to the end, maintaining insertion order.

        System.out.println("LinkedHashSet after adding 'Grape': " + linkedHashSet);


    }
}
