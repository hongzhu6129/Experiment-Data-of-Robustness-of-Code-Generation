public class PentagonalNumbers {

    public static void main(String[] args) {
        // Display the first 50 pentagonal numbers
        final int NUMBER_OF_PENTAGONAL_NUMBERS = 50;
        int count = 0; // Counter to keep track of how many numbers we've printed

        for (int i = 1; count < NUMBER_OF_PENTAGONAL_NUMBERS ; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i));  // Print with formatting for alignment
            count++;

            if (count % 10 == 0) { // Start a new line after every 10 numbers
                System.out.println();
            }
        }
    }


    public static int getPentagonalNumber(int n) {
        // Calculate the nth pentagonal number using the formula: n(3n-1)/2
        return n * (3 * n - 1) / 2;
    }
}
