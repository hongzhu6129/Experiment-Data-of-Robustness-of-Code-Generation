public class PentagonalNumbers {

    public static void main(String[] args) {
        // Display the first 50 pentagonal numbers
        final int NUM_PENTAGONALS = 50;
        for (int i = 1; i <= NUM_PENTAGONALS; i++) {
            System.out.printf("%-6d ", getPentagonalNumber(i)); // %-6d formats the output for alignment
            if (i % 10 == 0) {  // New line after every 10 numbers
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        // Calculate the nth pentagonal number using the formula n(3n-1)/2
        return n * (3 * n - 1) / 2;
    }
}
