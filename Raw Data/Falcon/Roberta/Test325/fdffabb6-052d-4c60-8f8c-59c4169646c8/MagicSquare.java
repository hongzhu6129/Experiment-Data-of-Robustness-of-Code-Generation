public class MagicSquare {

    public static void main(String[] args) {
        int n = 7; // Example: Generate a 7x7 magic square.  Change this value to generate other sizes (odd numbers only).
        if (n % 2 == 0) {
            System.out.println("Magic squares can only be generated for odd orders.");
            return;
        }

        int[][] magicSquare = generateMagicSquare(n);

        // Print the magic square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", magicSquare[i][j]); // Adjust formatting as needed
            }
            System.out.println();
        }

        System.out.println("Magic Constant: " + (n * (n * n + 1) / 2)); 
    }

    public static int[][] generateMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];

        int num = 1;
        int i = n / 2;
        int j = n - 1;

        while (num <= n * n) {
            if (i == -1 && j == n) { // Condition 4 (wrap around diagonally)
                j = n - 2;
                i = 0;
            } else {
                if (j == n) // Condition 1 (column wrap-around)
                    j = 0;
                if (i < 0) // Condition 2 (row wrap-around)
                    i = n - 1;
            }

            if (magicSquare[i][j] != 0) { // Condition 3 (move down)
                j -= 2;
                i++;
                continue;
            } else
                magicSquare[i][j] = num++; // Place the number

            i--;
            j++;
        }

        return magicSquare;
    }
}
