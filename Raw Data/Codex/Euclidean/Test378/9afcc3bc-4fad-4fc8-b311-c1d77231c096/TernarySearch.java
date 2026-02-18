public class TernarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        int index = ternary_search(arr, 0, arr.length - 1, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }


        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Descending order - Ternary search isn't suitable
        target = 7;

        index = ternary_search(arr2, 0, arr2.length - 1, target); // Will likely give incorrect results

        if (index != -1) {
            System.out.println("Element " + target + " found at index (descending array - may be incorrect): " + index);
        } else {
            System.out.println("Element " + target + " not found in the descending array (or incorrect result).");
        }

       //Example with a unimodal function (finding the minimum/maximum index) - note this adapts ternary search for a slightly different purpose
         int[] unimodalArray = {1, 2, 3, 4, 5, 4, 3, 2}; //Example unimodal array (ascending then descending)
         int minIndex = findMinIndexUnimodal(unimodalArray, 0, unimodalArray.length - 1);
         System.out.println("Minimum element index in unimodal array: " + minIndex + " (value: " + unimodalArray[minIndex] + ")");
    }

    static int ternary_search(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == target) {
                return mid1;
            }
            if (arr[mid2] == target) {
                return mid2;
            }

            if (target < arr[mid1]) {
                return ternary_search(arr, left, mid1 - 1, target);
            } else if (target > arr[mid2]) {
                return ternary_search(arr, mid2 + 1, right, target);
            } else {
                return ternary_search(arr, mid1 + 1, mid2 - 1, target);
            }
        }
        return -1; // Element not found
    }




    //Adapting ternary search to find the minimum index of a unimodal array (increasing then decreasing)
     static int findMinIndexUnimodal(int[] arr, int left, int right) {

        while (left <= right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] < arr[mid2]) {
                right = mid2 -1; // Minimum must be in the left portion (including mid1)
            } else {
                left = mid1 + 1; // Minimum must be in the right portion
            }
        }
        return left; // left will be the index of the minimum element (or where it would be if it existed)
    }

}
