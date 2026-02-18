public class PentagonalNumbers {

    public static void main(String[] args) {
        // Display the first 50 pentagonal numbers
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i)); // Use printf for formatting
            if (i % 10 == 0) {  // Print a newline after every 10 numbers
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}

