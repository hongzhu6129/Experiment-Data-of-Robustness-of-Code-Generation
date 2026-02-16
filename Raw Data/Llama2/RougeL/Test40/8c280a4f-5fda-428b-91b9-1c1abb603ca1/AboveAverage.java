public class AboveAverage {

    public static void main(String[] args) {
        // Example array of numbers
        int[] numbers = {1, 5, 2, 8, 3, 9, 4, 7, 6, 10};

        // Calculate the sum of the numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Print the numbers greater than the average
        System.out.println("Numbers greater than the average (" + average + "):");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Add a newline for cleaner output
    }
}
