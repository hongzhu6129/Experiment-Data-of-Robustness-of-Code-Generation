import java.util.HashSet;

public class AppendToHashSet {

    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> hashSet = new HashSet<>();

        // Add some initial elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Element to append
        String elementToAppend = "Grape";

        // Append the element (HashSet's add method handles duplicates gracefully)
        hashSet.add(elementToAppend);


        // Print the updated HashSet
        System.out.println("Updated HashSet: " + hashSet); 
    }
}
