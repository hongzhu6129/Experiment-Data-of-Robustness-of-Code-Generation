public class PentagonalNumbers {

    public static void main(String[] args) {
        displayFirst50PentagonalNumbers();
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void displayFirst50PentagonalNumbers() {
        int count = 0;  // Counter to keep track of how many numbers we've printed
        int n = 1;     // The current 'n' for calculating pentagonal numbers


        while (count < 50) {
            System.out.printf("%7d ", getPentagonalNumber(n)); // Print with formatting for alignment
            n++;
            count++;

            if (count % 10 == 0) { // Add a newline after every 10 numbers
                System.out.println();
            }
        }
    }
}
