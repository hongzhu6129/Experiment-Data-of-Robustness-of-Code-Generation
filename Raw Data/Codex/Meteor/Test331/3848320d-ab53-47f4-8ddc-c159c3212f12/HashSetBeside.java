import java.util.HashSet;

public class HashSetBeside {

    public static void main(String[] args) {
        // Test cases demonstrating "beside" concept (explained below)
        System.out.println("Is set1 beside set2? " + isBeside(createSet(1, 2, 3), createSet(4, 5))); // True
        System.out.println("Is set2 beside set1? " + isBeside(createSet(4, 5), createSet(1, 2, 3))); // True
        System.out.println("Is set3 beside set4? " + isBeside(createSet(1, 2), createSet(2, 3))); // False (intersection)
        System.out.println("Is set5 beside set6? " + isBeside(createSet(1, 2), createSet(1, 2))); // False (equal)
        System.out.println("Is set7 beside set8? " + isBeside(createSet(1, 2, 3), createSet(1, 2, 3, 4))); // False (subset)
        System.out.println("Is set9 beside set10? " + isBeside(createSet(1, 2, 3), createSet())); // True  (Empty set is beside any set)
        System.out.println("Is set11 beside set12? " + isBeside(createSet(), createSet(4, 5))); // True (Empty set is beside any set)
         System.out.println("Is set13 beside set14? " + isBeside(createSet(), createSet())); // True (Two empty sets beside each other)



    }


    // Helper function to create HashSets easily
    private static HashSet<Integer> createSet(Integer... elements) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer element : elements) {
            set.add(element);
        }
        return set;
    }

    /*
     *  "Beside" Definition for HashSets:
     *  Two sets are considered "beside" each other if their intersection is empty.
     *  In other words, they share no common elements.
     */
    private static boolean isBeside(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // intersection now contains common elements
        return intersection.isEmpty();
    }
}
