public class PrintBooleanArray {

    public static void main(String[] args) {
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        printBooleanArray(boolArray);

        boolean[][] anotherBoolArray = {
                {true},
                {false, true, true},
                {true, false}
        }; // Example of a jagged array

        System.out.println("\nJagged Array:");
        printBooleanArray(anotherBoolArray);


        boolean[][] emptyArray = {};
        System.out.println("\nEmpty Array:");
        printBooleanArray(emptyArray);


        boolean[][] nullArray = null;
        System.out.println("\nNull Array:");
        printBooleanArray(nullArray);



    }


    public static void printBooleanArray(boolean[][] boolArray) {
        if (boolArray == null) {
            System.out.println("The array is null.");
            return;
        }


        if(boolArray.length == 0){
            System.out.println("The array is empty.");
            return;
        }



        for (int i = 0; i < boolArray.length; i++) {
            if (boolArray[i] == null) { // Handle potentially null rows in jagged arrays
                System.out.print("null "); // Indicate null row
                continue; // Skip to the next row
            }
            for (int j = 0; j < boolArray[i].length; j++) {
                System.out.print(boolArray[i][j] ? "t " : "f "); // Print 't' for true, 'f' for false
            }
            System.out.println(); // New line after each row
        }
    }
}
