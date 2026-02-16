public class ArrayStartEndCheck {

    public static void main(String[] args) {

        // Example usage:
        int[] arr1 = {1, 2, 3, 4, 1, 2, 3};
        int l1 = 3;
        System.out.println("Array 1: " + checkStartEnd(arr1, l1)); // Output: true

        int[] arr2 = {5, 6, 7, 8, 9, 10};
        int l2 = 2;
        System.out.println("Array 2: " + checkStartEnd(arr2, l2)); // Output: false

        int[] arr3 = {1, 2, 3, 4, 5, 1, 2};
        int l3 = 2;
        System.out.println("Array 3: " + checkStartEnd(arr3, l3)); // Output: true
        
        int[] arr4 = {1, 2, 3}; // Example with l equal to array length
        int l4 = 3;
        System.out.println("Array 4: " + checkStartEnd(arr4, l4)); // Output: true
        
        int[] arr5 = {}; // Empty array example
        int l5 = 0;
        System.out.println("Array 5: " + checkStartEnd(arr5, l5)); // Output: true



        // Feel free to add more test cases here.
    }

    public static boolean checkStartEnd(int[] arr, int l) {
        // Handle edge cases (empty array or l is zero).
        if (arr == null || arr.length == 0 || l == 0) {
            return true; // Consider an empty array or l=0 as a match.
        }

        // Handle cases where l is greater than array length.
        if(l > arr.length) {
            return false;
        }


        // Compare the first 'l' elements with the last 'l' elements.
        for (int i = 0; i < l; i++) {
            if (arr[i] != arr[arr.length - l + i]) {
                return false;
            }
        }

        return true;
    }
}



