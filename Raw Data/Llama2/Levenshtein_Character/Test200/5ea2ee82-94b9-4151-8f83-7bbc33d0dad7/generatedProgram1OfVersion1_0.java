public class SwapFirstLast {

    public static void main(String[] args) {
        int[] originalArray = {20, 30, 40}; // Example array

        // Check if the array has at least one element
        if (originalArray.length < 1) {
            System.out.println("Array must have at least one element.");
            return;
        }

        // Create a new array with the same size as the original array
        int[] newArray = new int[originalArray.length];

        // Copy elements from the original array to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Swap the first and last elements in the new array
        int temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;


        // Print the original and new arrays
        System.out.print("Original Array: [");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i]);
            if (i < originalArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("New array after swapping the first and last elements: [");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
