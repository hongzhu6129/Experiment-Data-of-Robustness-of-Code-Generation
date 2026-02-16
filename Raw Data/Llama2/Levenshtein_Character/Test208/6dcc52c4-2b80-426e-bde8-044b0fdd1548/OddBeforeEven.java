import java.util.Arrays;

public class OddBeforeEven {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array

        rearrangeOddEven(arr);

        System.out.println(Arrays.toString(arr)); // Print rearranged array
    }

    public static void rearrangeOddEven(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] % 2 != 0 && left < right) { // Find an even number from the left
                left++;
            }

            while (arr[right] % 2 == 0 && left < right) { // Find an odd number from the right
                right--;
            }
            if (left < right) {
                // Swap the even and odd numbers
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
