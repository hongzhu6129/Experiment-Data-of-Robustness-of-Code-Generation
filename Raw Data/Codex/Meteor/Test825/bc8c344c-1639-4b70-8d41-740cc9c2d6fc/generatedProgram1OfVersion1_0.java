public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example number of coins

        int row = 1;
        int coinsInRow = 0;
        int coinsUsed = 0;

        while (coinsUsed < n) {
            coinsInRow++; // Increment coins for the current row

            if (coinsUsed + coinsInRow <= n) { // Check if enough coins are available
                for (int i = 0; i < coinsInRow; i++) {
                    System.out.print("* ");
                }
                System.out.println();
                coinsUsed += coinsInRow;
                row++;
            } else {
                // Handle remaining coins if not enough for a full row
                int remainingCoins = n - coinsUsed;
                for (int i = 0; i < remainingCoins; i++) {
                    System.out.print("* ");
                }
                System.out.println();  // Print the final (possibly incomplete) row
                coinsUsed += remainingCoins;  //So we break out of the while loop
            }
        }

    }
}
