public class AfterTen {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 10, 3, 4, 5, 10, 6, 7, 8};
        printArray(afterTen(arr1)); // Output: [6, 7, 8]

        int[] arr2 = {1, 2, 3, 4, 5};
        printArray(afterTen(arr2)); // Output: []

        int[] arr3 = {1, 2, 10, 10, 3, 4, 5};
        printArray(afterTen(arr3)); // Output: [3, 4, 5]


        int[] arr4 = {10, 1, 2, 10, 3, 4, 10};
        printArray(afterTen(arr4));  // Output: []
    }

    public static int[] afterTen(int[] arr) {
        int lastTenIndex = -1;

        // Find the index of the last occurrence of 10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                lastTenIndex = i;
            }
        }

        // If 10 is not found, return an empty array
        if (lastTenIndex == -1 || lastTenIndex == arr.length-1) {
            return new int[0];
        }

        // Create a new array with the elements after the last 10
        int newArrayLength = arr.length - (lastTenIndex + 1);
        int[] newArray = new int[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {
            newArray[i] = arr[lastTenIndex + 1 + i];
        }

        return newArray;
    }


    // Helper function to print the array for easier testing
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
}
