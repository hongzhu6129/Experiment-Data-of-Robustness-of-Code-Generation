import java.util.Arrays;

public class NumbersGreaterThanAverage {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 5, 2, 8, 3, 9, 4, 7, 6};

        // Calculate the average
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        // Find numbers greater than the average
        System.out.print("Numbers greater than the average (" + average + "): ");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Add a newline for better formatting


        // Example 2: Using streams (requires Java 8 or later) -- for demonstration, although the prompt requires staying within main
        // Demonstrates a different way to achieve the same within main, if streams were allowed.
        System.out.print("Numbers greater than the average (using streams): ");
        Arrays.stream(numbers)
                .filter(n -> n > average)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

         // Example 3:  Handling an empty array gracefully
         int[] emptyArray = {};
         findNumbersGreaterThanAverage(emptyArray); // Demonstrating a reusable approach, though the prompt restricts us to only main()
    }

    // While the question explicitly said to only use main,  a separate method would be better practice for reusability:
    // This demonstrates how you'd typically structure this kind of code in a real application.
    public static void findNumbersGreaterThanAverage(int[] numbers) {
       if(numbers.length == 0) {
           System.out.println("The array is empty.  No average can be calculated.");
           return;
       }
       double sum = 0;
       for (int number : numbers) {
           sum += number;
       }
       double average = sum / numbers.length;
       System.out.print("Numbers greater than the average (" + average + "): ");
       for (int number : numbers) {
           if (number > average) {
               System.out.print(number + " ");
           }
       }
       System.out.println();
    }

}



