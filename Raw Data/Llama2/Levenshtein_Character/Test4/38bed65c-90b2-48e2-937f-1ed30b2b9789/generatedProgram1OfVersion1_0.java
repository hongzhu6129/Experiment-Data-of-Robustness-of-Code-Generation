public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example: Build staircase with 10 coins

        int currentRow = 1;
        int coinsUsed = 0;

        while (coinsUsed + currentRow <= n) {
            for (int i = 0; i < currentRow; i++) {
                System.out.print("* ");  // Print a coin
            }
            System.out.println(); // Move to the next line

            coinsUsed += currentRow;
            currentRow++;
        }

        // Handle remaining coins (if any)
        if (coinsUsed < n) {
            for (int i = 0; i < n - coinsUsed; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
