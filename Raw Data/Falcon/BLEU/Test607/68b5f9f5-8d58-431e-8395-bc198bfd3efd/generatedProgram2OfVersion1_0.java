public class BooleanArrayPrinter {

    public static void main(String[] args) {
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        for (boolean[] row : boolArray) {
            for (boolean value : row) {
                System.out.print(value ? "t " : "f ");
            }
            System.out.println();
        }
    }
}
