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

        // Method 2: Using enhanced for loop (for-each loop)
        System.out.println("\nIterating using enhanced for loop:");
        for (String element : treeSet) {
            System.out.println(element);
        }


        //Method 3: Using forEach method (Java 8 and later)
        System.out.println("\nIterating using forEach method:");
        treeSet.forEach(element -> System.out.println(element));



        // Example with Integer TreeSet
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(5);
        integerTreeSet.add(2);
        integerTreeSet.add(8);
        integerTreeSet.add(1);

        System.out.println("\nIterating through Integer TreeSet using enhanced for loop:");
        for(Integer num : integerTreeSet) {
            System.out.println(num);
        }
    }
}
