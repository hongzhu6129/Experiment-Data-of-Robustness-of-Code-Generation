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

        // Method 2: Enhanced for loop (for-each loop)
        System.out.println("\nIterating using an enhanced for loop:");
        for (String element : treeSet) {
            System.out.println(element);
        }


        //Method 3: Using forEach method (Java 8 and later) with lambda
        System.out.println("\nIterating using forEach with lambda:");
        treeSet.forEach(element -> System.out.println(element));



        //Method 4: Using  forEach method (Java 8 and later) with method reference
        System.out.println("\nIterating using forEach with method reference:");
        treeSet.forEach(System.out::println);
    }
}
