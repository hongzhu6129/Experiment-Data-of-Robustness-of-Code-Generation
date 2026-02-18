import java.util.TreeSet;

public class IterateTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet of strings
        TreeSet<String> treeSet = new TreeSet<>();

        // Add some elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grape");
        treeSet.add("Mango");

        // Iterate through the TreeSet using a for-each loop
        System.out.println("Iterating through the TreeSet using a for-each loop:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }


        // Iterate using an iterator  (another common way)
        System.out.println("\nIterating through the TreeSet using an iterator:");
        java.util.Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }


        // Java 8+ style using streams and forEach (also very common)
         System.out.println("\nIterating through the TreeSet using Java 8 streams:");
         treeSet.forEach(System.out::println);


    }
}
