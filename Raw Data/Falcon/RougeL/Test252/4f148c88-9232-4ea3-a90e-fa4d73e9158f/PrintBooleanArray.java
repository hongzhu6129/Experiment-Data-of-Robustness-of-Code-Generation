public class PrintBooleanArray {

    public static void main(String[] args) {
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        // Print the array
        for (int i = 0; i < boolArray.length; i++) {
            for (int j = 0; j < boolArray[i].length; j++) {
                // Use ternary operator for concise output
                System.out.print(boolArray[i][j] ? "t " : "f "); 
            }
            System.out.println(); // Newline after each row
        }
    }
}
