import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        // Create a TreeSet to store strings (in this case, colors).
        // TreeSets automatically store elements in their natural order (alphabetical for strings).
        TreeSet<String> colors = new TreeSet<>();

        // Add some colors to the TreeSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print the TreeSet.  Notice the sorted order.
        System.out.println("Colors in the TreeSet (sorted order): " + colors);


        // Some other useful TreeSet operations:

        // Check if a color is present:
        boolean containsRed = colors.contains("Red");
        System.out.println("Contains Red? " + containsRed);


        // Get the first (smallest) element:
        String firstColor = colors.first();
        System.out.println("First color: " + firstColor);

        // Get the last (largest) element:
        String lastColor = colors.last();
        System.out.println("Last color: " + lastColor);


        // Remove a color:
        colors.remove("Green");
        System.out.println("Colors after removing Green: " + colors);



        // Iterate through the TreeSet (in sorted order):
        System.out.println("Iterating through the TreeSet:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Get the size of the TreeSet:
        int size = colors.size();
        System.out.println("Size of the TreeSet: " + size);



        // Clear the TreeSet (remove all elements):
        colors.clear();
        System.out.println("TreeSet after clearing: " + colors);


    }
}
