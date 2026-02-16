public class PrintBooleanArray {

    public static void main(String[] args) {
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        printBooleanArray(boolArray);
    }

    private static void printBooleanArray(boolean[][] arr) {
        for (boolean[] row : arr) {
            for (boolean element : row) {
                System.out.print(element ? "t " : "f "); // Print 't' for true and 'f' for false
            }
            System.out.println(); // New line after each row
        }
    }
}
