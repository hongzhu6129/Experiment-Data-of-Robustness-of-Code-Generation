import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        // Example list with duplicates
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 5));

        // Remove duplicates using streams and collect to a new list
        List<Integer> distinctNumbers = numbers.stream()
                .distinct() // The distinct() method keeps only unique elements
                .collect(Collectors.toList());


        System.out.println("Original list: " + numbers);
        System.out.println("List without duplicates: " + distinctNumbers);


        // If you want to modify the original list directly (in-place removal), it's a bit trickier with streams in a simple way.
        //  It's generally recommended to create a new list as shown above for removing duplicates with streams, 
        // or use a traditional loop approach if in-place modification is essential.  An example of in-place removal using a loop is below:


        // In-place removal using a traditional loop (alternative approach):
        List<String> strings = new ArrayList<>(Arrays.asList("a", "b", "c", "b", "a", "d"));
        for (int i = 0; i < strings.size(); i++) {
            for (int j = i + 1; j < strings.size(); j++) {
                if (strings.get(i).equals(strings.get(j))) {
                    strings.remove(j);
                    j--; // Decrement j to account for the removed element
                }
            }
        }
        System.out.println("Original string list: " +  Arrays.asList("a", "b", "c", "b", "a", "d"));
        System.out.println("String list after in-place removal: " + strings);

    }
}
