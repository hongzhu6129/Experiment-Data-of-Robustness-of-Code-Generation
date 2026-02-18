public class CheckTwenty {

    public static void main(String[] args) {
        int[] arr1 = {1, 20, 3, 4, 20, 5, 6, 20, 7}; // Valid
        int[] arr2 = {1, 20, 20, 3, 4, 5, 6, 20};    // Invalid (adjacent 20s)
        int[] arr3 = {1, 20, 3, 4, 5, 6, 7};        // Invalid (not enough 20s)
        int[] arr4 = {1, 20, 3, 4, 20, 20, 20, 7};   // Invalid (too many 20s and adjacent)

        System.out.println("Array 1: " + checkTwenty(arr1)); // Output: true
        System.out.println("Array 2: " + checkTwenty(arr2)); // Output: false
        System.out.println("Array 3: " + checkTwenty(arr3)); // Output: false
        System.out.println("Array 4: " + checkTwenty(arr4)); // Output: false


    }

    public static boolean checkTwenty(int[] arr) {
        int count = 0;
        boolean adjacent = false; // Flag to track adjacent 20s

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i > 0 && arr[i - 1] == 20) { // Check if the previous element was also 20
                    adjacent = true;
                    break; // No need to continue if adjacent 20s are found
                }
            }
        }

        return count == 3 && !adjacent;
    }
}
