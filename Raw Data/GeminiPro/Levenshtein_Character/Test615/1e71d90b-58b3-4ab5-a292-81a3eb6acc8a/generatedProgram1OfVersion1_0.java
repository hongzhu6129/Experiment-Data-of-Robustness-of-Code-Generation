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

        // Iterate through the TreeSet using enhanced for loop (for-each loop)
        System.out.println("Iterating using enhanced for loop:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }


        // Iterate using an Iterator (explicitly)
        System.out.println("\nIterating using an Iterator:");
        java.util.Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }



        //Java 8+ forEach  (using a lambda expression):  This is functionally similar to the enhanced for loop.
        System.out.println("\nIterating using forEach:");
        treeSet.forEach(fruit -> System.out.println(fruit));


        //Descending Iteration (because TreeSets are sorted)
        System.out.println("\nIterating in descending order using descendingIterator:");
        java.util.Iterator<String> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            String fruit = descendingIterator.next();
            System.out.println(fruit);
        }



         //Descending Iteration (using descendingSet)
        System.out.println("\nIterating in descending order using descendingSet:");
         for(String fruit : treeSet.descendingSet()){
             System.out.println(fruit);
         }
    }
}
