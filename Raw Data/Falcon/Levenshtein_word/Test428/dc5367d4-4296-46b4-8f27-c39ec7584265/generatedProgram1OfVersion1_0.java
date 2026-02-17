public class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;
        int index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }


        target = 22; // Test for element not present
        index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        int[] emptyArr = {};
        target = 5;
        index = exponentialSearch(emptyArr, target);
         if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }



    }

    private static int exponentialSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1; 
        }

        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i *= 2;
        }

        // Perform Binary Search within the determined range
        int start = i / 2;
        int end = Math.min(i, arr.length -1); // Don't go past end of array


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }


        return -1; // Element not found

    }
}
