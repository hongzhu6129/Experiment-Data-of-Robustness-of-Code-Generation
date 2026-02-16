import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetIteration {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grape");
        treeSet.add("Mango");


        // Method 1: Using an Iterator
        System.out.println("Iterating using an Iterator:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println();


        // Method 2: Enhanced for loop (for-each loop)
        System.out.println("Iterating using an enhanced for loop:");
        for (String element : treeSet) {
            System.out.println(element);
        }
        System.out.println();


         //Method 3: Using Java 8 streams and forEach
        System.out.println("Iterating using Java 8 streams and forEach:");
        treeSet.forEach(System.out::println);


    }
}
