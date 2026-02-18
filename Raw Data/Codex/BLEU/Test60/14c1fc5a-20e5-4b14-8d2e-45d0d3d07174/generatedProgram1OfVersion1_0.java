public class SwapFirstLast {

    public static void main(String[] args) {

        // Example usage:
        int[] arr1 = {1, 2, 3, 4, 5};
        swapFirstLast(arr1);
        printArray(arr1); // Output: [5, 2, 3, 4, 1]

        int[] arr2 = {10};
        swapFirstLast(arr2);
        printArray(arr2); // Output: [10]


        // Sophisticated example with error handling and generics:
        Integer[] arr3 = {10, 20, 30};
        swapFirstLastGeneric(arr3);
        printArrayGeneric(arr3);

        String[] arr4 = {"apple", "banana", "cherry"};
        swapFirstLastGeneric(arr4);
        printArrayGeneric(arr4);


        // Demonstrating error handling:
        Integer[] emptyArray = {};
        swapFirstLastGeneric(emptyArray); // Handles the empty array case gracefully


    }

    // Simple swap for int arrays
    public static void swapFirstLast(int[] arr) {
        if (arr.length > 1) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        } // Does nothing if the array has 0 or 1 elements.
    }

    // Prints int array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }



    // More sophisticated generic swap for any type of array.
    public static <T> void swapFirstLastGeneric(T[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Handle null or arrays with 0/1 elements - nothing to swap
        }

        try {
            T temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error swapping elements: " + e.getMessage());
        }
    }


    // Generic print method for any type of array
    public static <T> void printArrayGeneric(T[] arr) {
        System.out.print("[");
        if(arr != null) { // Protect against null pointer exception
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("]");
    }

}
