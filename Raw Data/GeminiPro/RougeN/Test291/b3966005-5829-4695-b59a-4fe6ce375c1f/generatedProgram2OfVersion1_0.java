public class Print2DBooleanArrayInlined {

    public static void main(String[] args) {
        boolean[][] sophisticated = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        for (boolean[] row : sophisticated) {
            for (boolean value : row) {
                System.out.print(value ? "t " : "f "); // Print 't' for true and 'f' for false
            }
            System.out.println(); // Newline after each row
        }

    }
}
