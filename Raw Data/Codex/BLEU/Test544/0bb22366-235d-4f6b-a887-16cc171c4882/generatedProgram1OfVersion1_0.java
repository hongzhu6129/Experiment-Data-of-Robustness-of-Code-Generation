import java.util.HashSet;

public class CheckHashSetEmpty {

    public static void main(String[] args) {
        // Create a new HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Check if the HashSet is empty
        boolean isEmpty = hashSet.isEmpty();

        if (isEmpty) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }


        // Add some elements to the HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");


        // Check again if the HashSet is empty
        isEmpty = hashSet.isEmpty();

        if (isEmpty) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }
    }
}
