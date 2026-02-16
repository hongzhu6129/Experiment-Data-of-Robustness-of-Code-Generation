public class TernarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;

        int index = ternary_search(arr, target, 0, arr.length - 1);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

          target = 25; // Test for an element not present.
        index = ternary_search(arr, target, 0, arr.length - 1);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

    }

    static int ternary_search(int[] arr, int target, int left, int right) {
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
                return ternary_search(arr, target, left, mid1 - 1);
            } else if (target > arr[mid2]) {
                return ternary_search(arr, target, mid2 + 1, right);
            } else {
                return ternary_search(arr, target, mid1 + 1, mid2 - 1);
            }

        }
        return -1; // Element not found

    }
}
