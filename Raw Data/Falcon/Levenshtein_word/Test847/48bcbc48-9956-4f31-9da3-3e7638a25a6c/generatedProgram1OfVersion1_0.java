public class CheckIncreasingAdjacent {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Array 1 contains three increasing adjacent numbers: " + containsThreeIncreasingAdjacent(arr1)); // Output: true

        int[] arr2 = {1, 2, 4, 5, 2, 3, 4};
        System.out.println("Array 2 contains three increasing adjacent numbers: " + containsThreeIncreasingAdjacent(arr2)); // Output: true


        int[] arr3 = {1, 2, 4, 5, 7, 8};
        System.out.println("Array 3 contains three increasing adjacent numbers: " + containsThreeIncreasingAdjacent(arr3)); // Output: false

        int[] arr4 = {5,4,3,2,1};
        System.out.println("Array 4 contains three increasing adjacent numbers: " + containsThreeIncreasingAdjacent(arr4)); // Output: false
        
        int[] arr5 = {}; // Empty array
        System.out.println("Array 5 contains three increasing adjacent numbers: " + containsThreeIncreasingAdjacent(arr5)); // Output: false


        int[] arr6 = {1,2}; // Array with less than 3 elements
        System.out.println("Array 6 contains three increasing adjacent numbers: " + containsThreeIncreasingAdjacent(arr6)); // Output: false
    }

    public static boolean containsThreeIncreasingAdjacent(int[] arr) {
        if (arr.length < 3) {
            return false;  // Not enough elements for three adjacent numbers
        }

        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] + 1 == arr[i + 1] && arr[i + 1] + 1 == arr[i + 2]) {
                return true;
            }
        }

        return false;
    }
}
