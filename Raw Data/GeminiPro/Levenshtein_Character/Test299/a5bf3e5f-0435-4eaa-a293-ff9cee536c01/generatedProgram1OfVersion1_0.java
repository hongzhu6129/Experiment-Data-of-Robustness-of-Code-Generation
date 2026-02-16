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

        // Print the numbers greater than the average
        System.out.println("Numbers greater than the average (" + average + "):");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Newline for cleaner output



        // Example with no elements greater than average (all elements are equal)
         int[] numbers2 = {5,5,5,5,5};
         double sum2 = 0;

        for (int num : numbers2)
        {
            sum2 += num;
        }
        double average2 = sum2/ numbers2.length;
        System.out.println("Numbers greater than average (" + average2 + "):");
        for (int num : numbers2) {
            if (num > average2)
            {
                System.out.print(num + " ");
            }

        }
        System.out.println();

        // Example with an empty array.
        int[] numbers3 = {};

        if(numbers3.length == 0){
            System.out.println("The array is empty, therefore no average can be calculated and no numbers can be determined to be greater than the average.");
            return; //Exit early since no calculations can be done on empty array.
        }


         double sum3 = 0;

        for (int num : numbers3)
        {
            sum3 += num;
        }
        double average3 = sum3/ numbers3.length;
        System.out.println("Numbers greater than average (" + average3 + "):");
        for (int num : numbers3) {
            if (num > average3)
            {
                System.out.print(num + " ");
            }

        }
        System.out.println();

    }
}
