import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArrayList {

    public static void main(String[] args) {

        // 1. Create an ArrayList
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original ArrayList: " + colors);


        // 2. Shuffle the ArrayList using Collections.shuffle()
        Collections.shuffle(colors); 

        System.out.println("Shuffled ArrayList: " + colors);



        // Example with integers:
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("\nOriginal Integer List: " + numbers);

        Collections.shuffle(numbers);

        System.out.println("Shuffled Integer List: " + numbers);



        // 3. Shuffling with a specific random number generator (for reproducible shuffles)
        //  This is useful if you need the same shuffle order multiple times given the same seed.

        // Create a Random object with a seed
        // java.util.Random random = new java.util.Random(123); // Use any seed value
        // Collections.shuffle(colors, random);


        // Further exploration (not using just main method for brevity):
        // You could create a separate method like:
        // public static <T> void shuffleList(List<T> list) {
        //     Collections.shuffle(list);
        // }
        // Then call it from main as shuffleList(colors);, shuffleList(numbers);, etc. 
        // This is generally good practice for larger programs, promoting code reusability.


    }
}
