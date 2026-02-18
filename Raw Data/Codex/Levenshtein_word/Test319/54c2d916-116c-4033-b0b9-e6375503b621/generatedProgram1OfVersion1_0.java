public class OddBeforeEven {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        rearrangeOddEven(arr);

        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrangeOddEven(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Find the next even number from the left
            while (arr[left] % 2 != 0 && left < right) {
                left++;
            }

            // Find the next odd number from the right
            while (arr[right] % 2 == 0 && left < right) {
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
