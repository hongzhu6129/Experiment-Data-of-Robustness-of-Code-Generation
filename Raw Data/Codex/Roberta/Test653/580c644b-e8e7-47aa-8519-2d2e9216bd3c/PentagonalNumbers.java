public class PentagonalNumbers {

    public static void main(String[] args) {
        // Display the first 50 pentagonal numbers
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i)); // Formatted output for alignment
            if (i % 10 == 0) { // New line after every 10 numbers
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        // Calculate the nth pentagonal number using the formula: n * (3n - 1) / 2
        return n * (3 * n - 1) / 2;
    }
}
