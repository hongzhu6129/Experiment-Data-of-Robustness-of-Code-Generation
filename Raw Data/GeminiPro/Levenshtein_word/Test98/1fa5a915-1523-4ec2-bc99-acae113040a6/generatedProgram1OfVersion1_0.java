public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example: Build staircase with 10 coins

        int row = 1;
        int coinsInRow = 1;
        int coinsUsed = 0;

        while (coinsUsed < n) {
            for (int i = 0; i < coinsInRow; i++) {
                if (coinsUsed < n) {
                    System.out.print("* "); // Print a coin
                    coinsUsed++;
                } else {
                    break; // Stop if we've used all coins
                }
            }
            System.out.println(); // New line for next row

            coinsInRow = row + 1;  // Increment coins for the next row
            row++; 
        }
    }
}
