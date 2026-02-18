import java.util.TreeSet;

public class TreeColors {

    public static void main(String[] args) {
        // Create a TreeSet to store colors (Strings).
        // TreeSet automatically maintains elements in sorted order.
        TreeSet<String> treeSet = new TreeSet<>();

        // Add some colors to the TreeSet.
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        treeSet.add("Orange");


        // Print the TreeSet. Elements will be printed in sorted order.
        System.out.println("Colors in the TreeSet:");
        System.out.println(treeSet); 


        //Demonstrate some common TreeSet operations (Optional)

        //Check if a color exists
        System.out.println("Contains 'Green'? " + treeSet.contains("Green"));

        //Get the first (lowest) element
        System.out.println("First color: " + treeSet.first());

        //Get the last (highest) element
        System.out.println("Last color: " + treeSet.last());


        //Remove a color
        treeSet.remove("Yellow"); 
        System.out.println("TreeSet after removing Yellow: " + treeSet);




    }
}
