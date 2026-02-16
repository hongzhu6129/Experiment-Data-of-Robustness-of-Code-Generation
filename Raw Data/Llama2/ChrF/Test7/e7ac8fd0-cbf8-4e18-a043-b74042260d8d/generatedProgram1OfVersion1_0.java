public class PentagonalNumbers {

    public static void main(String[] args) {
        displayPentagonalNumbers(50);
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void displayPentagonalNumbers(int count) {
        int numbersPerLine = 10;
        for (int i = 1; i <= count; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i)); // %7d formats the output neatly
            if (i % numbersPerLine == 0) {
                System.out.println(); // New line after every 10 numbers
            }
        }
    }
}
