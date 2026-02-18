public class PentagonalNumbers {

    public static void main(String[] args) {
        // Display the first 50 pentagonal numbers
        final int NUMBER_OF_PENTAGONAL_NUMBERS = 50;
        for (int i = 1; i <= NUMBER_OF_PENTAGONAL_NUMBERS; i++) {
            System.out.printf("%-6d ", getPentagonalNumber(i)); // %-6d formats output for alignment
            if (i % 10 == 0) { // Start a new line after every 10 numbers
                System.out.println();
            }
        }
    }


    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
