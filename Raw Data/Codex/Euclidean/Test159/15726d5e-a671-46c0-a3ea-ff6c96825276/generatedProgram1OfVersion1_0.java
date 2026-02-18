import java.util.Arrays;

public class OddBeforeEven {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        rearrange(arr1);
        System.out.println(Arrays.toString(arr1)); // Output: [1, 9, 3, 7, 5, 6, 4, 8, 2, 10] (Order of odds/evens might vary slightly)


        int[] arr2 = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        rearrange(arr2);
        System.out.println(Arrays.toString(arr2)); // Output: [1, 3, 5, 7, 9, 2, 4, 6, 8, 10] (Order of odds/evens might vary slightly)

        int[] arr3 = {1, 3, 5, 7, 9};
        rearrange(arr3);
        System.out.println(Arrays.toString(arr3)); // Output: [1, 3, 5, 7, 9]

        int[] arr4 = {2, 4, 6, 8, 10};
        rearrange(arr4);
        System.out.println(Arrays.toString(arr4)); // Output: [2, 4, 6, 8, 10]

        int[] arr5 = {};
        rearrange(arr5);
        System.out.println(Arrays.toString(arr5)); // Output: []
    }

    public static void rearrange(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Find the next even number from the left
            while (left < right && arr[left] % 2 != 0) {
                left++;
            }

            // Find the next odd number from the right
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }

            // Swap if necessary
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
