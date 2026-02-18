public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example: Create a staircase with 10 coins

        int currentRow = 1;
        int coinsUsed = 0;

        while (coinsUsed < n) {
            int coinsInRow = Math.min(currentRow, n - coinsUsed); // Ensure we don't use more coins than available

            for (int i = 0; i < coinsInRow; i++) {
                System.out.print("* "); // Print a coin
            }
            System.out.println(); // Move to the next line

            coinsUsed += coinsInRow;
            currentRow++;
        }
    }
}
