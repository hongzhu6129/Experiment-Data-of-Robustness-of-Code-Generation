import java.util.TreeSet;

public class GreenSet {

    public static void main(String[] args) {
        // Create a TreeSet to store colors (Strings). TreeSet maintains elements in sorted order.
        TreeSet<String> greenSet = new TreeSet<>();

        // Add some colors to the set. Duplicates are automatically ignored by TreeSet.
        greenSet.add("Green");
        greenSet.add("Yellow");
        greenSet.add("Red");
        greenSet.add("Blue");
        greenSet.add("Green"); // Adding a duplicate - it won't be added twice

        // Print the TreeSet.  Elements will be printed in their natural sorted order (alphabetical).
        System.out.println(greenSet); 
    }
}
