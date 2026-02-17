import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestLargest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 8, 3, 9, 4, 7, 6);

        if (numbers.size() < 2) {
            System.out.println("List must contain at least two elements.");
            return;
        }


        List<Integer> sortedNumbers = numbers.stream()
                .distinct() // Remove duplicates
                .sorted()
                .collect(Collectors.toList());

        if (sortedNumbers.size() < 2) {
             System.out.println("List must contain at least two distinct elements.");
            return;
        }

        int secondSmallest = sortedNumbers.get(1);
        int secondLargest = sortedNumbers.get(sortedNumbers.size() - 2);

        System.out.println("Second smallest element: " + secondSmallest);
        System.out.println("Second largest element: " + secondLargest);



         //Alternative for finding second largest (more efficient for very large lists, avoids complete sorting):
        // Requires Java 17+ or backporting of Collectors.teeing

        //Integer secondLargestAlt = numbers.stream().collect(Collectors.teeing(
        //        Collectors.maxBy(Integer::compare),
        //        Collectors.minBy(Integer::compare),
        //        (max, min) -> numbers.stream()
        //                .filter(n -> !n.equals(max.orElse(Integer.MIN_VALUE)))
        //                .max(Integer::compare).orElse(min.orElse(Integer.MAX_VALUE))));


        //System.out.println("Second largest element (alternative): " + secondLargestAlt);




    }
}
