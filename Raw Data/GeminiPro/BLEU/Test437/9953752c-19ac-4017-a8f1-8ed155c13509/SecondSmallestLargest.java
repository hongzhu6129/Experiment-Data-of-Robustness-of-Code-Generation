import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestLargest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 8, 3, 9, 4, 7, 6);

        // Find the second smallest element
        int secondSmallest = numbers.stream()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(Integer.MIN_VALUE); // Default value if no second smallest exists


        // Find the second largest element
        int secondLargest = numbers.stream()
                .sorted(Collectors.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(Integer.MAX_VALUE); // Default value if no second largest exists


        if (secondSmallest != Integer.MIN_VALUE ) {
            System.out.println("Second smallest: " + secondSmallest);
        } else {
            System.out.println("Second smallest element does not exist (less than two distinct elements in the list).");
        }

        if (secondLargest != Integer.MAX_VALUE) {
            System.out.println("Second largest: " + secondLargest);
        } else {
            System.out.println("Second largest element does not exist (less than two distinct elements in the list).");
        }
    }
}
