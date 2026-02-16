import java.util.TreeSet;

public class TreeSetFirstElement {

    public static void main(String[] args) {

        // Create a TreeSet of strings
        TreeSet<String> treeSet = new TreeSet<>();

        // Add some elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Grape");

        // Print the initial TreeSet
        System.out.println("Initial TreeSet: " + treeSet);


        if (!treeSet.isEmpty()) {
            // Retrieve the first element (smallest)
            String firstElement = treeSet.first();

            // Remove the first element
            treeSet.remove(firstElement);


            System.out.println("Removed first element: " + firstElement);
            System.out.println("TreeSet after removal: " + treeSet);


        } else {
            System.out.println("TreeSet is empty. Cannot retrieve or remove the first element.");
        }



         //Demonstrate pollFirst() as alternative:
         TreeSet<String> treeSet2 = new TreeSet<>();
         treeSet2.add("Red");
         treeSet2.add("Green");
         treeSet2.add("Blue");
        System.out.println("\nTreeSet2 initially: " + treeSet2);

        String polledElement = treeSet2.pollFirst(); // Retrieves and removes
        System.out.println("Polled first element from TreeSet2: " + polledElement);
        System.out.println("TreeSet2 after pollFirst(): " + treeSet2);

        //Handle empty case for pollFirst():
         TreeSet<String> emptySet = new TreeSet<>();
        String polledFromEmpty = emptySet.pollFirst();//Returns null if empty
        System.out.println("\nResult of pollFirst() on an empty set: " + polledFromEmpty);



    }
}

