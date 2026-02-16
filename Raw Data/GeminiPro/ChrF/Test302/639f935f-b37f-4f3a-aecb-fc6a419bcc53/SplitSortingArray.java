public class SplitSortingArray {

    public static int[] split_sorting_array(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Find a negative number from the left
            while (left < right && arr[left] < 0) {
                left++;
            }

            // Find a positive number from the right
            while (left < right && arr[right] >= 0) {
                right--;
            }

            // Swap if necessary
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return arr;
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        int[] result1 = split_sorting_array(arr1);
        System.out.print("Result 1: ");
        for (int num : result1) {
            System.out.print(num + " "); // Expected: -10 -8 -6 -4 -2 9 7 5 3 1 (or similar ordering)
        }
        System.out.println();


        int[] arr2 = {-1, 2, -3, 4, -5, 6};
        int[] result2 = split_sorting_array(arr2);
        System.out.print("Result 2: ");
        for (int num : result2) {
            System.out.print(num + " "); // Expected: -5 -3 -1 4 2 6 (or similar ordering)
        }
        System.out.println();


        int[] arr3 = {1, 2, 3, 4, 5};
        int[] result3 = split_sorting_array(arr3);
        System.out.print("Result 3: ");
        for (int num : result3) {
            System.out.print(num + " "); // Expected: 1 2 3 4 5
        }
        System.out.println();

        int[] arr4 = {-1,-2,-3,-4,-5};
        int[] result4 = split_sorting_array(arr4);
        System.out.print("Result 4: ");
        for (int num : result4) {
            System.out.print(num + " "); // Expected: -1 -2 -3 -4 -5
        }
        System.out.println();



    }
}
