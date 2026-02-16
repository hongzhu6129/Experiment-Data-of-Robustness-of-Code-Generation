public class PrintBooleanArray {

    public static void main(String[] args) {
        // Example 2D boolean array
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        // Print the array
        printBooleanArray(boolArray);


        // Another Example:  Empty array
        boolean[][] emptyArray = {};
        printBooleanArray(emptyArray);

         // Another Example:  Array with uneven rows
         boolean[][] unevenArray = {
            {true, false},
            {false, true, false},
            {true}
    };
    printBooleanArray(unevenArray);


    }

    public static void printBooleanArray(boolean[][] boolArray) {
        if (boolArray == null || boolArray.length == 0) {
            System.out.println("Empty array.");
            return;
        }

        for (int i = 0; i < boolArray.length; i++) {
            if(boolArray[i] == null || boolArray[i].length == 0) { //Handle potentially empty rows.
                System.out.println(); //Print a blank line for an empty row.
                continue; //Go to the next row.
            }


            for (int j = 0; j < boolArray[i].length; j++) {
                System.out.print(boolArray[i][j] ? "t " : "f "); // Print 't' for true, 'f' for false
            }
            System.out.println(); // New line after each row
        }
    }
}
