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
            for (boolean value : row) {
                System.out.print(value ? "t " : "w "); // t for true, w for false
            }
            System.out.println(); // New line after each row
        }
    }
}
