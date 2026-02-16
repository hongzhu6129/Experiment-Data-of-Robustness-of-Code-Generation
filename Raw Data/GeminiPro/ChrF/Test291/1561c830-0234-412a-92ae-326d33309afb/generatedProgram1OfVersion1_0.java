public class PrintBooleanArray {

    public static void main(String[] args) {
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        printBooleanArray(boolArray);
    }

    public static void printBooleanArray(boolean[][] arr) {
        for (boolean[] row : arr) {
            for (boolean value : row) {
                System.out.print(value ? "t " : "f "); // Print "t" for true, "f" for false
            }
            System.out.println(); // New line after each row
        }
    }
}
