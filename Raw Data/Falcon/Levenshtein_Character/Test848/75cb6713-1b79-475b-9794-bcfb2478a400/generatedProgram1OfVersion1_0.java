import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print the collection
        System.out.println(colors);


        //Alternatively, you can print each element individually:

        // Using a for-each loop (enhanced for loop):
        /*
        for (String color : colors) {
            System.out.println(color);
        }
        */

        // Using a traditional for loop:
        /*
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        */

    }
}
