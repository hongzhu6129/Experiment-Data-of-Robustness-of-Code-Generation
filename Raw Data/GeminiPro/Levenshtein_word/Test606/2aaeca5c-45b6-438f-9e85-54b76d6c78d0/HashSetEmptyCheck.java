import java.util.HashSet;

public class HashSetEmptyCheck {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Check if the HashSet is empty
        if (hashSet.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }

        // Add some elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Check if the HashSet is empty again
        if (hashSet.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }
    }
}
