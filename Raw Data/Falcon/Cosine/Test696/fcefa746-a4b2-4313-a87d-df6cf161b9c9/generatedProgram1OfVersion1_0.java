public class PrintBooleanArray {

    public static void main(String[] args) {
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        // Iterate through the rows
        for (int i = 0; i < boolArray.length; i++) {
            // Iterate through the columns
            for (int j = 0; j < boolArray[i].length; j++) {
                // Print 't' for true and 'f' for false
                System.out.print(boolArray[i][j] ? 't' : 'f');
                // Add a space between elements
                System.out.print(" "); 
            }
            // Newline after each row
            System.out.println();
        }
    }
}
