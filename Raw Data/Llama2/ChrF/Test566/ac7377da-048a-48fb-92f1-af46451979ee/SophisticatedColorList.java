import java.util.ArrayList;
import java.util.List;

public class SophisticatedColorList {

    public static void main(String[] args) {
        // Create a sophisticated list (ArrayList in this case)
        List<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Magenta");
        colors.add("Cyan");
        colors.add("Indigo");
        colors.add("Violet");
        colors.add("Orange");
        colors.add("Chartreuse"); // A sophisticated color!


        // Print out the collection (various ways)

        // 1. Simple loop:
        System.out.println("Colors (using simple loop):");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();

        // 2. Using toString():
        System.out.println("Colors (using toString()):");
        System.out.println(colors); // ArrayList's toString() is already well-formatted
        System.out.println();



        // 3. Enhanced loop with index (for more control over formatting):
        System.out.println("Colors (using enhanced loop with index):");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println((i + 1) + ". " + colors.get(i)); // Numbered list
        }
        System.out.println();


        // 4. Java 8+ streams and forEach: (functional approach)
        System.out.println("Colors (using streams and forEach):");
        colors.stream().forEach(System.out::println);  // Concise


    }
}
