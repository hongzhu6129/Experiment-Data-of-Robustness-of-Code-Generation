import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        // Example list with duplicates
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 4);

        // Method 1: Using distinct() (preserves original order if the list is ordered)
        List<Integer> distinctNumbers1 = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct numbers (using distinct()): " + distinctNumbers1);


        // Method 2: Using toSet() (doesn't guarantee original order)
        Set<Integer> distinctNumbers2 = numbers.stream()
                .collect(Collectors.toSet()); // Set inherently doesn't allow duplicates

        System.out.println("Distinct numbers (using toSet()): " + distinctNumbers2);



        // Method 3: Using a Collector and toCollection (more control, maintains order)
        List<Integer> distinctNumbers3 = numbers.stream()
                .collect(Collectors.toCollection(() -> new java.util.ArrayList<>(new HashSet<>()))); // intermediate HashSet removes dups

        System.out.println("Distinct numbers (using toCollection()): " + distinctNumbers3);

       // Method 4:  Using filter and a Set to track seen elements (preserves original order if ordered)
        Set<Integer> seen = new HashSet<>(); 
        List<Integer> distinctNumbers4 = numbers.stream()
                .filter(n -> seen.add(n)) // add returns true if element was added (first time seen)
                .collect(Collectors.toList());

        System.out.println("Distinct numbers (using filter and Set): " + distinctNumbers4);

    }
}
