public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Total number of coins
        int k = 3; // Every k-th row
        int p = 4; // Number of coins on the k-th row

        if (n < p || (n - p) % (k - 1) != 0) {
            System.out.println("Impossible to form the staircase.");
            return;
        }


        int rows = (n - p) / (k - 1) + 1; // Calculate total rows

        int coinsUsed = 0;
        for (int i = 1; i <= rows; i++) {
            int coinsInRow = (i % k == 0) ? p : (k-1); //k-1 coins on normal rows, p on every k-th row.
            
            if (i == rows ) { //Adjust last row if necessary to avoid exceeding 'n' coins
                coinsInRow = n - coinsUsed;
            } else if (coinsUsed + coinsInRow > n) {
                System.out.println("Impossible to form the staircase.");
                return;
            }

            coinsUsed += coinsInRow; // Add coins used for the current row to the total

            // Print the coins for the current row
            for (int j = 0; j < coinsInRow; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line for the next row
        }

    }
}

