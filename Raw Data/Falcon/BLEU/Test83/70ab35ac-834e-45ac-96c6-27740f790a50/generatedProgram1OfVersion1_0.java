import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Create a TreeSet to store colors (Strings). TreeSets automatically maintain sorted order.
        TreeSet<String> colors = new TreeSet<>();

        // Add some colors to the TreeSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print the entire TreeSet (in sorted order)
        System.out.println("Colors in the TreeSet:");
        System.out.println(colors); 

        // Check if "Green" is present and print it if it is
         if (colors.contains("Green")) {
             System.out.println("\nGreen is present in the TreeSet.");
         }

    }
}
