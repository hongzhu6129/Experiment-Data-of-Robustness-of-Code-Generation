import java.util.TreeSet;

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

        // Iterate through the TreeSet using a for-each loop (enhanced for loop)
        System.out.println("Iterating using for-each loop:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Iterate through the TreeSet using an iterator
        System.out.println("\nIterating using an iterator:");
        java.util.Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }



        //Descending Iteration (using descendingIterator)
        System.out.println("\nIterating in descending order using descendingIterator:");
        java.util.Iterator<String> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            String fruit = descendingIterator.next();
            System.out.println(fruit);
        }



         // Iterate using forEach (Java 8 and later)
        System.out.println("\nIterating using forEach:");
        treeSet.forEach(System.out::println);


    }
}
