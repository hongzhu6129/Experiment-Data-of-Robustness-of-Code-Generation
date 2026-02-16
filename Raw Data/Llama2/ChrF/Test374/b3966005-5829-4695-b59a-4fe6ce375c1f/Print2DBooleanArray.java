public class Print2DBooleanArray {

    public static void main(String[] args) {
        boolean[][] sophisticated = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        printBooleanArray(sophisticated);
    }

    private static void printBooleanArray(boolean[][] arr) {
        for (boolean[] row : arr) {
            for (boolean value : row) {
                System.out.print(value ? "t " : "f "); // Print 't' for true and 'f' for false
            }
            System.out.println(); // Newline after each row
        }
    }
}

