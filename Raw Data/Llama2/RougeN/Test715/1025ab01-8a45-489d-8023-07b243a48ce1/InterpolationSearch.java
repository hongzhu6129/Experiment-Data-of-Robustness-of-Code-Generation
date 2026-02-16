import java.util.Arrays;

class InterpolationSearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;

        int index = Interpolation_search(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }


        arr = new int[]{1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59}; //Example with prime numbers
        target = 43;
        index = Interpolation_search(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        //Example not found:
         arr = new int[]{1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59}; 
        target = 42; // Not in the array
        index = Interpolation_search(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int Interpolation_search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            // Interpolation formula to estimate the position
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == target) {
                return pos; // Element found
            } else if (arr[pos] < target) {
                low = pos + 1; // Search in the right subarray
            } else {
                high = pos - 1; // Search in the left subarray
            }
        }

        return -1; // Element not found
    }
}
