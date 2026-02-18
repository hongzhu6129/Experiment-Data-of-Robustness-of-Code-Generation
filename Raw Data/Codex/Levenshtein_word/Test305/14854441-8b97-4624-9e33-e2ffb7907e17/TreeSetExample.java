import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Create a TreeSet to store colors (Strings)
        TreeSet<String> colors = new TreeSet<>();

        // Add some colors to the TreeSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print out the TreeSet (elements are sorted automatically)
        System.out.println(colors); 
    }
}
