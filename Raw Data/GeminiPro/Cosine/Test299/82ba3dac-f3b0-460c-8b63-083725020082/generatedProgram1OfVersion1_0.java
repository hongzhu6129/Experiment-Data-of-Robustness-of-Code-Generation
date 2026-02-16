import java.util.Arrays;

public class GreaterThanAverage {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 17, 7, 25, 3, 100};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.println("The average of the said array is: " + average);

        System.out.print("The numbers in the said array that are greater than the average are: ");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Add a newline for cleaner output
    }
}
