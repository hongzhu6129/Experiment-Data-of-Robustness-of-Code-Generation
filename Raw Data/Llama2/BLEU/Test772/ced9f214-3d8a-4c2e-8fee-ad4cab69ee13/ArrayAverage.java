import java.util.Arrays;

public class ArrayAverage {

    static void streamAvg(float[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        float sum = Arrays.stream(numbers).sum();
        float average = getAvg(sum, 0, numbers.length);  // 0 is a placeholder, not used
        System.out.println("Average: " + average);


    }

    static float getAvg(float sum, float ignored, int count) {
        if (count == 0) {
            return 0; // Avoid division by zero
        }
        return sum / count;
    }

    public static void main(String[] args) {
        float[] numbers1 = {10, 20, 30, 40, 50};
        streamAvg(numbers1);

        float[] numbers2 = {5, 15, 25, 35, 45, 55};
        streamAvg(numbers2);

        float[] emptyArray = {};
        streamAvg(emptyArray);

        float[] nullArray = null;
        streamAvg(nullArray);

       
    }
}
