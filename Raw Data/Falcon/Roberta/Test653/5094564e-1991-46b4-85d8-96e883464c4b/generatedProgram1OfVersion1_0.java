public class PentagonalNumbers {

    public static void main(String[] args) {
        // Display the first 50 pentagonal numbers
        displayPentagonalNumbers(50);
    }

    public static int getPentagonalNumber(int n) {
        // Calculate the nth pentagonal number using the formula: n(3n-1)/2
        return n * (3 * n - 1) / 2;
    }

    public static void displayPentagonalNumbers(int numToPrint) {
        final int numbersPerLine = 10;
        for (int i = 1; i <= numToPrint; i++) {
            System.out.printf("%7d", getPentagonalNumber(i)); // Format for consistent spacing
            if (i % numbersPerLine == 0) {
                System.out.println(); // New line after every 10 numbers
            }
        }
    }
}

