public class Staircase {

    public static void main(String[] args) {
        int n = 10; // Example number of coins. You can change this.

        int currentRow = 1;
        int coinsInCurrentRow = 0;
        int coinsUsed = 0;

        while (coinsUsed < n) {
            // Print spaces for alignment
            for (int i = 0; i < (n - currentRow ) ; i++) { // Adjust spacing as needed
                System.out.print(" ");
            }

            // Print coins for the current row
            while (coinsInCurrentRow < currentRow && coinsUsed < n) {
                System.out.print("* "); // Or any other coin representation
                coinsInCurrentRow++;
                coinsUsed++;
            }

            System.out.println(); // New line after each row
            currentRow++;
            coinsInCurrentRow = 0;
           
        }
    }
}
