import java.util.HashSet;

public class HashSetIsEmpty {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Check if the HashSet is empty using isEmpty()
        boolean isEmpty = hashSet.isEmpty();

        if (isEmpty) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }

        // Add some elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Check again if the HashSet is empty
        isEmpty = hashSet.isEmpty();

        if (isEmpty) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }


        // Demonstrating another way to check (less efficient, generally avoid)
        if(hashSet.size() == 0) {
            System.out.println("The HashSet is empty (using size())."); // This won't print now.
        } else {
            System.out.println("The HashSet is not empty (using size()).");
        }


        // Clearing the HashSet
        hashSet.clear();


        // One final check:
         if(hashSet.isEmpty()) {
            System.out.println("The HashSet is now empty again (after clear())."); // This will print.
        } else {
            System.out.println("The HashSet is not empty (after clear()).");
        }

    }
}

