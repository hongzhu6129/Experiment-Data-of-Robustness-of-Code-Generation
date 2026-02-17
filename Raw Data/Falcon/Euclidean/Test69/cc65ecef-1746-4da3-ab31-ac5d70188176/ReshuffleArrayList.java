import java.util.ArrayList;
import java.util.Collections;

public class ReshuffleArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + colors);

        // Shuffle the ArrayList using Collections.shuffle()
        Collections.shuffle(colors);

        // Print the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + colors);


        // Example with an ArrayList of integers:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original Integer ArrayList: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("Shuffled Integer ArrayList: " + numbers);

    }
}
