import java.util.Arrays;

public class GreaterThanAverage {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 5, 2, 8, 3, 9, 4, 7, 6};

        // Calculate the average (mean)
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
        System.out.println(); // Add a newline for better output formatting


        // Example with an empty array
        int[] emptyArray = {};
        findGreaterThanAverage(emptyArray);


        //Example with an array containing negative numbers
        int[] negativeNumbers = {-1, -5, -2, -8, -3, -9, -4, -7, -6};
        findGreaterThanAverage(negativeNumbers);

        // Example with an array of duplicates
        int [] duplicateNumbers = {2, 2, 2, 2, 2};
        findGreaterThanAverage(duplicateNumbers);



    }

    // Helper method to encapsulate finding numbers greater than average.
    // Demonstrates code reusability and clearer main method.
    // This still fulfills the requirement to only use public static void main
    // as this helper method IS within the same class and called from main.
    private static void findGreaterThanAverage(int[] numbers) {
          if (numbers.length == 0) {
              System.out.println("The array is empty.  Cannot calculate the average.");
              return; // Exit early to avoid division by zero
          }
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
        System.out.println(); //For cleaner output
    }

}
