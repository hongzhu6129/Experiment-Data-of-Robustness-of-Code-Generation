public class PentagonalNumbers {

    public static void main(String[] args) {
        // Display the first 50 pentagonal numbers
        final int NUMBER_OF_PENTAGONAL_NUMBERS = 50;
        int count = 0;  // Counter to keep track of how many pentagonal numbers have been printed
        for (int n = 1; count < NUMBER_OF_PENTAGONAL_NUMBERS; n++) {
            System.out.printf("%7d ", getPentagonalNumber(n)); // Print with formatting for alignment
            count++;

            if (count % 10 == 0) {  // Print a new line after every 10 numbers
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
