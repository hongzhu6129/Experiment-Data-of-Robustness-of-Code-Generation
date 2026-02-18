public class PentagonalNumbers {

    public static void main(String[] args) {
        displayFirst50PentagonalNumbers();
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void displayFirst50PentagonalNumbers() {
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i));  // %7d formats output for alignment
            if (i % 10 == 0) {                               // New line after every 10 numbers
                System.out.println();
            }
        }
    }
}
