import java.util.TreeSet;

public class TreeSetClone {

    public static void main(String[] args) {

        // Create a TreeSet
        TreeSet<String> originalTreeSet = new TreeSet<>();

        // Add some elements to the original TreeSet
        originalTreeSet.add("Apple");
        originalTreeSet.add("Banana");
        originalTreeSet.add("Orange");
        originalTreeSet.add("Grape");

        // Method 1: Using the constructor
        TreeSet<String> clonedTreeSet1 = new TreeSet<>(originalTreeSet);


        // Method 2: Using addAll() method
        TreeSet<String> clonedTreeSet2 = new TreeSet<>();
        clonedTreeSet2.addAll(originalTreeSet);


        // Print the original and cloned TreeSets
        System.out.println("Original TreeSet: " + originalTreeSet);
        System.out.println("Cloned TreeSet (Constructor): " + clonedTreeSet1);
        System.out.println("Cloned TreeSet (addAll): " + clonedTreeSet2);


        // Demonstrate that changes to the clone don't affect the original
        clonedTreeSet1.remove("Banana");
        System.out.println("\nAfter removing \"Banana\" from clonedTreeSet1:");
        System.out.println("Original TreeSet: " + originalTreeSet);
        System.out.println("Cloned TreeSet (Constructor): " + clonedTreeSet1);


         // Demonstrate immutability by attempting modification using an iterator:
        try {
            for (String fruit : clonedTreeSet2) {
                if (fruit.equals("Orange")) {
                    clonedTreeSet2.remove(fruit); // This will throw a ConcurrentModificationException
                }
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("\nCaught ConcurrentModificationException: Cannot modify TreeSet while iterating.");
        }
        System.out.println("Cloned TreeSet (addAll): " + clonedTreeSet2);

         // Safe modification during iteration: use an iterator's remove() method

          System.out.println("\nDemonstrating safe removal during iteration:");
          var iterator = clonedTreeSet2.iterator();
          while (iterator.hasNext()) {
              String fruit = iterator.next();
              if (fruit.equals("Orange")) {
                  iterator.remove(); // This is the safe way to remove during iteration
              }
          }

          System.out.println("Cloned TreeSet (addAll, after safe removal): " + clonedTreeSet2); 




    }
}
