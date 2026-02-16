public class CheckStartEnd {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 1, 2, 3}; // Example 1:  l=3, same at start and end
        int l1 = 3;
        System.out.println("Array 1: " + checkSameEnds(arr1, l1)); // Output: true

        int[] arr2 = {1, 2, 3, 4, 5, 1};  // Example 2: l=1, same at start and end
        int l2 = 1;
        System.out.println("Array 2: " + checkSameEnds(arr2, l2)); // Output: true

        int[] arr3 = {1, 2, 3, 4, 5, 6};  // Example 3: l=2, not the same
        int l3 = 2;
        System.out.println("Array 3: " + checkSameEnds(arr3, l3)); // Output: false

         int[] arr4 = {1, 2, 3, 4, 5, 6, 7}; // Example 4: l=0 (empty group), considered same
        int l4 = 0;
        System.out.println("Array 4: " + checkSameEnds(arr4, l4));  // Output: true

        int[] arr5 = {1, 2, 3}; // Example 5: l exceeds array length, considered not same
        int l5 = 4;
        System.out.println("Array 5: " + checkSameEnds(arr5, l5)); // Output: false




    }


    public static boolean checkSameEnds(int[] arr, int l) {
        int n = arr.length;

        // Handle cases where l exceeds the array length
        if (l > n) {
            return false;
        }

        // Iterate through the 'l' elements at the beginning and end
        for (int i = 0; i < l; i++) {
            if (arr[i] != arr[n - l + i]) { //compare start and end segments
                return false; // If any elements differ, return false
            }
        }

        // If all elements in the 'l' segments are the same, return true
        return true;
    }
}
