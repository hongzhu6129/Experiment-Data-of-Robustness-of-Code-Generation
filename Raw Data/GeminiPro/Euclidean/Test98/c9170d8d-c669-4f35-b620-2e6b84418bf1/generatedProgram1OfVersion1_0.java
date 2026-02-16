public class Walkway {

    public static void main(String[] args) {
        int n = 10; // Example number of coins. Change as needed.
        int k = 0; // Current row number (starting from 0)
        int coinsUsed = 0;

        while (coinsUsed <= n) {
            k++;
            int coinsInRow = k;

            if (coinsUsed + coinsInRow <= n) {
                // Print the row
                for (int i = 0; i < coinsInRow; i++) {
                    System.out.print("O "); // Use 'O' to represent a coin
                }
                System.out.println();  // Newline after each row

                coinsUsed += coinsInRow;
            } else {
                // Handle the case where we don't have enough coins for a full row
                int remainingCoins = n - coinsUsed;
                for (int i = 0; i < remainingCoins; i++) {
                    System.out.print("O ");
                }
                System.out.println();
                coinsUsed += remainingCoins; // Update coinsUsed to exit the loop
                
                
            }
        }


    }
}
