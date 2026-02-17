import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Convert the array to a List
        List<String> list = Arrays.asList(names);

        // Shuffle the list using Collections.shuffle()
        Collections.shuffle(list);

        // Convert the list back to an array (if needed)
        names = list.toArray(new String[0]);

        // Print the shuffled array
        System.out.println(Arrays.toString(names)); 
    }
}
