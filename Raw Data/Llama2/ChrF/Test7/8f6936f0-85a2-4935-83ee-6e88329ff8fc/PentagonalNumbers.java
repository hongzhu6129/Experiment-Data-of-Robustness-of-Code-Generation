public class PentagonalNumbers {

    public static void main(String[] args) {
        // Display the first 50 pentagonal numbers
        displayPentagonalNumbers(50);
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void displayPentagonalNumbers(int count) {
        int numbersPerLine = 10; // Display 10 numbers per line
        for (int i = 1; i <= count; i++) {
            System.out.printf("%7d", getPentagonalNumber(i)); // Format output for alignment
            if (i % numbersPerLine == 0) {
                System.out.println(); // New line after every 10 numbers
            }
        }
    }
}
