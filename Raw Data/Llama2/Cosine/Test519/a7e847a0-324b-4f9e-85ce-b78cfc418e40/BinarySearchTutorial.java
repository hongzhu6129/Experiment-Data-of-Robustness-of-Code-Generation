public class BinarySearchTutorial {

    /**
     * Performs a binary search on a sorted integer array to find a target value.
     *
     * @param arr The sorted integer array to search within.
     * @param target The integer value to search for.
     * @return The index of the target value in the array if found, otherwise -1.
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential overflow

            if (arr[mid] == target) {
                return mid; // Target found at index mid
            } else if (arr[mid] < target) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }

        return -1; // Target not found in the array
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}; // Example sorted array
        int targetValue = 23; // Example target value

        int resultIndex = binarySearch(sortedArray, targetValue);

        if (resultIndex != -1) {
            System.out.println("Element " + targetValue + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + targetValue + " not found in the array.");
        }



        targetValue = 15; // Example target value that doesn't exist
         resultIndex = binarySearch(sortedArray, targetValue);

        if (resultIndex != -1) {
            System.out.println("Element " + targetValue + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + targetValue + " not found in the array.");
        }
    }
}
