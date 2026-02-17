import java.util.TreeSet;

public class CloneTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> originalTreeSet = new TreeSet<>();

        // Add elements to the original TreeSet
        originalTreeSet.add("Apple");
        originalTreeSet.add("Banana");
        originalTreeSet.add("Orange");
        originalTreeSet.add("Grape");

        // Clone the TreeSet using the constructor
        TreeSet<String> clonedTreeSet = new TreeSet<>(originalTreeSet);


        // Print the original and cloned TreeSets to verify
        System.out.println("Original TreeSet: " + originalTreeSet);
        System.out.println("Cloned TreeSet: " + clonedTreeSet);



        //Demonstrate that changes to the cloned set don't affect the original
        clonedTreeSet.remove("Banana");

        System.out.println("Original TreeSet after modification of clone: " + originalTreeSet);
        System.out.println("Cloned TreeSet after modification : " + clonedTreeSet);
    }
}
