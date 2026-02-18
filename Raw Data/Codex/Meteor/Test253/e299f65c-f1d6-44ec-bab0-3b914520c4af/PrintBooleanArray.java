public class PrintBooleanArray {

    public static void main(String[] args) {
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        // Print the 2D boolean array using 't' for true and 'w' for false
        for (int i = 0; i < boolArray.length; i++) {
            for (int j = 0; j < boolArray[i].length; j++) {
                System.out.print(boolArray[i][j] ? 't' : 'w'); // Ternary operator for concise output
                if (j < boolArray[i].length - 1) {
                    System.out.print(" "); // Add space between elements in a row
                }
            }
            System.out.println(); // Newline after each row
        }
    }
}
