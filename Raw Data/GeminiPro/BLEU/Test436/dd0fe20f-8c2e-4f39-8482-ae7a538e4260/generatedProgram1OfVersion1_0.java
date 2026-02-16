import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinMax {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 5, 6);

        // Find the maximum value
        Integer max = numbers.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .orElse(null); // Handle the case where the list is empty

        // Find the minimum value
        Integer min = numbers.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .orElse(null); // Handle the case where the list is empty


        if (max != null && min != null) { // Check if the list was not empty
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        } else {
            System.out.println("The list is empty.");
        }


        // Example with an empty list:
         List<Integer> emptyList = Arrays.asList();

        Integer maxEmpty = emptyList.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .orElse(null);

        Integer minEmpty = emptyList.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .orElse(null);


        if (maxEmpty != null && minEmpty != null) {
            System.out.println("Maximum value (empty list): " + maxEmpty);
            System.out.println("Minimum value (empty list): " + minEmpty);
        } else {
            System.out.println("The empty list is empty (as expected).");
        }




    }
}
