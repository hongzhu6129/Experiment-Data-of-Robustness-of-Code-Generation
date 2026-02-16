public class PentagonalNumbers {

    public static void main(String[] args) {
        displayPentagonalNumbers(50);
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void displayPentagonalNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i)); // %7d formats output for better alignment
            if (i % 10 == 0) {  // Print 10 numbers per line
                System.out.println();
            }
        }
    }
}

