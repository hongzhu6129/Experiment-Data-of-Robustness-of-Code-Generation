public class Check20 {

    public static void main(String[] args) {
        int[] arr1 = {20, 1, 20, 3, 20}; // True
        int[] arr2 = {20, 20, 1, 2, 20}; // False (adjacent 20s)
        int[] arr3 = {20, 1, 2, 3, 20}; // False (only two 20s)
        int[] arr4 = {1, 2, 3, 4, 5};  // False (no 20s)
        int[] arr5 = {20, 1, 20, 20, 3};// False (adjacent 20s)

        System.out.println(checkTwenty(arr1)); // Output: true
        System.out.println(checkTwenty(arr2)); // Output: false
        System.out.println(checkTwenty(arr3)); // Output: false
        System.out.println(checkTwenty(arr4)); // Output: false
        System.out.println(checkTwenty(arr5)); // Output: false
    }

    public static boolean checkTwenty(int[] arr) {
        int count = 0;
        boolean adjacent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i > 0 && arr[i - 1] == 20) { // Check for adjacent 20s
                    adjacent = true;
                    break; // No need to continue if adjacent 20s are found
                }
            }
        }

        return count == 3 && !adjacent;
    }
}
