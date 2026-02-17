import java.util.Arrays;

public class GreaterThanAverage {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 4, 2, 7, 5, 9, 3, 6, 8}; 

        // Calculate the average
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        // Find and print numbers greater than the average
        System.out.println("Numbers greater than the average (" + average + "):");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Add a newline for better formatting



        // Another example using streams (requires Java 8 or later):

        int[] numbers2 = {12, 5, 18, 3, 21, 8};

        double average2 = Arrays.stream(numbers2).average().orElse(0); // Handles empty arrays gracefully

        System.out.println("Numbers greater than the average (" + average2 + ") using streams:");
        Arrays.stream(numbers2)
              .filter(n -> n > average2)
              .forEach(n -> System.out.print(n + " "));

        System.out.println();



    }
}
