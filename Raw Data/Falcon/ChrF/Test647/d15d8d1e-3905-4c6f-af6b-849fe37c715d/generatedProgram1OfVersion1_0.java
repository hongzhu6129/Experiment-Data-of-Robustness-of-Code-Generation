public class OddEvenRearrange {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array

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

            // Swap the even and odd numbers
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Print the rearranged array
        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


    }
}
