import java.util.TreeSet;

public class TreeSetLessThanSeven {

    public static void main(String[] args) {
        // Create a TreeSet of Integer objects
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some numbers to the TreeSet
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(7);
        treeSet.add(12);
        treeSet.add(3);

        // Find and print numbers less than 7
        System.out.println("Numbers less than 7 in the TreeSet:");

        // Method 1: Using headSet (most efficient for TreeSets)
        for (Integer num : treeSet.headSet(7)) { // headSet(7) excludes 7 itself
            System.out.print(num + " ");
        }
        System.out.println();  // Add a newline for clarity


        // Method 2: Enhanced for loop with a conditional check (works for any collection):
        System.out.println("Numbers less than 7 (using enhanced for loop):");
        for (Integer num : treeSet) {
            if (num < 7) {
                System.out.print(num + " ");
            }
        }
        System.out.println();



        // Method 3:  Java Streams API (Java 8+):  Demonstrative, but less efficient than headSet() for sorted sets.
        System.out.println("Numbers less than 7 (using Java Streams):");
        treeSet.stream()
               .filter(num -> num < 7)
               .forEach(num -> System.out.print(num + " "));
        System.out.println();

    }
}
