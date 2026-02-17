public class BooleanArrayPrinter {

    public static void main(String[] args) {
        boolean[][] array = {{true, false, true}, {false, true, false}};

        for (boolean[] row : array) {
            for (boolean value : row) {
                System.out.print(value ? "t " : "f ");
            }
        }
        System.out.println(); // Add a newline at the end for cleaner output
    }
}
