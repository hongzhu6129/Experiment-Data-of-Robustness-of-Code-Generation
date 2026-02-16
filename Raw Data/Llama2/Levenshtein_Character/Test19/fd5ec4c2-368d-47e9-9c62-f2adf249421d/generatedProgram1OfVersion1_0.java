import java.util.ArrayList;
import java.util.Collections;

public class MixColors {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");


        // Mix the colors (shuffle the ArrayList)
        Collections.shuffle(colors);


        // Print out the mixed colors
        System.out.println(colors);


    }
}
