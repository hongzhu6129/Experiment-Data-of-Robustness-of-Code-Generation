public class PentagonalNumbers {

    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONAL_NUMBERS = 50;
        int count = 0; // Counter to track how many pentagonal numbers have been printed

        for (int n = 1; count < NUMBER_OF_PENTAGONAL_NUMBERS; n++) {
            System.out.printf("%7d ", getPentagonalNumber(n)); // Print with formatting for alignment
            count++;

            if (count % 10 == 0) { // Start a new line after every 10 numbers
                System.out.println(); 
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
