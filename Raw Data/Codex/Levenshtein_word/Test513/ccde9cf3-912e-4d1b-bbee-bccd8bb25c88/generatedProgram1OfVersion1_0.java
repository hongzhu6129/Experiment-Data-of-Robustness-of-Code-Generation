public class FindFirstOccurrence {

    public static void main(String[] args) {
        // Example usage:
        int[] array = {1, 2, 3, 4, 3, 5, 3};
        int target = 3;
        int firstOccurrence = findFirstOccurrence(array, target);

        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
        } else {
            System.out.println(target + " not found in the array.");
        }


        // Another example
         int[] array2 = {1, 2, 3, 4, 5};
        int target2 = 6; // Element not present
        int firstOccurrence2 = findFirstOccurrence(array2, target2);

        if (firstOccurrence2 != -1) {
            System.out.println("First occurrence of " + target2 + " is at index: " + firstOccurrence2);
        } else {
            System.out.println(target2 + " not found in the array.");
        }


         // Example with empty array
        int[] array3 = {};
        int target3 = 5;
        int firstOccurrence3 = findFirstOccurrence(array3, target3);

        if (firstOccurrence3 != -1) {
            System.out.println("First occurrence of " + target3 + " is at index: " + firstOccurrence3);
        } else {
            System.out.println(target3+ " not found in the array.");
        }

    }

    public static int findFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index immediately upon finding the target
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
