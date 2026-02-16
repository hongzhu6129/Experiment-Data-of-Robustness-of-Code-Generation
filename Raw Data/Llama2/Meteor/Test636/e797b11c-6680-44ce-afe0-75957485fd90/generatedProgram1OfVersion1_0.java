import java.util.ArrayList;
import java.util.List;

public class ColorArrayList {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");


        // Print out the collection using an enhanced for loop (also called a for-each loop)
        System.out.println("Colors in the ArrayList:");
        for (String color : colors) {
            System.out.println(color); 
        }


        // Alternatively, you can print using a standard for loop and .get()
        /*
        System.out.println("\nColors (using standard for loop):");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        */


       // Or print the entire ArrayList at once:
        /*
        System.out.println("\nColors (printing the entire ArrayList):");
        System.out.println(colors);  // This uses the ArrayList's toString() method
        */
    }
}
