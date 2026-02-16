public class OddBeforeEven {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 1, 9, 4, 6}; // Example array

        rearrangeOddEven(arr);

        // Print the rearranged array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void rearrangeOddEven(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Find the first even number from the left
            while (left < right && arr[left] % 2 != 0) {
                left++;
            }

            // Find the first odd number from the right
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }

            // Swap the even and odd numbers
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
