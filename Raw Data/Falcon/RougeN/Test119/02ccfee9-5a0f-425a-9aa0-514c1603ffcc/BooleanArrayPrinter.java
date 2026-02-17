public class BooleanArrayPrinter {

    public static void main(String[] args) {
        // Example 2D boolean array
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        // Print the array contents
        printBooleanArray(boolArray);


        // Another Example (Empty Array)
        boolean[][] emptyArray = {};
        printBooleanArray(emptyArray);

          // Another Example (Ragged Array)
        boolean[][] raggedArray = {
                {true, false},
                {false},
                {true, true, false}
        };
        printBooleanArray(raggedArray);


         // Another Example (Null Array)
        boolean[][] nullArray = null;
        printBooleanArray(nullArray);
    }


    public static void printBooleanArray(boolean[][] arr) {
        if (arr == null) {
            System.out.println("The array is null.");
            return;
        }

        if (arr.length == 0) {
            System.out.println("The array is empty.");
            return;
        }



        for (int i = 0; i < arr.length; i++) {
             if (arr[i] == null) {  // Handle potentially null rows in ragged arrays
                System.out.print("null "); // Indicate null row
                continue; // Skip to the next row
            }

            for (int j = 0; j < arr[i].length; j++) {
                // Print 't' for true and 'f' for false
                System.out.print(arr[i][j] ? "t " : "f ");
            }
            System.out.println(); // New line after each row
        }
        System.out.println(); // Separator between examples.


    }
}
