public class PrintBooleanArray {

    public static void main(String[] args) {
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        printBooleanArray(boolArray);


        boolean[][] anotherBoolArray = {
                {true, false},
                {false, true, false}, // Jagged array example
                {true}
        };

        printBooleanArray(anotherBoolArray);

    }


    public static void printBooleanArray(boolean[][] arr) {
        if (arr == null) {
            System.out.println("The array is null.");
            return;
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) { // Handle potentially null rows in jagged arrays.
                System.out.println("Row " + i + " is null.");
                continue; // Skip to the next row
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] ? "t " : "f "); // Print 't' for true, 'f' for false
            }
            System.out.println(); // New line after each row
        }
        System.out.println(); // Add an extra line between arrays for clarity.

    }
}
