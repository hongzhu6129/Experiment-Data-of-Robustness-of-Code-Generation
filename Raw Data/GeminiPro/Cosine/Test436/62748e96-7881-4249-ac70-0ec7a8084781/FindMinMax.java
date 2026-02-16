import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMinMax {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 2, 5, 8, 15, 3);

        // Find the maximum value
        Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());

        if (max.isPresent()) {
            System.out.println("Maximum value: " + max.get());
        } else {
            System.out.println("List is empty.");
        }

        // Find the minimum value
        Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());

        if (min.isPresent()) {
            System.out.println("Minimum value: " + min.get());
        } else {
            System.out.println("List is empty.");
        }


        // More concise version (Java 8+): using orElseThrow for empty lists
        try {
            int maxValue = numbers.stream().max(Integer::compare).orElseThrow();  // or .max(Comparator.naturalOrder())
            int minValue = numbers.stream().min(Integer::compare).orElseThrow(); // or .min(Comparator.naturalOrder())

            System.out.println("Maximum value (concise): " + maxValue);
            System.out.println("Minimum value (concise): " + minValue);


        } catch (java.util.NoSuchElementException e) { // Handle empty list
            System.out.println("The list is empty, cannot find min/max.");
        }


    }
}
