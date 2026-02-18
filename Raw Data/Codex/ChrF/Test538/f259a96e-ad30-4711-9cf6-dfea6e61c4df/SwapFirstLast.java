import java.util.Arrays;

public class SwapFirstLast {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray1 = {1, 2, 3, 4, 5};
        int[] newArray1 = swapFirstLast(originalArray1);
        System.out.println("Original Array: " + Arrays.toString(originalArray1));
        System.out.println("New Array: " + Arrays.toString(newArray1));

        int[] originalArray2 = {10};
        int[] newArray2 = swapFirstLast(originalArray2);
        System.out.println("Original Array: " + Arrays.toString(originalArray2));
        System.out.println("New Array: " + Arrays.toString(newArray2));


        int[] originalArray3 = {10, 20}; // Example with two elements
        int[] newArray3 = swapFirstLast(originalArray3);
        System.out.println("Original Array: " + Arrays.toString(originalArray3));
        System.out.println("New Array: " + Arrays.toString(newArray3));


    }

    public static int[] swapFirstLast(int[] arr) {
        if (arr.length < 1) {
            // Handle cases where the array is empty (though the problem specifies length >= 1)
            return new int[0];  // Return an empty array if the input is empty
            // Or throw an exception if an empty array is considered an error:
            // throw new IllegalArgumentException("Array must have at least one element.");
        }


        int[] newArray = Arrays.copyOf(arr, arr.length); // Create a copy to avoid modifying the original

        // Swap the first and last elements in the new array
        int temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;

        return newArray;

    }
}
