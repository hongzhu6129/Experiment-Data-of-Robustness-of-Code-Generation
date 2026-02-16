import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestLargest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 5, 6);

        if (numbers.size() < 2) {
            System.out.println("List must contain at least two elements.");
            return;
        }

        List<Integer> sortedUniqueNumbers = numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        if (sortedUniqueNumbers.size() < 2) {
            System.out.println("List must contain at least two distinct elements.");
            return;        }

        int secondSmallest = sortedUniqueNumbers.get(1);
        int secondLargest = sortedUniqueNumbers.get(sortedUniqueNumbers.size() - 2);

        System.out.println("Second smallest element: " + secondSmallest);
        System.out.println("Second largest element: " + secondLargest);
    }
}
