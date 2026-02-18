import java.util.ArrayList;
import java.util.List;

public class AddColorsToList {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print out the collection using a for-each loop
        System.out.println("Colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }


         // Alternatively, you could print using the toString() method which is implicitly called :
         // System.out.println(colors);

        // Or a more traditional for loop and get():
        /*
        System.out.println("Colors in the list (using traditional for loop):");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        */


    }
}
