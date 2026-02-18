import java.util.Arrays;
import java.util.List;

public class AverageOfIntegers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = numbers.stream()
                .mapToInt(Integer::intValue) // Convert Integer objects to int primitives
                .average()
                .orElse(0.0); // Handle the case where the list is empty

        System.out.println("The average is: " + average);


        // Example with an empty list:
        List<Integer> emptyList = Arrays.asList();

        double emptyAverage = emptyList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("The average of the empty list is: " + emptyAverage);



        // Example with a list containing null:  (Important to handle potential NullPointerExceptions)

        List<Integer> listWithNull = Arrays.asList(1, 2, null, 4, 5);


        double averageWithNullHandling = listWithNull.stream()
                .filter(num -> num != null) // Filter out null values
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);


        System.out.println("The average with null handling is: " + averageWithNullHandling);




    }
}
