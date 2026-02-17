public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example: Number of coins

        int currentRow = 1;
        int coinsInRow = 0;
        int coinsUsed = 0;

        while (coinsUsed < n) {
            for (int i = 0; i < currentRow; i++) {
                if (coinsUsed < n) {
                    System.out.print("* ");
                    coinsUsed++;
                    coinsInRow++;
                } else {
                    break; // Stop if we've used all the coins
                }
            }

            if (coinsInRow > 0) { // Only print a newline if we've placed coins in this row.
                System.out.println();
            }


            currentRow++; 
            coinsInRow = 0; // Reset for the next row
        }
    }
}
