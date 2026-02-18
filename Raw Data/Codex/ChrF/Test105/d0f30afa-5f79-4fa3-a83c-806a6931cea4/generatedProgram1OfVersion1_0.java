import java.util.Arrays;
import java.util.List;

public class AverageOfIntegers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = numbers.stream()
                .mapToInt(Integer::intValue) // Convert Integer objects to int primitives
                .average() // Calculate the average
                .orElse(0.0); // Handle the case where the list is empty

        System.out.println("Average: " + average);


        // Example with an empty list:
        List<Integer> emptyList = Arrays.asList();

        double emptyListAverage = emptyList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average of empty list: " + emptyListAverage);



        // Example with null values in the list (requires Java 9 or later)
         List<Integer> numbersWithNulls = Arrays.asList(1, 2, null, 4, 5, null, 7, 8, 9, 10);

        double averageWithNullHandling = numbersWithNulls.stream()
                .mapToInt(Integer::intValue)  // Auto-unboxing would throw NullPointerException on null values
                .average()
                .orElse(0.0); // or orElseThrow if you want an exception.



        double averageWithNullsFiltered = numbersWithNulls.stream()
                .filter(num -> num != null)  //Filter out null values
                .mapToInt(Integer::intValue)
                .average().orElse(0.0);

        System.out.println("Average with null handling (nulls contribute to count): " + averageWithNullHandling);
        System.out.println("Average with nulls filtered: " + averageWithNullsFiltered);


    }
}
