public class AdjacentNumberChecker {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 4, 2};
        int num1 = 2;
        System.out.println("Array 1 contains " + num1 + " in every adjacent pair: " + checkAdjacent(arr1, num1)); // Output: true

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int num2 = 3;
        System.out.println("Array 2 contains " + num2 + " in every adjacent pair: " + checkAdjacent(arr2, num2)); // Output: false

        int[] arr3 = {2, 1, 2, 3, 2, 4, 2};
        int num3 = 2;
        System.out.println("Array 3 contains " + num3 + " in every adjacent pair: " + checkAdjacent(arr3, num3)); // Output: false


        int[] arr4 = {}; // Empty array
        int num4 = 2;
        System.out.println("Array 4 contains " + num4 + " in every adjacent pair: " + checkAdjacent(arr4, num4)); // Output: true (vacuously true as there are no pairs)

        int[] arr5 = {2}; // Single element array
        int num5 = 2;
        System.out.println("Array 5 contains " + num5 + " in every adjacent pair: " + checkAdjacent(arr5, num5)); // Output: true  (vacuously true as there are no pairs)
    }

    public static boolean checkAdjacent(int[] arr, int num) {
        if (arr.length < 2) { // Handle empty or single-element arrays (no adjacent pairs)
            return true; // Vacuously true - no pairs to check
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != num && arr[i + 1] != num) {
                return false; // If 'num' is not in either of the adjacent elements, return false
            }
        }

        return true; // If the loop completes without returning false, then all pairs contain 'num'
    }
}
