public class BooleanArrayPrinter {

    public static void main(String[] args) {
        // Example 2D boolean array
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, true}
        };

        printBooleanArray(boolArray);


        // Example with a ragged array (different row lengths)
        boolean[][] raggedArray = {
                {true, false},
                {false, true, true},
                {true}
        };

        System.out.println("\nRagged Array:");
        printBooleanArray(raggedArray);


        // Example with an empty array
        boolean[][] emptyArray = {};

        System.out.println("\nEmpty Array:");
        printBooleanArray(emptyArray);


         // Example with a null array
        boolean[][] nullArray = null;
        System.out.println("\nNull array:");
        printBooleanArray(nullArray);
    }

    // Method to print the boolean array
    private static void printBooleanArray(boolean[][] arr) {
        if (arr == null) {
            System.out.println("The array is null.");
            return;
        }


        if (arr.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {  // Handle potentially null rows
                System.out.println("Row " + i + " is null.");
                continue; // Skip to the next row
            }

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] ? "t " : "f "); // Print t for true, f for false
            }
            System.out.println(); // Newline after each row
        }
    }
}
