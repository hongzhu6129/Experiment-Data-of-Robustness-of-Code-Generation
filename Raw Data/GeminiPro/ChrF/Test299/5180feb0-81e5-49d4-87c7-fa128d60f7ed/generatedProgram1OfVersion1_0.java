import java.util.Arrays;

public class GreaterThanAverage {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 4, 2, 7, 5, 9, 3};

        // Calculate the average
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        // Print the numbers greater than the average
        System.out.print("Numbers greater than the average (" + average + "): ");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Add a newline for cleaner output


        // Example with a different array (for demonstration)
         int[] numbers2 = {10, 20, 30, 40, 5}; 
         sum = 0;
         for(int number : numbers2){
            sum += number;
         }
         average = sum / numbers2.length;
         System.out.print("Numbers greater than the average (" + average + "): ");
        for (int number : numbers2) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
         System.out.println();

    }
}
