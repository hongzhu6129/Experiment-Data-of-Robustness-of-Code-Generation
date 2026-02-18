import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Create a TreeSet of Strings. TreeSet automatically stores elements in sorted order.
        TreeSet<String> colors = new TreeSet<>();

        // Add some colors to the TreeSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print out the TreeSet
        System.out.println("Colors in the TreeSet:");
        System.out.println(colors); 
    }
}
