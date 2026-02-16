public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example number of coins

        int currentRow = 1;
        int coinsInCurrentRow = 0;
        int coinsUsed = 0;

        while (coinsUsed < n) {
            // Print spaces for alignment
            for (int i = 0; i < (n - currentRow - coinsInCurrentRow) ; i++) { // Adjust spacing
                System.out.print(" ");
            }

            // Print coins for the current row
            for (int i = 0; i < currentRow && coinsUsed < n; i++) {
                System.out.print("o "); // Use 'o' to represent a coin
                coinsUsed++;
                coinsInCurrentRow++;

            }
            System.out.println(); // Move to the next line after each row

            coinsInCurrentRow=0; //reset
            currentRow++;

        }
    }
}
