public class PentagonalNumbers {

    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONAL_NUMBERS = 50;
        int count = 0; // Initialize a counter

        for (int i = 1; count < NUMBER_OF_PENTAGONAL_NUMBERS; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i));
            count++;  // Increment the counter after printing each number

            if (count % 10 == 0) { // Print a newline after every 10 numbers
                System.out.println();
            }
        }
    }


    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
