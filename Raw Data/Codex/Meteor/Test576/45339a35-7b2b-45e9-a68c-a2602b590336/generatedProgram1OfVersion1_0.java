import java.util.Arrays;
import java.util.List;

public class AverageOfIntegers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = numbers.stream()
                .mapToInt(Integer::intValue) // Convert Stream<Integer> to IntStream
                .average()                 // Calculate the average
                .orElse(0.0);            // Handle the case where the list is empty


        System.out.println("Average: " + average);


        // Example with an empty list:
        List<Integer> emptyList = Arrays.asList();

        double emptyAverage = emptyList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);  // Returns 0.0 because the list is empty

        System.out.println("Average of empty list: " + emptyAverage);



         // Example with a list that might contain nulls (handle nulls safely):
         List<Integer> numbersWithNulls = Arrays.asList(1, 2, null, 4, 5, null, 7, 8);

         double averageWithNulls = numbersWithNulls.stream()
                .filter(num -> num != null) // Filter out null values
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average with null handling: " + averageWithNulls);



    }
}
