import java.util.HashSet;

public class CheckHashSetEmpty {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Check if the HashSet is empty
        boolean isEmpty = hashSet.isEmpty();

        // Print the result
        if (isEmpty) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }


        // Add some elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");


        // Check if the HashSet is empty again
        isEmpty = hashSet.isEmpty();

        // Print the result
        if (isEmpty) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }
    }
}
