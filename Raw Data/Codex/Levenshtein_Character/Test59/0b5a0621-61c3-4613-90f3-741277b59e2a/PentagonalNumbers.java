public class PentagonalNumbers {

    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONAL_NUMBERS = 50;

        System.out.println("The first 50 pentagonal numbers are:");

        for (int i = 1; i <= NUMBER_OF_PENTAGONAL_NUMBERS; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i)); // Format for alignment
            if (i % 10 == 0) { // Print 10 numbers per line
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
