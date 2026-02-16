public class TernarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;
        int result = ternary_search(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        
        target = 25;  // Test for element not present
        result = ternary_search(arr, 0, arr.length - 1, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
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
        return -1;
    }
}
