import java.util.Arrays;

public class StreamAverage {

    static void streamAvg(float[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        float sum = 0;
        int count = 0;

        for (float num : numbers) {
            sum = getAvg(sum, num, count + 1); 
            count++;
        }

        System.out.println("Average: " + sum);
    }

    static float getAvg(float currentSum, float newNumber, int count) {
         return (currentSum * (count - 1) + newNumber) / count;
    }

    public static void main(String[] args) {
        float[] numbers1 = {10, 20, 30, 40, 50};
        streamAvg(numbers1);  // Output: Average: 30.0

        float[] numbers2 = {2.5f, 4.8f, 1.2f, 6.7f};
        streamAvg(numbers2);  // Output: Average: 3.8

        float[] numbers3 = {}; // Empty array
        streamAvg(numbers3);  // Output: No numbers provided.

         float[] numbers4 = null; // Null array
        streamAvg(numbers4);  // Output: No numbers provided.



    }
}
