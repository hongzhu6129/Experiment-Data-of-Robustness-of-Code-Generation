import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Create a TreeSet of Strings.  String is the generic type parameter.
        TreeSet<String> colors = new TreeSet<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print the TreeSet (elements will be sorted alphabetically)
        System.out.println(colors); 
    }
}
