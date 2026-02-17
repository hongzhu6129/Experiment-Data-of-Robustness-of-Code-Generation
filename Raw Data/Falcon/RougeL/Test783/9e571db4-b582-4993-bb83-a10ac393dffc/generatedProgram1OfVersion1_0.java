import java.util.TreeSet;

public class IterateTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add some elements
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grape");

        // Iterate through the TreeSet using enhanced for loop (for-each loop)
        System.out.println("Iterating using enhanced for loop:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }


        // Iterate through the TreeSet using an Iterator
        System.out.println("\nIterating using an Iterator:");  // Added a newline for clarity
        java.util.Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }


         //Iterate in descending Order (TreeSet specific)
        System.out.println("\nIterating in descending order using descendingIterator:");
        java.util.Iterator<String> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            String fruit = descendingIterator.next();
            System.out.println(fruit);
        }



    }
}
