public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example number of coins

        int currentRow = 1;
        int coinsInRow = 0;
        int coinsUsed = 0;

        while (coinsUsed < n) {
            // Build current row
            StringBuilder row = new StringBuilder();
            for (int i = 0; i < currentRow; i++) {
                if (coinsUsed < n) {
                    row.append("M"); // Minted coin
                    coinsUsed++;
                    coinsInRow++;
                } else {
                    row.append(" "); // Empty space if we run out of coins
                }
            }

            // Print row with leading spaces for alignment
            for (int i = 0; i < (n- coinsInRow); i++) {
                System.out.print(" "); // Adjust spacing as needed
            }


            System.out.println(row);

            currentRow++;
            coinsInRow= 0 ;// Reset for next row

           
        }
    }
}
