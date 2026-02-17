public class MagicSquare {

    public static void main(String[] args) {
        int n = 7; // Example: Generate a 7x7 magic square.  Change this value to generate different sizes.  Must be odd.

        if (n % 2 == 0) {
            System.out.println("Magic squares can only be generated for odd orders.");
            return;
        }

        int[][] magicSquare = new int[n][n];

        int num = 1;
        int row = 0;
        int col = n / 2;

        while (num <= n * n) {
            magicSquare[row][col] = num;
            num++;

            int nextRow = (row - 1 + n) % n; // Wrap around if we go off the top
            int nextCol = (col + 1) % n;    // Wrap around if we go off the right

            if (magicSquare[nextRow][nextCol] != 0) {
                row = (row + 1) % n; // Move down one row if the next cell is already filled
            } else {
                row = nextRow;
                col = nextCol;
            }
        }

        // Print the magic square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", magicSquare[i][j]); // Adjust formatting for larger numbers
            }
            System.out.println();
        }


        // (Optional) Verify and print the magic sum
        int magicSum = n * (n * n + 1) / 2;
        System.out.println("\nMagic Sum: " + magicSum); 

    }
}
